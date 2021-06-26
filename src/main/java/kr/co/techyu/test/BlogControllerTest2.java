package kr.co.techyu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogControllerTest2 {

	@RequestMapping("/")
	public String main() {
		return "index.html";
	}
}
