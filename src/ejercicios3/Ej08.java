/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 8.Algoritmo que escriba todos los divisores de un número entero introducido por el usuario
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número inicial: ");
		int num1 = teclado.nextInt();
		
		for (int i = 1; i<=num1; i++) {
			if (num1%i==0) {
				System.out.println(i);
			}
		} teclado.close();
	}

}
