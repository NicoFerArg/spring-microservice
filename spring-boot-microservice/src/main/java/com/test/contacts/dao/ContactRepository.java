package com.test.contacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.contacts.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
