package ar.educacionit.universidad.repository.search;

import java.util.List;

import ar.com.educacionit.entities.AddressBook;

public interface ISearch {

	public List<AddressBook> execute(List<AddressBook> sourceList);
}
