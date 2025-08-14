package springmvc.controller;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.commons.CommonsMultipartFile;



@Controller
public class uploadController {

	@RequestMapping("/upload")
	public String form() {
		return "upload";
	}
	
	@RequestMapping(path = "/uploadImage", method = RequestMethod.POST)
	public String uploadimage(@RequestParam("img") CommonsMultipartFile file, HttpSession s,Model m) {
	    System.out.println("File Size: " + file.getSize());
	    System.out.println("Content Type: " + file.getContentType());
	    System.out.println("Field Name: " + file.getName());
	    System.out.println("Original Filename: " + file.getOriginalFilename());
       String path=s.getServletContext().getRealPath("/")+"WEB-INF/resources/images/"+file.getOriginalFilename();
       System.out.println(path);
       byte[] data =file.getBytes();
       //write the data 
       try {
      FileOutputStream fos=new FileOutputStream(path);
      fos.write(data);
      fos.close();
      System.out.println("file uploaded");
      
      
      //after uploading pass to second page
      m.addAttribute("filename", file.getOriginalFilename());
       }catch(IOException e) {
    	   System.out.println("file not uploaded");   
       }
	    return "imageShown";
	}

	
	
	
}
