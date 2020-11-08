package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int l2=0, l3=0, l4=0;
		
		String l1="";
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 001 - Programacion Java Seleccion Multiple       !");
		System.out.println("____________________________________________________________________");

		
		
		
		System.out.println("Ingrese su nombre");
		l1= in.nextLine();
		
		System.out.println("¿En qué semestre esta?");
		System.out.println("[1] Entre 1 a 3 semestres ");
		System.out.println("[2] Entre 4 a 7 semestres ");
		System.out.println("[3] Entre 8 a 10 semestres ");
		l3= in.nextInt();
		
		System.out.println("¿Qué carrera está cursando");
		System.out.println("[1] Economia ");
		System.out.println("[2] Administración ");
		System.out.println("[3] Ciencias ");

		l4= in.nextInt();
		
		
	switch (l3)
	{
	case 1:
	{
		switch (l4)
		{
		case 1:
		{
			System.out.println("Usted," + l1 +", estudiante de Economia debera pagar: $" + 1500);
			break;
		}
		case 2:
		{
			System.out.println("Usted," + l1 +", estudiante de Administración debera pagar: $" + 2000);
			break;
		}	
		case 3:
		{
			System.out.println("Usted," + l1 +", estudiante de Ciencias debera pagar: $" + 1800);
			break;
		}
		
		}
		break;
	}
	
	case 2:
	{
		switch (l4)
		{
		case 1:
		{
			System.out.println("Usted," + l1 +", estudiante de Economia debera pagar: $" + 2220);
			break;
		}
		case 2:
		{
			System.out.println("Usted," + l1 +", estudiante de Administración debera pagar: $" + 4000);
			break;
		}	
		case 3:
		{
			System.out.println("Usted," + l1 +", estudiante de Ciencias debera pagar: $" + 5000);
			break;
		}
		
		}
		break;
	}
		
	case 3:
	{
		switch (l4)
		{
		case 1:
		{
			System.out.println("Usted," + l1 +", estudiante de Economia debera pagar: $" + 3000);
			break;
		}
		case 2:
		{
			System.out.println("Usted," + l1 +", estudiante de Administración debera pagar: $" + 6000);
			break;
		}	
		case 3:
		{
			System.out.println("Usted," + l1 +", estudiante de Ciencias debera pagar: $" + 7000);
			break;
		}
		
		}
		break;
	}
	case 0:
	{
	System.out.println("no existe");
	break;}
	
	
	}
	
	
	
	
	}

}