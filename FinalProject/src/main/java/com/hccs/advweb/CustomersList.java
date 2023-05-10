package com.hccs.advweb;

import java.util.ArrayList;

public class CustomersList {

	private static ArrayList<Customer> customersList = null;
	
	public static ArrayList<Customer> getCustomersList() {
		//if ((customersList == null) && (customersList.size() == 0)) {
			customersList = new ArrayList<Customer>();
			customersList.add(new Customer(1, "Caleb", "Jones"));
			customersList.add(new Customer(2, "Aida", "Turner"));
			customersList.add(new Customer(3, "Alex", "Davis"));
			customersList.add(new Customer(4, "Meba", "Travis"));
		//}
		System.out.println("Customer List ---->"+customersList);
		return customersList;
	}
	public static void setCustomersList(ArrayList<Customer> customersList) {
		customersList = customersList;
	}

	

}
