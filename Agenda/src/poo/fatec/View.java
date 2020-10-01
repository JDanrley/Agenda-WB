package poo.fatec;

import java.util.Scanner;

public class View {
	
	static Scanner reader = new Scanner(System.in);
	
	public static Site registerSites() {
		System.out.print("Digite o nome da unidade: ");
		String siteName = reader.nextLine();
		return new Site(siteName, Company.sites.size() + 1);
	}
	
	
	public static Site siteSelection() {
		System.out.print("Selecione o site pelo ID");
		int option = reader.nextInt();
		return Company.sites.get(option - 1);
	}

	
	public static int siteOptions() {
		System.out.println("\n*********************");
		System.out.println("Selecione a op��o desejada:");
		System.out.println("1. Cadastrar cliente");
		System.out.println("2. Editar cliente");
		System.out.println("3. Excluir cliente");
		System.out.println("4. Listar clientes");
		System.out.println("5. Relat�rios (outras listagens)");
		System.out.println("6. Sair da agenda");
		System.out.println("*********************\n");
		System.out.print("Selecione a sua op��o: ");
		int option = reader.nextInt();
		return option;
		//Service.optionsManager(option, selectedSite);
	}
	

	public static int menuAfterOperation() {
		System.out.println("Deseja realizar outra a��o?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Selecione sua op��o: ");
		int option = reader.nextInt();
		return option;
	}
	

	public static Customer inputCustomer(Site selectedSite) {
		reader.nextLine();
		System.out.print("Insira o nome do cliente: ");
		String nome = reader.nextLine();
		System.out.print("Insira o telefone do cliente: ");
		String telefone = reader.nextLine();
		System.out.print("Insira o sexo do cliente (M/F): ");
		String sexo = reader.nextLine();

		return new Customer(nome, telefone, sexo, selectedSite.customers.size());
	}
	
	public static int editedCustomerMenu(Site selectedSite) {
		System.out.println("Selecione o cliente que deseja editar, de acordo com o ID: ");
		selectedSite.listCustomers();
		System.out.print("ID selecionado: ");
		int option = reader.nextInt();
		reader.reset();
		return option;
	}
	
	
	public static int deleteCustomerMenu(Site selectedSite) {
		System.out.println("Selecione o cliente que deseja remover, de acordo com o ID");
		selectedSite.listCustomers();
		System.out.print("ID selecionado: ");
		int option = reader.nextInt();
		reader.reset();
		return option;
	}
	
	public static int selectReport(Site selectedSite){
		System.out.println("\n*********************");
		System.out.println("Selecione qual relat�rio voc� deseja extrair");
		System.out.println("1. Idade m�dia do p�blico por idade.");
		System.out.println("2. Idade m�dia do p�blico por g�nero.");
		System.out.println("3. Servi�o mais procurado.");
		System.out.println("4. Servi�o mais procurado por g�nero.");
		System.out.println("*********************\n");
		int option = reader.nextInt();
		reader.reset();
		return option;
	}
	
	public static void pause() {
		System.out.println("Tecle ENTER para continuar...");
		reader.nextLine();
	}
}

