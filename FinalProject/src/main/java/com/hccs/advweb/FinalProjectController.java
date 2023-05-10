package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FinalProjectController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String WelcomeMessaging(ModelMap model) {
	    model.addAttribute("Home page");
	    return "index"; // view
	}
	
	
	@RequestMapping(value = "/customerslist", method = RequestMethod.GET)
	public ModelAndView viewStudentList() {
		System.out.println("Customers list");
	    ArrayList<Customer> customersList = CustomersList.getCustomersList();
	    // ModelAndView (<<viewName>>,<model name>>, <<object name>>)
	    return new ModelAndView("customerslist","customersList", customersList);
	}

}
