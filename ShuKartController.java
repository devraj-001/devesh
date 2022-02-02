package com.shu.kart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/api")
public class ShuKartController {

	@Autowired
	private UserRepository repo; 
	
	@GetMapping("/shukart")
	public String ShuKart()
	{
		return "index";
	}
	
	@GetMapping("/shukart/signup")
	public String viewSignup(Model model)
	{
		model.addAttribute("user", new User());
		return "sign2";
	}
	
	@PostMapping("/shukart/registered")
	public String viewRegistered(User user)
	{
		
		
		repo.save(user);
		return "registered";
	}
	
	@GetMapping("/shukart/login")
	public String viewLogin(User user)
	{
		return "login";
	}
	
	@PostMapping("/shukart/home")
	public String viewHomepage()
	{
		return "Homepage";
	}
	
	@GetMapping("/shukart/list")
	public String viewList(Model model)
	{
		
		List<User> listusers = repo.findAll();
		model.addAttribute("listusers", listusers);
		return "users";
		
	}

}
