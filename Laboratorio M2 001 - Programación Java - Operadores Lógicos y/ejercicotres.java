package co.edu.campusucc;

import java.util.Scanner;

public class ejercicotres {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int l1=0, l2=0, k=0;
		
		System.out.println("¿La tierra es redonda?");
		System.out.println("[0]Para no");
		System.out.println("[1]Para si");
		l1= in.nextInt();
		
		System.out.println("¿Simón Bolivar liberto Panama?");
		System.out.println("[0]Para no");
		System.out.println("[1]Para si");
		l2= in.nextInt();
		
		k = l1 & l2;
		System.out.println("El valor de lariable k es :" + k);

		if (k==0)
			System.out.println("El valor de lariable k es falso");
		else 
			System.out.println("El valor de lariable k es verdadero");
		
		
	}

}
