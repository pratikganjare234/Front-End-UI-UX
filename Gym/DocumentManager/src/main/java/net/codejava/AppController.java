package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController 
{
	@GetMapping("/home")
	public String viewHomePage()
	{
		return "home";
	}
	

}
//https://www.youtube.com/watch?v=ryRQ6qXLLYM