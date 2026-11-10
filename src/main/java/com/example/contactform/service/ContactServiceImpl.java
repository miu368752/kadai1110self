package com.example.contactform.service;

import org.springframework.stereotype.Service;

import com.example.contactform.entity.Contact;
import com.example.contactform.repository.ContactRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

	private final  ContactRepository repository;
	
	@Override
	public void add(Contact contact) {
		repository.add(contact);
	}

}
