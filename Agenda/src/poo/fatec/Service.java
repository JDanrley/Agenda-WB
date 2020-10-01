package poo.fatec;

public class Service {
		
	public static void createSite() {
		Site registeredSite = View.registerSites();
		Company.createSite(registeredSite);
		System.out.println("Site registrado com sucesso");
		View.pause();
		optionsManager(registeredSite);
	}
	
	
	public static void optionsManager(Site selectedSite) {
		int option = View.siteOptions();
		switch (option) {
		  case 1:
			  createCustomer(selectedSite);
			  break;
		  case 2:
			  editCustomer(selectedSite);
			  break;
		  case 3:
			  deleteCustomer(selectedSite);
			  break;
		  case 4:
			  System.out.println("Listagem de clientes do site " + selectedSite.name);
			  selectedSite.listCustomers();
			  View.pause();
			  optionsManager(selectedSite);
			  break;
		}
	
	}
	
	
	public static void createCustomer(Site selectedSite) {
		selectedSite.customers.add(View.inputCustomer(selectedSite));
		System.out.println("Cliente criado com sucesso;");
		View.pause();
		optionsManager(selectedSite);
	}
	
	
	public static void editCustomer(Site selectedSite) {
		int option = View.editedCustomerMenu(selectedSite);
		selectedSite.customers.remove(option);
		selectedSite.customers.add(option, View.inputCustomer(selectedSite));
		System.out.println("Cliente editado com sucesso");
		optionsManager(selectedSite);
	}
	
	
	public static void deleteCustomer(Site selectedSite) {
		int option = View.deleteCustomerMenu(selectedSite);
		selectedSite.customers.remove(option);
		System.out.println("Cliente removido com sucesso");
	}
	
	
	
	
	
	
	
	
	/* 
	public static void createCustomer2(Site selectedSite) {
		
		if(customer.name.length() == 0) {
			if(customer.phone.length() == 0) {
				System.out.println("Preencha o nome e o endereço.");
				View.inputCustomer(selectedSite);
			}
		}
		else if (customer.gender.toUpperCase() != "M" && customer.gender.toUpperCase() != "F") {
			System.out.println("Insira valores válidos para o gênero (M/F)");
			View.inputCustomer(selectedSite);
		}
		else {
			selectedSite.addCustomer(customer);
			System.out.println("Cliente cadastrado com sucesso na loja" + selectedSite);
			
		}
	}
	
	
	public static void createCustomer(Customer customer, Site site) {
		if (customer.isValid()) {
			site.customers.add(customer);
			System.out.println("Cliente cadastrado com sucesso.");
		}
		else {
			System.out.println("Os dados preenchidos não são válidos, preencha novamente");
			View.inputCustomer(site);
		}
		
		
	}
	*/
	

}
