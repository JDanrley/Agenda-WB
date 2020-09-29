package poo.fatec;

import java.util.ArrayList;
import java.util.List;


public class Company {
	
	public List<Site> sites = new ArrayList<>();
	
	public void createSite(Site insertedSite) {
		sites.add(insertedSite);
	}
	
	@Override
	public String toString() {
		String lista = "";
		for(Site site: sites) {
			lista += site;
		}
	}
	
}
