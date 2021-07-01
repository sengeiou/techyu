package kr.co.techyu.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogControllerTest {


	@Autowired
    private TestSevice testSevice;
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>XXXX hellow XXXX</h1>";
	}
	@GetMapping("/test/memberList")
	public String memberList(Model model, MemberModel dto, @RequestParam Map<String, Object> param) {
		
		HashMap<String, Object> paramMap =  new HashMap<String, Object>();
		paramMap.put("EMAIL", dto.getEmail());
		
		List<MemberModel> memberList = testSevice.memberList(paramMap);
		model.addAttribute("memberList", memberList);
		
		return "/WEB-INF/views/index.jsp";
	}

	@GetMapping("/test/memberList1")
	public String memberList1(Model model, MemberModel dto, @RequestParam Map<String, Object> param) {
		
		//return "/WEB-INF/views/static/index";
		return "index";
	}
	
}
