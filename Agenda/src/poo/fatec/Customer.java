package poo.fatec;

public class Customer {
	
	public String name;
	public String telefone;
	public String gender;
	private int id;
	
	public Customer(String name, String telefone, String gender) {
		this.name = name;
		this.telefone = 
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	private boolean isThisGenderValid(Customer customer) {
		if (customer.gender.toUpperCase() == "M" || customer.gender.toUpperCase() == "F") {
			return true;
		}
		return false;
	}
	
	public boolean isValid() {
		if (isThisGenderValid(this)){
			if (this.name.length() > 0) {
				return true;
			}
		}
		return false;
	}
	
}
