package com.login.daoImpl;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.login.dao.CatagoryI;
import com.login.model.Catagory;

@Repository
public class CatagoryImpl implements CatagoryI 
{
	@Autowired
	 SessionFactory sessionFactory;

	private static List<Catagory> catagories = new ArrayList<>();
	
	static {
		Catagory catagory = new Catagory();
		
		//for 1st catagory
		catagory.setId(1);
		catagory.setName("Mobile");
		catagory.setDescription("nokia");
		catagory.setImageURL("k.jpg");
		//catagory.setActive(true);
		
		catagories.add(catagory);
		 catagory = new Catagory();
		//for 1st catagory
		catagory.setId(2);
		catagory.setName("Laptop");
		catagory.setDescription("dell");
		catagory.setImageURL("kb.jpg");
		//catagory.setActive(true);
				
		catagories.add(catagory);
	}
	
	@Override
	public List<Catagory> list() {
		// TODO Auto-generated method stub
		return catagories;
	}

	@Override
	public Catagory get(int id) {
		
		//enhance for loop
		for(Catagory catagory : catagories)
		{
			if(catagory.getId() == id)
				return catagory;
		}
		//if nothing onthat catagory id it return null
		return null;
	}

	@Override
	@Transactional
	public boolean add(Catagory catagory) {
		try {
			
			//add catagory to dataase
			//sessionFactory.getCurrentSession().persist(catagory);
			sessionFactory.openSession().saveOrUpdate(catagory);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

}
