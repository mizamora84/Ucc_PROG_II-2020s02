package co.edu.campusucc;

public class Ejercicio_13 {

	public static void main(String[] args) {
		int contador=0, noch=0, contador2=0, noch2=0, contador3=0, noch3=0;
		
		//pinta
		while(contador < 1199 & noch < 1199) {
			
			contador= contador + 8;
	
			
			noch= noch + 12;
			
			
		}
		//niña
		while (contador2<10 ) {
			contador2= contador2 + 9;
		
		
		noch2= noch2 + 11;
		contador2 = contador2 + noch2;
		
		}
		
		//santamaria
		while (contador3<10 ) {
			contador3= contador3 + 10;
			
		
		noch3= noch3 + 8;
		
		contador3 = contador3 + noch3;
		
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
