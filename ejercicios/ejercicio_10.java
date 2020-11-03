package co.edu.campusucc;
import java.util.Scanner;
public class ejercicio_10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int l2=0, l3=0, l4=0, l5=0,  salariofinal=0, seguros=0, l6=0, l7=0, l8=0, horasex=0, salariof;
		
		String l1="";
		
		System.out.println("Ingrese el nombre del empleado");
		l1= in.nextLine();
		
		System.out.println("ingrese el valor de una hora trabajada");
		l3= in.nextInt();
		
		System.out.println("Ingrese las horas trabajadas");
		l4= in.nextInt();
		
		
		l6=l4*l3;
		
		if (l4>48) {
			
	
			
			horasex=(l6*20)/100;
			salariofinal= horasex +l6;
			
			
			System.out.println("Empleado: " +l1);
			System.out.println("horas trabajadas: $" + l6);
			System.out.println("horas extra: $" + horasex);
			System.out.println("el salario total es de: $" + salariofinal);
			
			System.exit(0);
		
		}
			
			
		
		
		System.out.println("Empleado: " +l1);
		System.out.println("el salario total es de: $" + l6);

	}

}
