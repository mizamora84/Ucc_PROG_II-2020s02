package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int l2=0, l3=0,  salariofinal=0 ;
		
		String l1="";
		
		System.out.println("Ingrese el nombre del empleado");
		l1= in.nextLine();
		
		System.out.println("ingrese el salario del empleado");
		l2= in.nextInt();
		
		System.out.println("ingrese el segundo descuento del salario");
		l3= in.nextInt();
		
		
		salariofinal = l2-l3;
		
		System.out.println("El salario final de " + l1);
		System.out.println("es de: $" + salariofinal);

	}

}
