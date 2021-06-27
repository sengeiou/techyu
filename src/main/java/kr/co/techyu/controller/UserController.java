package kr.co.techyu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.techyu.model.KakaoProfile;
import kr.co.techyu.model.OAuthToken;
import kr.co.techyu.model.User;
import kr.co.techyu.service.TechyuService;
import kr.co.techyu.test.MemberModel;

@Controller // View를 리턴하겠다.
public class UserController {


	@Autowired
    private TechyuService techyuSevice;
	

	@GetMapping({"","/"})
	public String index() {
		//머스테치 기본폴더가 잡힘 ( src/main/resources/ )
		//뷰리졸버 설정 : templates (prefix) , mustache ( suffix )
		return "index";
	}
	
	@GetMapping("/auth/kakao/callback")
	public @ResponseBody String kakaoCallback(String code) {// Data를 리턴해주는 컨트롤러 함수
		
		// POST 방식으로 key=value 데이터를 요청( 카카오쪽으로 )
		// Retrofit2
		// OkHttp
		// RestTemplate
		RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-type","application/x-www-form-urlencoded;charset=utf-8");
		
		// HttpBody 오브젝트
		MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
		params.add("grant_type", "authorization_code");
		params.add("client_id", "c58b54fca1d8d2cbe11a1ed619fb1c9e");
		params.add("redirect_uri", "http://localhost:8082/auth/kakao/callback");
		params.add("code", code);
				
		// HttpHeader와 HttpBody를 하나의 오브젝트에 담기
		HttpEntity<MultiValueMap<String,String>> kakaoTokenRequest = 
				new HttpEntity<>(params,headers);
		
		// Http요청하기 - POST방식으로 - 그리고 response 변수의 응답받음. 
		ResponseEntity<String> response = rt.exchange(
				"https://kauth.kakao.com/oauth/token",
				HttpMethod.POST,
				kakaoTokenRequest,
				String.class
				
				);
		
		// Gson, Json Simple, ObjectMapper : JSON --> JAVA OBJECT
		ObjectMapper objectMapper = new ObjectMapper();
		OAuthToken oauthToken = null;
		try {
			oauthToken = objectMapper.readValue(response.getBody(), OAuthToken.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		System.out.println("카카오 엑세스 토큰 : "+ oauthToken.getAccess_token());

		RestTemplate rt2 = new RestTemplate();
		HttpHeaders headers2 = new HttpHeaders();
		headers2.add("Authorization","Bearer "+oauthToken.getAccess_token());
		headers2.add("Content-type","application/x-www-form-urlencoded;charset=utf-8");
		
		// HttpHeader와 HttpBody를 하나의 오브젝트에 담기
		HttpEntity<MultiValueMap<String,String>> kakaoProfileRequest2 = 
				new HttpEntity<>(headers2);// Param은 안넘기고 헤더만 넘긴다. 
		
		// Http 사용자 정보 요청하기 - POST방식으로 - 그리고 response 변수의 응답받음. 
		ResponseEntity<String> response2 = rt2.exchange(
				"https://kapi.kakao.com/v2/user/me",
				HttpMethod.POST,
				kakaoProfileRequest2,
				String.class
				
				);
		
// JSON으로 부터 자바 POJO를 만드는 사이트 : 	https://www.jsonschema2pojo.org/
		// Gson, Json Simple, ObjectMapper : JSON --> JAVA OBJECT
		ObjectMapper objectMapper2 = new ObjectMapper();
		KakaoProfile kakoProfile = null;
		try {
			kakoProfile = objectMapper.readValue(response2.getBody(), KakaoProfile.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		// User 오브젝트에 넣어야함. ( username, password, email )  
		System.out.println("카카오 아이디(번호) : "+ kakoProfile.getId());
		System.out.println("카카오 이메일 : "+ kakoProfile.getKakao_account().getEmail());
		
		System.out.println("techYu 서버에 저장할  유저네임 : "+ kakoProfile.getKakao_account().getEmail()+"_"+kakoProfile.getId());
		System.out.println("techYu 서버에 저장할  이메일 : "+ kakoProfile.getKakao_account().getEmail());
		
		UUID garbagePassword = UUID.randomUUID();
		System.out.println("techYu 서버에 저장할 패스워드  : "+ garbagePassword);
		
		// 회원가입 로직을 추가해야함. 
		
		
		// http://json.parser.online.fr/
		//return "카카오 톡큰 요청완료 토큰요청에 대한 응답 : "+ response;
		//return response.getBody();
		return response2.getBody();
	}
	
	@GetMapping("/user/memberList")
	public String memberList(Model model, MemberModel dto, @RequestParam Map<String, Object> param) {
		
		HashMap<String, Object> paramMap =  new HashMap<String, Object>();
		paramMap.put("EMAIL", dto.getEmail());

		List<User> memberList = techyuSevice.memberList(paramMap);
		model.addAttribute("memberList", memberList);
		
		return "/WEB-INF/views/index.jsp";
	}

}
