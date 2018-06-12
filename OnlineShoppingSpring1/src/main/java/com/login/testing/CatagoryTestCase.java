package com.login.testing;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.login.dao.CatagoryI;
import com.login.model.Catagory;


public class CatagoryTestCase 
{
	private static AnnotationConfigApplicationContext context;
	
	private static CatagoryI catagoryI;
	
	private Catagory catagory;
		
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
			//to scan all packages
		context.scan("com.login");
		context.refresh();
		
		catagoryI =(CatagoryI) context.getBean("catagoryI");
	}
	@Test
	public void testaddcatagory() 
	{
		catagory = new Catagory();
		
		//not adding id because it kept it as auto increment
		catagory.setName("Mobile");
		catagory.setDescription("nokia");
		catagory.setImageURL("k.jpg");
		
		assertEquals("sucessfuly added..", true , catagoryI.add(catagory));
	}
}
