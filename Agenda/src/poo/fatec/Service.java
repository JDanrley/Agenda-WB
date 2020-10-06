package poo.fatec;
import java.io.*;

public class Service implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void updateState() throws Exception {
		Company.readState();
		selectSite();
	}
	public static void createSite() throws Exception {
		Site registeredSite = View.registerSites();
		Company.createSite(registeredSite);
		Company.saveState();
		System.out.println("Site registrado com sucesso");
		View.pause();
		optionsManager(registeredSite);
	}
	
	public static void selectSite() throws Exception{
		Site selectedSite = View.siteSelection();
		optionsManager(selectedSite);
	}
	
	
	public static void optionsManager(Site selectedSite) throws Exception {
		String option = View.siteOptions();
		switch (option) {
		  case "1":
			  createCustomer(selectedSite);
			  break;
		  case "2":
			  editCustomer(selectedSite);
			  break;
		  case "3":
			  deleteCustomer(selectedSite);
			  break;
		  case "4":
			  listCustomersAlphabetically(selectedSite);
			  break;
		  case "5":
			  listCustomerByGender(selectedSite);
		  case "6":
			  inputProductToCustomer(selectedSite);
		  default:
			  System.out.println("Valor inválido. Você será redirecionado ao menu novamente.");
			  View.pause();
			  optionsManager(selectedSite);
		}
		
	}
	
	public static void createCustomer(Site selectedSite) throws Exception {
		selectedSite.customers.add(View.inputCustomer(selectedSite));
		Company.saveState();
		System.out.println("Cliente criado com sucesso;");
		View.pause();
		optionsManager(selectedSite);
	}
	
	
	public static void editCustomer(Site selectedSite) throws Exception {
		int option = View.editedCustomerMenu(selectedSite);
		selectedSite.customers.remove(option);
		selectedSite.customers.add(option, View.inputCustomer(selectedSite));
		Company.saveState();
		System.out.println("Cliente editado com sucesso");
		View.pause();
		optionsManager(selectedSite);
	}
	
	
	public static void deleteCustomer(Site selectedSite) throws Exception {
		int option = View.deleteCustomerMenu(selectedSite);
		selectedSite.deleteCustomer(option);
		Company.saveState();
		System.out.println("Cliente removido com sucesso");
		View.pause();
		optionsManager(selectedSite);
	}
	
	public static void listCustomersAlphabetically(Site selectedSite) throws Exception {
		  System.out.println("Listagem de clientes do site " + selectedSite.name + " em ordem alfabética");
		  selectedSite.listCustomersAlphabetically();
		  View.pause();
		  optionsManager(selectedSite);
	}
	
	public static void listCustomerByGender(Site selectedSite) throws Exception {
		String selectedGender = View.listCustomerByGender(selectedSite);
		System.out.println("Listagem dos clientes do sexo " + selectedGender + "\n");
		for (Customer customer: selectedSite.customers) {
			if (customer.gender.toUpperCase().equals(selectedGender.toUpperCase()) && customer.isDeleted == false) {
				System.out.println(customer);
			}
		}
		View.pause();
		optionsManager(selectedSite);
	}
	
	public static void inputProductToCustomer(Site selectedSite) throws Exception{
		int customerIndex = View.selectCustomer(selectedSite);
		int inputProduct = View.selectProduct(selectedSite);
		selectedSite.customers.get(customerIndex).addProduct(inputProduct);
		System.out.println("Produto/Serviço cadastrado com sucesso");
		View.pause();
		optionsManager(selectedSite);
	}
		
}

