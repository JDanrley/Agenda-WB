package poo.fatec;
import java.util.Scanner;


public class View {
	
	private Service controle = new Service();
	private Scanner reader;
	
	public static void selectSites() {
		System.out.println("Selecione a loja");
	}
	
	public static void main() {
		System.out.println("Bem vindo à agenda WB."
				+ "Selecione a sua ação de acordo com o menu abaixo: ");
	}
	
	public static void optionsStart() {
		System.out.println("\n*********************");
		System.out.println("Selecione a opção desejada:");
		System.out.println("1. Cadastrar cliente");
		System.out.println("2. Editar cliente");
		System.out.println("3. Excluir cliente");
		System.out.println("4. Listar cliente");
		System.out.println("5. Idade média do público por idade");
		System.out.println("6. Tchau");
		System.out.println("*********************\n");
	}

	public void inputCustomer(Site site) {
		reader = new Scanner(System.in);
		System.out.println("Insira o nome do cliente: ");
		String nome = reader.nextLine();
		System.out.println("Insira o telefone do cliente: ");
		String telefone = reader.nextLine();
		System.out.println("Insira o sexo do cliente (M/F): ");
		String sexo = reader.nextLine();
		Customer customer = new Customer(nome, telefone, sexo);
		reader.close();
		controle.createCustomer(customer, site);
	}


	
	public static void chooseReport(){
		System.out.println("\n*********************");
		System.out.println("Selecione qual relatório você deseja extrair");
		System.out.println("1. Idade média do público por idade.");
		System.out.println("2. Idade média do público por gênero.");
		System.out.println("3. Serviço mais procurado.");
		System.out.println("4. Serviço mais procurado por gênero.");
		System.out.println("*********************\n");
	}

}
