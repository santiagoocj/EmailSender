package com.example.demo.service;

import com.example.demo.dto.EmailDTO;

public interface EmailService {
	
	public boolean sendEmail(EmailDTO emailDTO);

}
