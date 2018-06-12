package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.login.dao.CatagoryI;
import com.login.model.Catagory;

@Controller
public class testcontroller 
{
	@Autowired
	private CatagoryI catagoryI;
	
	
	@RequestMapping(value= { "/" , "/page" , "/home"})
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "home");
		modelAndView.addObject("catagories", catagoryI.list());
		modelAndView.addObject("userclick", true);
		return modelAndView;
	}
	
	@RequestMapping(value= { "/about"})
	public ModelAndView about()
	{
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "about");
		modelAndView.addObject("catagories", catagoryI.list());
		modelAndView.addObject("userclickabout", true);
		return modelAndView;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "contact");
		modelAndView.addObject("catagories", catagoryI.list());
		modelAndView.addObject("userclickcontact", true);
		return modelAndView;
	}
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showproducts()
	{
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "all products");
		modelAndView.addObject("catagories", catagoryI.list());
		modelAndView.addObject("userclickallproducts", true);
		return modelAndView;
	}
	
	@RequestMapping(value="/show/catagory/{id}/products")
	public ModelAndView showproductscatagory(@PathVariable("id") int id)
	{
		ModelAndView modelAndView = new ModelAndView("page");
		//catagory dao to fetch single catagory
		
		Catagory catagory=null;
		catagory= catagoryI.get(id);
		
		
		modelAndView.addObject("title", catagory.getName());
		
		//passing the list of catagories
		modelAndView.addObject("catagories", catagoryI.list());
		//passing the single catagory object
		modelAndView.addObject("catagory", catagory	);
		
		
		modelAndView.addObject("userclickcatagoryproducts", true);
		return modelAndView;
	}
}
