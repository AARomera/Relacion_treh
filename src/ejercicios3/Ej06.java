/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 6.Algoritmo que calcule el factorial de un número entero introducido por el usuario.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número: ");
		int num1 = teclado.nextInt();
		int suma= 1;
		for (int i = 1; i <= num1; i++) {
			suma=suma*i;
		}
		System.out.printf("El factorial de los números por debajo de %d es %d",num1,suma);
		teclado.close();
	}
}
