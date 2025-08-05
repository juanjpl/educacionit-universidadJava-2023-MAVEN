package ar.educacionit.universidad.repository.search.implementation;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.entities.AddressBook;
import ar.educacionit.universidad.repository.search.ISearch;

public class FirstAndLastNameSearch implements ISearch {

	private String firstName;
	private String lastName;
	
	
	


	@Override
	public List<AddressBook> execute(List<AddressBook> sourceList) {
		
		List<AddressBook> filteredList = new ArrayList<>();
	
		for (AddressBook addressBook : sourceList) {
			
			if(addressBook.getName().toLowerCase().contains(this.firstName.toLowerCase()) && addressBook.getName().contains(lastName)) {
				filteredList.add(addressBook);
				
			}
		}
		return null;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("First Name is null");
		}
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("Last Name is null");
		}
		this.lastName = lastName;
	}

}
