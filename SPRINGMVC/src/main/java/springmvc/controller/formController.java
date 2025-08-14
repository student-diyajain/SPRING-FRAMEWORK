package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;
import springmvc.model.Student;



@Controller
public class formController {

	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
    //3rd way-
	@RequestMapping(path="/processform",method =RequestMethod.POST)
	public String handleData(@ModelAttribute Student user,Model model) 
	{
		System.out.println(user);//to check Student k object m data aagya
		System.out.println("form works!");
		return "show";
	}
	
	//to show common line-
	@ModelAttribute
	public void CommonLines(Model model) {
		LocalDateTime localDateTime=LocalDateTime.now();
		model.addAttribute("first","Form Data:");
		model.addAttribute("second",localDateTime);
	}
	
	
	
	
	
	
	
//	//1st way-
//	@RequestMapping(path="/processform",method =RequestMethod.POST)
//	public String handleData(HttpServletRequest request,Model model) {
//		//form se aaya hua data
//		String uname=(String) request.getParameter("name");
//		String uemail=(String)request.getParameter("email");
//		String upassword=(String)request.getParameter("password");
//		String ugender=(String)request.getParameter("gender");
//		String ucourse=(String)request.getParameter("courses");
//	
//		//show page pr bhejenge
//		model.addAttribute("name",uname);
//		model.addAttribute("email",uemail);
//		model.addAttribute("password",upassword);
//		model.addAttribute("gender",ugender);
//		model.addAttribute("course",ucourse);
//		System.out.println("form works!");
//		return "show";
//	}
	
	
//	//2nd way-
//	@RequestMapping(path="/processform",method =RequestMethod.POST)
//	public String handleData(
//			@RequestParam("name" ) String uname,
//			@RequestParam(name="email" , required=false) String uemail,
//			@RequestParam("password") String upassword,
//			@RequestParam("gender") String ugender,
//			@RequestParam("courses") String ucourse,
//			Model model) 
//	{
//	Student user=new Student();
//	user.setName(uname);
//	user.setEmail(uemail);
//	user.setPassword(upassword);
//	user.setCourses(ucourse);
//	user.setGender(ugender);
//	
//		//show page pr bhejenge
//		model.addAttribute("user",user);
//		System.out.println("form works!");
//		return "show";
//	}
	
	
	
}
