package co.edu.campusucc;

import java.util.Scanner;

public class Ejecicio_2 {

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
		
		System.out.println("¿Dondé esta ubicado?");
		System.out.println("[1] Norte ");
		System.out.println("[2] Sur ");
		System.out.println("[3] Oriente ");
		System.out.println("[4] Occidente ");

		l3= in.nextInt();
		
	
		
	switch (l3)
	{
	case 1:
	{
		System.out.println("Marque deacuerdo al tamaño de su telefono");
		System.out.println("[1] Pequeño ");
		System.out.println("[2] Mediano ");
		System.out.println("[3] Grande ");

		l4= in.nextInt();
		
		switch (l4)
		{
		case 1:
		{
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 500);
	
			l4= in.nextInt();
			break;
		}
		case 2:
		{
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 250);
			break;
		}	
		case 3:
		{
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 100);
			break;
		}
		
		}
		break;
	}
	
	case 2:
	{
		System.out.println("Marque deacuerdo al tamaño de su telefono");
		System.out.println("[1] Pequeño ");
		System.out.println("[2] Mediano ");
		
		l4= in.nextInt();
		switch (l4)
		{
		case 1:
		{
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 400);
			break;
		}
		case 2:
		{
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 200);
			break;
		}	
		
		
		}
		break;
	}
		
	case 3:
			
	{
		System.out.println("Marque deacuerdo al tamaño de su telefono");
		System.out.println("[1] Grande ");
		
		l4= in.nextInt();
		
		switch (l4)
		{
		case 1:
		{
			if(l4!=1)
				System.out.println("Error");
			else
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 100);
			
			break;
		}
		
		
	}
		break;

	}
	
	case 4:
	{
		System.out.println("Marque deacuerdo al tamaño de su telefono");
		System.out.println("[1] Pequeño ");
		System.out.println("[2] Grande ");
		
		l4= in.nextInt();
		
		switch (l4)
		{
		case 1:
		{
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 300);
			break;
		}
		case 2:
		{
			System.out.println("Señor (a) " + l1 +", el costo por minuto es de: $" + 200);
			break;
		}	
		
		
		}
		
		break;}
	
	
	}
	
	
	
	
	}



	}


