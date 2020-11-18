package co.edu.campusucc;

import java.util.Scanner;

import javax.swing.*;
public class Capicua {
 
    public static void main(String[] args) {
    	
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 002 - Programacion Java Ciclos                   !");
		System.out.println("____________________________________________________________________");
		
        
    	int num,inv,aux,digito;
		Scanner in = new Scanner (System.in);

    	
    	   System.out.print("Ingrese un numero ");

           num = in.nextInt();

    	inv=0;
        
    	aux=num;
        
    	while (aux>0){
           
    		digito=aux%10;
            
    		inv=inv*10+digito;
           
    		aux=aux/10;
        }
       
    	if (num==inv) {
           System.out.println("El numero es capicua");
        }
        
    	
    	else {
    		 System.out.println( "El numero no es capicua");
        }
    }
}
