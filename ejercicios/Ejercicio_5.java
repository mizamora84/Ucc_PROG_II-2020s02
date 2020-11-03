package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int l1=0, l3=0,  l2=0 ;
		
		
		
		System.out.println("Ingrese el precio del producto");
		l1= in.nextInt();
		
		System.out.println("Cuanto dinero entrego el cliente");
		l2= in.nextInt();
		
		l3 = l2-l1;
		
		System.out.println("Lo que le debo al cliente es: $" + l3);
			
		
		
		
		
		
		
		
	


	}

}
