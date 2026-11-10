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
	/*--- レビュー登録画面表示リクエスト ---*/
	@GetMapping("/contact")
	public String showForm(@ModelAttribute ContactForm form) {
		return "contactForm";
	}
	

@PostMapping("/contact")
public String contactReview(
		@Validated @ModelAttribute ContactForm form,
		BindingResult result) {

	// 入力エラーがある場合には レビュー登録画面に戻す
	if (result.hasErrors()) {
		return "contactForm";
	}



Contact c = new Contact();
c.setName(form.getName());
c.setMail(form.getMail());
c.setPhone(form.getPhone());
c.setTitle(form.getTitle());
c.setComment(form.getComment());
service.add(c);

// 正常な場合に レビュー登録確認画面に 遷移する
return "contactResult";
}

}







