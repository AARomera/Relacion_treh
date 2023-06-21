/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 7.Algoritmo  que  cuente  cuántos  múltiplos  de  7  hay  entre  dos  enteros  dados  por  el usuario. 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número inicial: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduzca el número final");
		int num2 = teclado.nextInt();
		int inicio = Math.min(num1, num2);
		int fin = Math.max(num1, num2);
		int suma=0;
		for (int i = inicio; i<=fin; i++) {
			if (i%7==0) {
				suma++;
			}
		} 
		System.out.println(suma);
		teclado.close();
	}
}
