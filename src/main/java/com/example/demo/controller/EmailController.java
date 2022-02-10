package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.EmailDTO;
import com.example.demo.service.EmailServiceImpl;

@Controller
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	public EmailServiceImpl emailServiceImpl;
	
	@PostMapping("/send")
	public String sendEmail(@RequestBody EmailDTO emailDTO) {
		if(emailServiceImpl.sendEmail(emailDTO)) {
			return "funciono";
		}
		return "no funciono";
	}

}
