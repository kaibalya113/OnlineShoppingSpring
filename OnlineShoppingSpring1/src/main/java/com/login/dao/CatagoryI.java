package com.login.dao;

import java.util.List;

import com.login.model.Catagory;

public interface CatagoryI 
{
	boolean add(Catagory catagory);
	List<Catagory> list();
	Catagory get(int id);
}
