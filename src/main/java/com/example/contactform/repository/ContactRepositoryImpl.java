package com.example.contactform.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.contactform.entity.Contact;

@Repository
public class ContactRepositoryImpl implements ContactRepository {
	private final List<Contact> list = new ArrayList<>();
	@Override
	public void add(Contact contact) {
		list.add(contact);
		
	}

}
