package co.edu.campusucc;

import java.util.Scanner;
public class Ejercicio_de_liquidación {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int l2=0, l3=0, l4=0;
		
		String l1="";
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 001 - Programacion Java Seleccion Multiple       !");
		System.out.println("____________________________________________________________________");

		
		
		System.out.println("Ingrese el nombre del empleado");
		l1= in.nextLine();
		
		System.out.println("ingrese la categoria");
		l3= in.nextInt();
		
		System.out.println("ingrese el sueldo del empleado");
		l4= in.nextInt();
		
		
	switch (l3)
	{
	case 1:
	{
		l2 = l4*15/100;
		l2= l4+l2;
		System.out.println("el salario total de " + l1 +" es de: $"+ l2);
		break;
	}
	
	case 2:
	{
		l2 = l4*10/100;
		l2= l4+l2;
		System.out.println("el salario total de " + l1 +" es de: $"+ l2);
		break;
	}
		
	case 3:
	 {l2 = l4*8/100;
		l2= l4+l2;
		System.out.println("el salario total de " + l1 +" es de: $"+ l2);
		break;}
	 
	case 4:
	{l2 = l4*7/100;
	l2= l4+l2;
	System.out.println("el salario total de " + l1 +" es de: $"+ l2);
	break;}
	
	case 0:
	{
	System.out.println("La categoria no existe");
	break;}
	
	
	}
	
	
	
	
	}

}