package ar.com.educacionit.console;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import java.util.UUID;

import ar.com.educacionit.entities.AddressBook;
import ar.educacionit.universidad.repository.parse.implementation.AddressBookFileParser;
import ar.educacionit.universidad.repository.parse.implementation.FileDelimiterEnum;
import ar.educacionit.universidad.repository.search.ISearch;
import ar.educacionit.universidad.repository.search.implementation.FirstAndLastNameSearch;

public class App {
	public static void main(String[] args) throws Exception {
		// System.out.println(UUID.randomUUID());
		
		System.out.println("Parametros: "+ Arrays.toString(args) );

		if(args.length == 0) {
			System.err.println("Debe espedicificar el path del archivo.");
			System.exit(0);
		}
	
		// 1 Cargar el archivo cvs

		AddressBookFileParser parse = new AddressBookFileParser("c:\\" , FileDelimiterEnum.PUNTOYCOMA);

		List<AddressBook> listado = parse.parse();

		Scanner keyboard = new Scanner(System.in);

		// 2 mostrar el menu al usuario

		Integer op = null;

		do {
			Menu.mostrarMenu();
			op = Menu.getOp(keyboard);
		} while (op < 1 && op > 4);

		ISearch search = null;

		// Evaluo en base a la accion, luego ejecuto
		switch (op) {
		case 1:
			System.out.println("Ingrese First Name: ");
			String firstName = keyboard.next();

			System.out.println("Ingrese Last Name: ");
			String lastName = keyboard.next();

			search = new FirstAndLastNameSearch();
			((FirstAndLastNameSearch) search).setFirstName(firstName);
			((FirstAndLastNameSearch) search).setLastName(lastName);
			break;

		}

		List<AddressBook> filteredList = search.execute(listado);

		// 3 buscar en base a la opcion

		// 4 mostrar recursivamente

		// 5 preguntar si continua

		// 6 fin
	}
}
