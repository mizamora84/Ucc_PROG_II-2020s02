package co.edu.campusucc;

import java.util.Scanner;

public class primos_con_scanner {

	public static void main(String[] args) {
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 002 - Programacion Java Ciclos                   !");
		System.out.println("____________________________________________________________________");

			
			 
			 
				Scanner in = new Scanner (System.in);
				System.out.println("Ingrese un numero");
				int numero= in.nextInt();

				boolean primo = verifica( numero );
				
				System.out.println("  ¿El numero " + numero + " es primo? " + primo      );
	
		}
		
	        public static boolean verifica(int numero){ 
	        	boolean esprimo = false; 
	        	int numerosDivi = 0;
	        	int numerosDiviPri = 2;
	        	
	        	for(int i=1; i<=numero; i++)
	        		if(numero % i ==0)
	        			numerosDivi++;
	        	
	        	if(numerosDivi == numerosDiviPri)
	        		esprimo = true; 
	        	
	        	return esprimo;
	}

}
