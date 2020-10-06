package poo.fatec;

import java.io.*;

public class Main implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		
		System.out.println("-------------------------------------------");
		System.out.println("Seja bem vindo(a) à agenda de clientes WB.");
		System.out.println("-------------------------------------------");
		
		
		try {
			Service.updateState();
			
		}
		catch (Exception error) {
			System.out.println("Nenhum valor anterior foi encontrado. Um cadastro de unidades será necessário");
			Service.createSite();
		}	
		
	}

}
