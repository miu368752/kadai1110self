package com.example.contactform.entity;

import lombok.Data;

// データを保存するためのクラス
@Data
public class Contact {

	private String name;
	private String mail;
	private String phone;
	private String title;
	private String comment;

}
