package poo.fatec;

import java.util.ArrayList;
import java.util.List;

public class Site {
	String address;
	int id;
	
	List<Service> services = new ArrayList<>();
	List<Customer> customers = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Site:" + address + "ID: " + id;
	}
	
	public boolean equals(Site other) {
		return this.id == other.id;
	}
	
}
