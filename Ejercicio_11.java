package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int  l1=0, l2=0;
		
		System.out.println("ingrese el numero para determinar su valor absoluto [numero positivos tambien]");
		l1= in.nextInt();
		
		if (l1<0) {
			
			l2=l1*-1;
			
			System.out.println("El valor absoluto del numero ingresado es: " +l2);
			
			System.exit(0);
		}
		
		System.out.println("El valor absoluto del numero ingresado es: " +l1);
		
		
	}

}
