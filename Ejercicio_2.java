package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_dos {

public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int l1=0, l2=0, suma=0,  resta=0, producto=0;
		float  promedio=0;
		
		System.out.println("ingrese el primer numero");
		l1= in.nextInt();
		
		System.out.println("ingrese el segundo numero");
		l2= in.nextInt();
		
		suma = l1 + l2;
		
		resta = l1 - l2;
		
		producto = l1 * l2;
		
		promedio = (l1 + l2)/2;
		
		System.out.println("El resultado de la suma entre los dos numeros es:" + suma);
		System.out.println("El resultado de la resta entre los dos numeros es:" + resta);
		System.out.println("El producto de la multilicación entre los dos numeros es:" + producto);
		System.out.println("El promedio de los dos numeros es:" + promedio);
	}

}

