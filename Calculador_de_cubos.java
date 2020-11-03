package co.edu.campusucc;

import java.util.Scanner;

public class Calculador_de_cubos {

	public static void main(String[] args) {
		System.out.println("_______________________________________");
		System.out.println("|<3               Hola              <3|");
		System.out.println("|<3        soy michael zamora       <3|");
		System.out.println("|<3          Laboratorio m2         <3|");
		System.out.println("_______________________________________");
		Scanner in = new Scanner (System.in);
		int l1=0, l2=0, dos=0, cubo=0;
		System.out.println("Bienvenido a la calculadora de Cubos y Cuadrados");
		
		System.out.println("[0]Para calcular el cuadrado");
		System.out.println("[1]Para calcular el cubo");
		
		l2= in.nextInt();
		
		
		
		System.out.println("Ingrese el numero");
		l1= in.nextInt();
		dos = l1*l1;
		cubo = l1*l1*l1;
		
		
		if (l2==0)
			
		System.out.println(" el cuadrado es:"+ dos);
			
		
		
		else
		
		
			System.out.println("el cubo es:"+ cubo);
		
	}

}
