/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 4.Algoritmo  que  escriba  los  números  impares  comprendidos  entre  dos  enteros introducidos por el usuario. 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número inicial: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduzca el número final");
		int num2 = teclado.nextInt();
		int inicio = Math.min(num1, num2);
		int fin = Math.max(num1, num2);
		
		for (int i = inicio; i<=fin; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		} teclado.close();
	}
		
}


