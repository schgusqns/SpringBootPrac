package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Spring에게 해당 Class가 Controller의 역할을 한다고 명시하기 위해 사용하는 Annotation
public class MyController {

//요청 들어온 URL의 요청과 Annotation value값이 일치하면 해당 클래스나 메소드가 실행된다. 
//클래스 안의 메서드와 클래스에 적용가능하며, Class단위에 사용하면 하위 메서드에 모두 적용가능
//메소드에 적용되면 해당 메서드에 지정한 방식으로 URL을 처리
//@RequestMapping(value="")

//@ResponseBody는 메서드에서 리턴되는 값이 view로 출력되지 않고 HTTP Response Body에 직접 쓰여지게 된다.
//return시에 JSON, xml과 같은 데이터를 return 한다.
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		
		return "JSP in Gradle";
	}
	
	@RequestMapping("/test1") // localhost:8081/test1
	public String test1(){
		
		return "test1"; //실제 호출될 /WEB-INF/views/test1.jsp
	}
	
	@RequestMapping("/test2") // localhost:8081/test2
	public String test2(){
		
		return "test2"; //실제 호출될 /WEB-INF/views/sub/test2.jsp
	}
	
}
