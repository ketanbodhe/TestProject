package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.servicei.StudentServiceI;

@Controller
public class HomeController {
	@Autowired
	StudentServiceI si;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String preRegister()
	{
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String saveData(@ModelAttribute Student s)
	{
		Student stu = si.saveData(s);
		if(stu!=null)
		{
			return "login";
		}
		else
		{
			return "registration";
		}
	}
	
	@RequestMapping("/login")
	public String Login(@RequestParam("uname") String un, @RequestParam("password") String ps, Model m)
	{
		Student stu = si.loginCheck(un,ps);
		Iterable<Student> list = si.displayAll();
		if(stu!=null)
		{
			System.out.println(un);
			m.addAttribute("data", list);
			return "success";
		}
		else
		{
			return "login";
		}
		
	}

}
