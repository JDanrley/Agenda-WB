package poo.fatec;

public class Main {
	public static void main(String[] args) {	
		System.out.println("-------------------------------------------");
		System.out.println("Seja bem vindo(a) à agenda de clientes WB.");
		System.out.println("-------------------------------------------");
		
		View.pause();
		if (Company.thereAreSitesRegistered()) {
			System.out.println("Escolha o seu site, por ID, conforme lista abaixo: ");
			Service.createSite();
		}
		else {
			System.out.println("Nenhuma loja foi cadastrada ainda, registre uma unidade da empresa:");
			Service.createSite();
		}
		
	}

}
