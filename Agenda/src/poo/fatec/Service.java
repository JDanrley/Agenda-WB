package poo.fatec;

public class Service {
	
	private View view = new View();
	
	public void static optionToAction(int option) {
		int a = 0;
	}
	
	public void createCustomer(Customer customer, Site site) {
		if (customer.isValid()) {
			site.customers.add(customer);
			System.out.println("Cliente cadastrado com sucesso.");
			View.optionsStart();
		}
		else {
			System.out.println("Os dados preenchidos n�o s�o v�lidos, preencha novamente");
			view.inputCustomer(site);
		}
		
		
	}

}
