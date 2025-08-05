package ar.educacionit.universidad.repository.parse.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ar.com.educacionit.entities.AddressBook;
import ar.educacionit.universidad.repository.parse.IParser;

public class AddressBookFileParser implements IParser<List<AddressBook>> {

	@Override
	public List<AddressBook> parse() {
		// Aca deberia leer el archivo linea por linea e ir creando cada AddresBook
		//Lueg agregarlo a la lista
		
		List<AddressBook> list = new ArrayList<>();
		
		UUID uuid = UUID.randomUUID();
		
		for(int i = 0 ; i<50; i++) {
		list.add(new AddressBook(uuid,"Name-"+Math.random(),Math.random()+"@email.com"));
		}
		
		
		return list;
		
	}

	
}
