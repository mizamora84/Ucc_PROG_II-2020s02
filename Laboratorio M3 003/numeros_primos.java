package co.edu.campusucc;
import java.util.Random;
public class numeros_primos {

	public static void main(String[] args) {
	
		
		System.out.println("____________________________________________________________________");
		System.out.println("!                       Michael Steven Zamora                      !");
		System.out.println("!                   Herramientas computacionales                   !");
		System.out.println("!       Taller M3 003 - Programacion Java Numeros primos             !");
		System.out.println("____________________________________________________________________");

			
			 
			 
				Random random = new Random();
				int numero = random.nextInt(1000);
				boolean primo = verifica( numero );
				
				System.out.println("  El numero " + numero + " es primo? " + primo      );
	
		}
		
	        public static boolean verifica(int numero){ 
	        	boolean esprimo = false; 
	        	int numerosDivi = 0;
	        	int numerosDiviPri = 2;
	        	
	        	for(int i=1; i<=numero; i++)
	        		if(numero % i ==0)
	        			numerosDivi++;
	        	
	        	if(numerosDivi == numerosDiviPri)
	        		esprimo = true; 
	        	
	        	return esprimo;
	        	
	}
	}

	
	