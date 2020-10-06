package poo.fatec;
import java.io.*;

public class Product implements Serializable {
	
	String name;
	String gender;
	
	public Product(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name + " - Sexo: " + gender + " ID: ";
	}
	
}
