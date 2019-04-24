package com.example.tapestry.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

import com.example.tapestry.tutorial.data.Honorific;

@Entity
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonVisual
    public Long id;
	
	@Validate("required")
	public Honorific honorific;
	@Validate("required")
    public String firstName;
	@Validate("required")
    public String lastName;
	@Validate("required")
    public String street1;
	@Validate("required")
    public String street2;
	@Validate("required")
    public String city;
	@Validate("required")
    public String state;
	@Validate("required, regexp")
    public String zip;
	@Validate("required")
    public String email;
	@Validate("required")
    public String phone;
}
