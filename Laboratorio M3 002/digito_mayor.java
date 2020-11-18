package co.edu.campusucc;

import java.util.Scanner;

public class digito_mayor {

    public static void main(String[] args) {
		int mayor=0, numero=0;
		Scanner in = new Scanner (System.in);
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 002 - Programacion Java Ciclos                   !");
		System.out.println("____________________________________________________________________");

    	
 	   System.out.print("Ingrese un numero ");

        mayor= in.nextInt();
			
		        
		        if(numero>0){
		            mayor = numero%10;
		            numero = numero/10;
		            while(numero>0){
		                int dig = numero%10;
		                if(dig > mayor){
		                    mayor = dig;
		              
		                        }
		                    }
		                }
		                numero = numero/10;
		            
		            System.out.println("El Mayor es "+mayor);
		        

	}
	}


