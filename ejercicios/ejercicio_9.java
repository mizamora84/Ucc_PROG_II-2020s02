package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio_9 {

	public static void main(String[] args) {
	

		Scanner in = new Scanner (System.in);

        int numero, sumDig = 0;

        System.out.print("Ingrese un numero ");

        numero = in.nextInt();

;       int aux=numero;

        while (numero != 0) {

            sumDig = sumDig + (numero % 10);

            numero = numero / 10;

        }

        System.out.println("La suma de los digitos de " + aux + " es: " + sumDig);	

	}
}
