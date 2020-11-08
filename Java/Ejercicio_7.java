package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int l2=0, l3=0, l4=0, va=0, be=0;
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 001 - Programacion Java Seleccion Multiple       !");
		System.out.println("____________________________________________________________________");

		
		
		
		
		System.out.println("Ingrese el tipo de servicio");
		System.out.println("[1] Corriente");
		System.out.println("[2] Ejecutivo");

		l3= in.nextInt();
		
		System.out.println("Ingrese la ruta");
		System.out.println("[1] Ruta 1");
		System.out.println("[2] Ruta 2");
		System.out.println("[3] Ruta 3");
		System.out.println("[4] Ruta 4");
		l2= in.nextInt();
	
		
	switch (l3)
	{
	case 1:
	{
		switch (l3)
		{
			case 1:
			{
				l4 =200*30/100;
				va=200*10/100;
				be=(200-va)-l4;
				System.out.println("Valor del servicio :            $200");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
			
			case 2:
			{
				l4 =200*25/100;
				va=200*15/100;
				be=(200-va)-l4;
				System.out.println("Valor del servicio :            $200");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
				
			case 3:
			{
				l4 =200*20/100;
				va=200*20/100;
				be=(200-va)-l4;
				System.out.println("Valor del servicio :            $200");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
			
			case 4:
			{
				l4 =200*22/100;
				va=200*20/100;
				be=(200-va)-l4;
				System.out.println("Valor del servicio :            $200");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
				
		
		}
		
	}
	
	
	case 2: 
	{
		switch (l3)
		{
			case 1:
			{
				l4 =300*30/100;
				va=300*10/100;
				be=(300-va)-l4;
				System.out.println("Valor del servicio :            $300");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
			
			case 2:
			{
				l4 =300*25/100;
				va=300*15/100;
				be=(300-va)-l4;
				System.out.println("Valor del servicio :            $300");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
				
			case 3:
			{
				l4 =300*20/100;
				va=300*20/100;
				be=(300-va)-l4;
				System.out.println("Valor del servicio :            $300");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
				
			case 4:
			{
				l4 =300*22/100;
				va=300*20/100;
				be=(300-va)-l4;
				System.out.println("Valor del servicio :            $300");
				System.out.println("Para el mantenimiento          -$" + va);
				System.out.println("Para el salario del conductor: -$" + l4);
				System.out.println("                                _________");
				System.out.println("Total para utilidades:          $"+  be );
				break;}
		
		}
		
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
	}
