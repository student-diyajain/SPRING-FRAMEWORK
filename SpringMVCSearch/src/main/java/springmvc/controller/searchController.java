package springmvc.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class searchController {

	
	@RequestMapping({"/","/home"})
	public String home() {
		return "index";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	
	
	
	@RequestMapping(path="/searchData",method =RequestMethod.POST)
	public RedirectView handleData(@RequestParam("message") String message) 
	{
		System.out.println(message);
		
		
		
		
          //Integer.parseInt(message);    
		String url="http://www.google.com/search?q="+message;
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(url);
	    System.out.println("form works!");
		return redirectView;
	}
	
	

}
