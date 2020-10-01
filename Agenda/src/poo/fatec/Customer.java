package poo.fatec;

public class Customer {
	
	public String name;
	public String phone;
	public String gender;
	private int id;
	
	public Customer(String name, String phone, String gender, int id) {
		this.name = name;
		this.phone = phone; 
		this.gender = gender;
		this.id = id;
	}
	
	public int getId() {
		return id;
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
	
	@Override
	public String toString() {
		return "Cliente ID: " + id + "\nNome: " + name + "\nTelefone: " + phone + "\n";
	}
	
}
