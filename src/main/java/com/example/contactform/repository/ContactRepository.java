package com.example.contactform.repository;

import com.example.contactform.entity.Contact;

// Repositoryのインターフェース
public interface ContactRepository {

	// 登録処理
	void add(Contact contact);

}
