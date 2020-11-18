package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio_inversor_de_numeros {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 002 - Programacion Java Ciclos                   !");
		System.out.println("____________________________________________________________________");
		
		System.out.println("Ingrese el numero que quiere invertir");
		int numero= in.nextInt();
		
        
	
        
        do {
            System.out.println(numero%10);
            numero/=10;
        } while (numero!=0);
         
            
           
        
    

            

        
    }
    
}
	
		
	