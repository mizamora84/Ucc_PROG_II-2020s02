package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int l2=0, l3=0, l4=0, l5=0,  salariofinal=0, seguros=0, l6=0, l7=0, l8=0, horasex=0, salariof;
		
		String l1="";
		
		System.out.println("Ingrese el nombre del empleado");
		l1= in.nextLine();

		System.out.println("Ingrese el numero de dias trabajados");
		l2= in.nextInt();
		
		System.out.println("ingrese el valor de una hora trabajada");
		l3= in.nextInt();
		
		System.out.println("Ingrese las horas trabajadas");
		l4= in.nextInt();
		
		System.out.println("Ingrese las horas extras trabajadas");
		l5= in.nextInt();
		
		l6=l4*l3;
		l7=l5*l3;
		l8=l7/2;
		
	
		horasex= l8+l7;
		salariofinal = horasex+l6;
		seguros= (salariofinal * 12)/100;
		salariof= salariofinal-seguros;
		
		System.out.println("Empleado: " +l1);
		System.out.println("horas trabajadas: $" + l6);
		System.out.println("horas extra: $" + horasex);
		System.out.println("el salario total es de: $" + salariofinal);
		System.out.println("seguro social  - $" + seguros);
		System.out.println("El salario final de " + salariof);
		
	}

}
