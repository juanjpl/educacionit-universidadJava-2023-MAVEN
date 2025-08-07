package ar.com.educacionit.console.file;

import java.io.File;
import java.util.Arrays;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear un file a un archivo
		String path = "C:\\";

		//File file = new File(path + "archivoEntrada.txt");
		File file = new File(path );
		
		//saber si es un archivo
		boolean exist = file.exists();
		boolean isAFile = file.isFile();
		boolean isADirectory = file.isDirectory();
		
		System.out.println(isAFile);
		System.out.println(isADirectory);
		System.out.println(exist);
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		
		//archivos dentro de la carpeta o directory
		
		System.out.println(Arrays.toString(file.list()));
		
	}
	
	public static void recorrer(File[] files) {
		
		if(files.length == 0) 
			return;
	
		for(File aux : files) {
			recorrer(aux);
		}
		
	}
	
	public static void recorrer(File file) {
		//1 existe ?
		if(file == null || !file.exists()) {
			System.out.println("No existe el File.");
			return;
		}
		
		//2 caso base para recursividad
		
		if(file.isDirectory()) {
			System.out.println(file.getName());
			return;
		}
		
		if(file.isDirectory()) {
			File[] filesInDirectory =  file.listFiles();
			recorrer(filesInDirectory);
		}
		
		
	}

}
