package ar.educacionit.universidad.repository.parse.implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


import ar.com.educacionit.entities.AddressBook;
import ar.educacionit.universidad.repository.parse.IParser;

public class AddressBookFileParser implements IParser<List<AddressBook>> {

	private File file;
	private FileDelimiterEnum delimiter;

	// value object
	public AddressBookFileParser(String path , FileDelimiterEnum delimiter) {

		// validaciones
		if (path == null || path.trim().length() == 0) {
			throw new IllegalArgumentException("Path del File");
		}

		file = new File(path);

		if (!file.exists()) {
			throw new IllegalArgumentException("File no existe.");
		}

		if (file.isDirectory()) {
			throw new IllegalArgumentException("File es un directorio");
		}

		// mas validaciones
		if(delimiter == null) {
			throw new IllegalArgumentException("Delimitador no especificado.");
		}
		
		this.delimiter = delimiter;
	}

	@Override
	public List<AddressBook> parse() throws Exception {
		// Aca deberia leer el archivo linea por linea e ir creando cada AddresBook
		// Lueg agregarlo a la lista

		List<AddressBook> list = new ArrayList<>();

		// abrir el archivo(texto) --- no puedo leer binarios ( zip, mkv, jpg)
		FileReader reader = new FileReader(file);

		// Usar un bugger
		BufferedReader br = new BufferedReader(reader);

		String readLine = null;
		
		//la primera linea es de los titulos
		
		String[] titulos= br.readLine().split(this.delimiter.getDelimiter());

		// leer lina por liena
		while ((readLine = br.readLine()) != null) {

			String[] values = readLine.split(this.delimiter.getDelimiter());
			//[dato1,dato2,dato3]
			
			//Validaciones
			if(values.length != titulos.length) {
				AddressBook ab = new AddressBook(values[0], values[1], values[2]);
				list.add(ab);
			}else {
				System.err.println(readLine);
			}
		}

		br.close();

		return list;

	}

}
