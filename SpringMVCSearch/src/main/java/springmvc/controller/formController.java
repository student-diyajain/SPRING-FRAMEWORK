package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class formController {
	@RequestMapping("/complex")
	public String form() {
//		String str=null;
//		System.out.println(str.length());
		return "complex";
	}
	
	
	
	
//	@RequestMapping(path="/handleForm",method = RequestMethod.POST)
//	public String handleform(@RequestParam("name") String name,
//			@RequestParam("id") int id) {
//		System.out.println(name);
//		System.out.println(id);
//		return "success";
//	}
	
	@RequestMapping(path="/handleForm",method = RequestMethod.POST)
	public String handleform(@ModelAttribute("user") Student student,BindingResult result) {
		if(result.hasErrors()) {
			return "complex";
		}
		System.out.println(student);
		System.out.println("it works");
		return "success";
	}
	
	
}
