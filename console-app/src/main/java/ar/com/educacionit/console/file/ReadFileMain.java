package ar.com.educacionit.console.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {

	public static void main(String[] args) throws IOException {

		// crear un file a un archivo
		String path = "C:\\address-book.csv";

		// File file = new File(path + "archivoEntrada.txt");

		File file = new File(path);

		// abrir el archivo(texto) --- no puedo leer binarios ( zip, mkv, jpg)
		FileReader reader = new FileReader(file);

		// Usar un bugger
		BufferedReader br = new BufferedReader(reader);

		String readLine = null;

		// leer lina por liena
		while ((readLine = br.readLine()) != null) {

			// en readline tengo la liena leida
			System.out.println(readLine);
		}

		br.close();
	}

}
