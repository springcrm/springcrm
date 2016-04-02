package springcrm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springcrm.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/user.do")
	public String list()
	{
		System.out.println("HELLO");
		userService.insertUser();
		return null;
		
	}
	
}
