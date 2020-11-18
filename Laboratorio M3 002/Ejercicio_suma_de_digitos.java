package co.edu.campusucc;
import java.util.Scanner;
public class Ejercicio_suma_de_digitos {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 002 - Programacion Java Ciclos                   !");
		System.out.println("____________________________________________________________________");
		

        int numero, sumDig = 0;

        System.out.print("Ingrese un numero ");

        numero = in.nextInt();

        int aux=numero;

        while (numero != 0) {

            sumDig = sumDig + (numero % 10);

            numero = numero / 10;

        }

        System.out.println("La suma de los digitos de " + aux + " es: " + sumDig);	

	}


	}


