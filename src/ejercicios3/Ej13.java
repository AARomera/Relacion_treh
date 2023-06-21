/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 13.Algoritmo que pida un número natural y determine si es primo o no.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num1 = teclado.nextInt();
		boolean primo=true;
		for (int i = 2; i<=Math.sqrt(num1) && primo; i++) {
			if (num1%i==0) {
				primo=false;
			}
		} 
		if (primo)System.out.println("Es primo.");
		else System.out.println("No es primo.");
		teclado.close();
	}

}
