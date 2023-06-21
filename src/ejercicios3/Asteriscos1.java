/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Asteriscos1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el número de filas del triangulo: ");
		int num1 = teclado.nextInt();
		
		for (int i = 1; i<=num1; i++) {
			for (int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		teclado.close();
	}

}
