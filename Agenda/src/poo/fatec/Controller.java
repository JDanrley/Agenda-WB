package poo.fatec;

import java.util.Scanner;

public class Controller {
	private Scanner reader;

	public Controller() {
		reader = new Scanner(System.in);
	}

	public synchronized int option() {
		int option = reader.nextInt();
		reader = reader.reset();
		return option;
	}

	public synchronized String text() {
		reader = new Scanner(System.in);
		String text = reader.nextLine();
		reader = reader.reset();
		return text;
	}

	@Override
	protected void finalize() throws Throwable {
		reader.close();
	}
}