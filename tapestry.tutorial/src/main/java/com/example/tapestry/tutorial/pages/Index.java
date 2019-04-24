package com.example.tapestry.tutorial.pages;


import org.apache.tapestry5.Block;
import org.apache.tapestry5.EventContext;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Log;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.HttpError;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.hibernate.Session;
import org.slf4j.Logger;

import com.example.tapestry.tutorial.entity.Address;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Start page of application tapestry.tutorial.
 */
public class Index
{   
	
	private final Random random = new Random(System.nanoTime());
	 
    @InjectPage
    private Guess guess;
    @Inject
    private Session session;
 
    @Log
    Object onActionFromStart()
    {
        int target = random.nextInt(10) + 1;
 
        guess.setup(target);
        return guess;
    }
	
    
    public List<Address> getAddresses()
    {
        return session.createCriteria(Address.class).list();
    }
	
}
