package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pathVariableController {

	
	@RequestMapping("/book/{id}/{name}")
	public String handler(@PathVariable("id") int uid,@PathVariable("name") String uname) {
		System.out.println(uid);
		System.out.println(uname);
		return "";
	}
	
	
	
}
