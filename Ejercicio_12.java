package co.edu.campusucc;

public class Ejercicio_12 {

	public static void main(String[] args) {
		int contador=0, noch=0, contador2=0, noch2=0, contador3=0, noch3=0;
	
		while(contador < 10) {
			
			contador= contador + 3;
			contador= contador - 2;
			
			noch= noch + 1;
			
			
		}
		while (contador2<10 ) {
			contador2= contador2 + 4;
			contador2= contador2 - 3;
		
		noch2= noch2 + 1;
		
		}
		
		while (contador3<10 ) {
			contador3= contador3 + 4;
			contador3= contador3 - 2;
		
		noch3= noch3 + 1;
		
		}
		System.out.println("el caracol tarda "+ noch + " dias en subir un total de: "+ contador +" metros");
		System.out.println("el cienpies tarda "+ noch2 + " dias en subir un total de: "+ contador2 +" metros");
		System.out.println("el gusano tarda "+ noch3 + " en subir un total de: "+ contador3 +" metros");
		
		if (noch<noch2 & noch<noch3) {
			System.out.println("el caracol sube primero");
			System.exit(0);
		}
		if (noch2<noch & noch2<noch3) {
			System.out.println("el cienpies sube primero");
			System.exit(0);
		}
		if (noch3<noch2 & noch3<noch) {
			System.out.println("el gusano sube primero");
			System.exit(0);
		}
	}

}
