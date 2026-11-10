package com.example.contactform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.contactform.entity.Contact;
import com.example.contactform.form.ContactForm;
import com.example.contactform.service.ContactService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ContactController {

	private final ContactService service;

	// お問い合わせ入力画面を表示する
	@GetMapping("/contact")
	public String showForm(@ModelAttribute ContactForm form) {
		return "contactForm";
	}

	// 送信ボタンが押されたときの処理
	@PostMapping("/contact")
	public String contactReview(
			@Validated @ModelAttribute ContactForm form,
			BindingResult result) {

		// 入力エラーがある場合は入力画面に戻す
		if (result.hasErrors()) {
			return "contactForm";
		}

		// Formの値をEntityに移して登録する
		Contact c = new Contact();
		c.setName(form.getName());
		c.setMail(form.getMail());
		c.setPhone(form.getPhone());
		c.setTitle(form.getTitle());
		c.setComment(form.getComment());
		service.add(c);

		// エラーがなければ完了画面に遷移する
		return "contactResult";
	}
}
