package com.example.contactform.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ContactController {
	
	/*--- レビュー登録画面表示リクエスト ---*/
	@GetMapping("/contact")
	public String showForm() {
		return "contactForm";
	}
	}

	





