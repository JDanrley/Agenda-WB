package poo.fatec;

import java.io.*;

public class Main implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		
		System.out.println("-------------------------------------------");
		System.out.println("Seja bem vindo(a) � agenda de clientes WB.");
		System.out.println("-------------------------------------------");
		Service.updateState();
		/*try {
			Service.updateState();
		}
		catch (Exception IOException) {
			System.out.println("Nenhum valor anterior foi encontrado. Um cadastro de unidades ser� necess�rio");
			Service.createSite();
		}	
	*/	
	}
	

}
