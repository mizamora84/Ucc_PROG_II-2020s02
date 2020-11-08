package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int l2=0, l3=0, l4=0, iva=0;
		
		String l1="";
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 001 - Programacion Java Seleccion Multiple       !");
		System.out.println("____________________________________________________________________");

		
		
		
		System.out.println("");
		l1= in.nextLine();
		
		System.out.println("Ingrese el tipo de producto");
		System.out.println("[1] Producto a ");
		System.out.println("[2] Producto b ");
		System.out.println("[3] Producto c ");

		l3= in.nextInt();
		
		System.out.println("Ingrese la cantidad");
		l2= in.nextInt();
	
		
	if  (l2<=501)
	{
		switch (l3)
		{
			case 1:
			{
				l4 =500*l2;
				iva=l4*7/100;
				System.out.println("Valor unitario: $800");
				System.out.println("Cantidad de unidades: "+ l2);
				System.out.println("Iva 7%: $" + iva);
				System.out.println("El total es de: $"+ l4+iva +" Iva incluido");
				break;}
			
			case 2:
			{
				l4 =800*l2;
				iva=l4*8/100;
				System.out.println("Valor unitario: $800");
				System.out.println("Cantidad de unidades: "+ l2);
				System.out.println("Iva 8%: $" + iva);
				System.out.println("El total es de: $"+ l4+iva +" Iva incluido");
				break;}
				
			case 3:
			{
				l4 =1000*l2;
				iva=l4*5/100;
				System.out.println("Valor unitario: $1000");
				System.out.println("Cantidad de unidades: "+ l2);
				System.out.println("Iva 5%: $" + iva);
				System.out.println("El total es de: $"+ l4+iva +" Iva incluido");
				break;}
				
		
		}
		
	}//fin if
	
	else 
	{
		switch (l3)
		{
			case 1:
			{
				l4 =1000*l2;
				iva=l4*9/100;
				System.out.println("Valor unitario: $1000");
				System.out.println("Cantidad de unidades: "+ l2);
				System.out.println("Iva 9%: $" + iva);
				System.out.println("El total es de: $"+ l4+iva +" Iva incluido");
				break;}
			
			case 2:
			{
				l4 =1400*l2;
				iva=l4*11/100;
				System.out.println("Valor unitario: $1400");
				System.out.println("Cantidad de unidades: "+ l2);
				System.out.println("Iva 11%: $" + iva);
				System.out.println("El total es de: $"+ l4+iva +" Iva incluido");
				break;}
				
			case 3:
			{
				l4 =1600*l2;
				iva=l4*10/100;
				System.out.println("Valor unitario: $1600");
				System.out.println("Cantidad de unidades: "+ l2);
				System.out.println("Iva 10%: $" + iva);
				System.out.println("El total es de: $"+ l4+iva +" Iva incluido");
				break;}
				
		
		}
		
	}//fin else
	
	
	
	
	
	
	
	
	
	}
}