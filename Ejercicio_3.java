package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		float l1=0, l2=0, l3=0, porctuno=(float) 0.3, porctdos=(float) 0.3, porcttres=(float) 0.4, not1=0, not2=0, not3=0,notf=0;
		  
		System.out.println("Las notas ingresadas deben estar comprendidas entre 0 y 10");
		System.out.println("ingrese la primera nota");
		l1= in.nextInt();
		if (l1>10)
			System.out.println("Error");
		if (l1<0)
			System.out.println("Error");
		
		
		System.out.println("ingrese la segunda nota");
		l2= in.nextInt();
		if(l2>10)
			System.out.println("Error");
		if(l2<0)
			System.out.println("Error");
		
		
		System.out.println("ingrese la segunda nota");
		l3= in.nextInt();
		
		if(l3>10)
			System.out.println("Error");
		
		if(l3<0)
			System.out.println("Error");
		
		
		not1 = l1 * porctuno;
		not2 = l2 * porctdos;
		not3 = l3 * porcttres;
		
		notf= not1 + not2 + not3;
		
	
		
		System.out.println("la nota final es:" + notf);

	}

}
