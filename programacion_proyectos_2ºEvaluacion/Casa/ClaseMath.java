package Casa;

import java.util.Scanner;

public class ClaseMath {

	public static void main(String[] args) {
		System.out.println("Esto es la clase math");
		System.out.println("Meto otro cambio");
		Scanner reader = new Scanner (System.in);
		System.out.print("dime un numero");
		double numero=reader.nextDouble();
		
		System.out.println(" ");//meto un salto de linea para separar las operaciones
		System.out.println("Las operaciones con la clase Math son: ");
		
		double raiz =Math.sqrt(numero);
		
		System.out.println("La raiz es: "+raiz);
		
		double base=numero;
		double exponente= 2;
		double potencia=Math.pow(numero, exponente);
		System.out.println("La potencia es: "+potencia);
		
		int redondeo= (int)Math.floor(raiz);/*redondeo hacia el menor numero siguiente*/
		System.out.println("el redondeo hacia el menor de su raiz es: "+redondeo);
		int redondeo1=(int) Math.ceil(raiz);/* redondeo hacia el mayor numero siguiente */
		System.out.println("el redondeo hacia el mayor de su raiz es: "+redondeo);
		
		double operacion=numero;/* Guardamos la variable numero en una nueva variable llamada operacion */
		double resultado= Math.PI * operacion;/* Multiplicamos el numero PI por la variable operacion */
		System.out.println("el numero PI * "+numero+" es: "+resultado);
	
		reader.close();
		}

}
