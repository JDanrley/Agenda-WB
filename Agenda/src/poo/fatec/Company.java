package poo.fatec;

import java.util.ArrayList;

import java.util.List;


public class Company {
	
	public static List<Site> sites = new ArrayList<>();
	
	
	public static void createSite(Site insertedSite) {
		sites.add(insertedSite);
	}
	
	
	public static boolean thereAreSitesRegistered() {
		if (sites.size() == 0) {
			return false;
		}
		return true;
	}
	
	
	public static void listSites() {
		for (Site site: sites) {
			System.out.println(site);
		}
	}
}

