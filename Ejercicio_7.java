package co.edu.campusucc;
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int t=2, paginas=0, l1=0, tiempot=0, paginastotale=0, l2=0;
		
		//el tiempo que toma escribir una pagina es de dos minutos
		
		System.out.println("¿Qué quiere calcular? (Para decidir precione [1] o [0])");
		System.out.println("Pagínas escritas en un rango de tiempo [1]");
		System.out.println("Tiempo en que se tarda escribir un numero x de pagínas [0]");
		l1= in.nextInt();
		
		if (l1==1) {
			System.out.println("Ingresar El tiempo a calcular. (Ingresar el tiempo en minutos.)");
			l2= in.nextInt();
			
			paginastotale=l2/2;
			
			System.out.println("El total de paginas que escribio es de: " + paginastotale);
			
			System.exit(0);
		}

		
		if (l1==0) {
			System.out.println("Ingresar el numero paginas, para calcular cuanto tardaron es ser escritas.");
			l2= in.nextInt();
		
			tiempot=l2*2;
		
			System.out.println("El tiempo en que se escribieron las paginas fue de:  " + tiempot);
			System.out.println("El tiempo es dado en minutos");
			
			System.exit(0);
		
		}
			
		
	}

}
