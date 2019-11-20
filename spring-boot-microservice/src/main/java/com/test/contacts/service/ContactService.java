package com.test.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.contacts.dao.ContactRepository;
import com.test.contacts.dto.Contact;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository dao;
	
	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}
}
