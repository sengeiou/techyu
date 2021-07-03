package kr.co.techyu.web.controller;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.techyu.web.dto.MemberDto;
import kr.co.techyu.web.model.KakaoProfile;
import kr.co.techyu.web.model.MemberModel;
import kr.co.techyu.web.model.OAuthToken;
import kr.co.techyu.web.model.User;
import kr.co.techyu.web.service.TechyuService;

@Controller // View를 리턴하겠다.
public class LoginController {


	@Autowired
    private TechyuService techyuSevice;
	

	@RequestMapping({"","/techyu/login"})
	public String showLogin() {
		//머스테치 기본폴더가 잡힘 ( src/main/resources/ )
		//뷰리졸버 설정 : templates (prefix) , mustache ( suffix )
		return "techyu/login";
	}

	@RequestMapping({"","/techyu/doJoin"})
	public String doJoin(Model model, @RequestParam Map<String,Object> param) {

//		Map<String, Object> rs = techyuService.join(param);
//		
//		String resultCode = (String) rs.get("resultCode");
//		
//		if( resultCode.startWidth("S-"))
		
		return "techyu/login";
	}


}
