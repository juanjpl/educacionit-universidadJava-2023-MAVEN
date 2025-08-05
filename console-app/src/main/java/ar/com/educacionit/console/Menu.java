package ar.com.educacionit.console;

import java.util.Scanner;

public class Menu {

	public static void mostrarMenu() {
			
		System.out.println(""
				+ "(1) Search By Name \r\n"
				+ "(2) Search By Email \r\n"
				+ "(3) Search by ID \r\n"
				+ "(4) List All");
	}
	
	public static Integer getOp(Scanner teclado) {
		Integer  op = null ;
		
		do {
			try {
				System.out.println("Choose Option:");
				op =  teclado.nextInt();
			} catch (Exception e){
				System.err.println("Invalid Operation");
			}
		}while(op == null);
		
		return op;
		
		
		
	}
}
