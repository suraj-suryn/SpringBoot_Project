package com.springboot.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.management.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
