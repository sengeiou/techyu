package kr.co.techyu.test;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BlogControllerTest3 implements WebMvcConfigurer{

	/*
	 * @RequestMapping("/") public String main() { return "index.html"; }
	 */
	
	@Override
	public void addResourceHandlers( final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
				.addResourceLocations("classpath:/templates/")
				.setCacheControl(CacheControl.maxAge(10,TimeUnit.MINUTES));
				
	}
}
