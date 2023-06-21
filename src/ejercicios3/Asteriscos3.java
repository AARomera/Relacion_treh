/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Asteriscos3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el número de filas del triangulo: ");
		int num1 = teclado.nextInt();
		int num2 = num1;
		
		for (int i = 1; i<=num1; i++) {
			for (int j = 1; j<=num2;j++) {
				System.out.print(" ");
				
			}
			for (int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
			num2--;
		}
		teclado.close();
	}

}
