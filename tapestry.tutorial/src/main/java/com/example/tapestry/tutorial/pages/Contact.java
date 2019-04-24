package com.example.tapestry.tutorial.pages;

import javax.inject.Inject;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.hibernate.Session;

import com.example.tapestry.tutorial.entity.Address;

public class Contact
{
	@Property
	private Address address;
	
	@Inject
	private Session session;
	 
	@InjectPage
	private Index index;
	 
    @CommitAfter
    Object onSuccess()
    {
        session.persist(address);
 
        return index;
    }
}
