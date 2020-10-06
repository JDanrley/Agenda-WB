package poo.fatec;

import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class Company implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static List<Site> sites = new ArrayList<>();
	public static List<Product> products = new ArrayList<>();
	
	
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
	
	public static void saveState() throws Exception {
		FileOutputStream streamer = new FileOutputStream("sitesDatabase.txt");
		ObjectOutputStream writer = new ObjectOutputStream(streamer);
		writer.writeObject(sites);
		writer.close();
		System.out.println("Cadastros de clientes salvo com sucesso!");
	}
	
	public static void readState() throws IOException, ClassNotFoundException {
		FileInputStream streamer = new FileInputStream("sitesDatabase.txt");
		ObjectInputStream reader = new ObjectInputStream(streamer);
		sites = (List<Site>) reader.readObject();
		reader.close();
		System.out.println("Sites lidos com sucesso!");
	}
}

