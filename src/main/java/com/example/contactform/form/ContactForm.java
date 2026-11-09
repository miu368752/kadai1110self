package com.example.contactform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.Data;
@Data
public class ContactForm {
	@NotBlank(message="入力してください。")	
	private String name;

	@NotBlank( message="メールアドレスを入力してください。")
	@Email(message="正しい形式で入力してください")
	private String mail;
	
	@Pattern(regexp = "^[0-9]*$", message = "電話番号は数字のみで入力してください。")
	private String phone;

	@NotBlank(message="件名を入力してください。")
	private String title;

	@NotBlank(message="お問い合わせ内容を入力してください。")
	@Size(max=1000,  message="1000文字以内で入力してください。")
	private String comment;


}
