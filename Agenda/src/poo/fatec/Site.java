package poo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Site implements Serializable{
	String name;
	String address;
	int id;
	
	List<Customer> customers = new ArrayList<>();
	
	public Site(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void listCustomersAlphabetically() {
		Collections.sort(customers);
		for (Customer customer: customers) {
			if (customer.isDeleted == false) {
				System.out.println(customer);
			}
		}
	}
	
	
	public void addCustomer(Customer createdCustomer) {
		customers.add(createdCustomer);
	}

	@Override
	public String toString() {
		return "Site: " + name + "\nEndereço" + address + "\nID: " + id + "\n";
	}
	
	public boolean equals(Site other) {
		return this.id == other.id;
	}
	
}
