package co.edu.campusucc;
import java.util.Scanner;
public class ejemplocuatro {

	public static void main(String[] args) {
		
		System.out.println("_______________________________________");
		System.out.println("|<3               Hola              <3|");
		System.out.println("|<3        soy michael zamora       <3|");
		System.out.println("|<3          Laboratorio m2         <3|");
		System.out.println("_______________________________________");
	
		
		Scanner in = new Scanner (System.in);
		int l1=0, l2=0, k=0;
		
		System.out.println("¿Ingalterra es un pais suramericano?");
		System.out.println("[0]Para no");
		System.out.println("[1]Para si");
		l1= in.nextInt();
		
		System.out.println("¿Marie Currie intento el Radio?");
		System.out.println("[0]Para no");
		System.out.println("[1]Para si");
		l2= in.nextInt();
		
		k = l1 & l2;
		
		System.out.println("El valor de lariable k es:" + k);
		
		if (k==0)
			System.out.println("El valor de lariable k es falso");
		else 
			System.out.println("El valor de lariable k es verdadero");
	}

}
