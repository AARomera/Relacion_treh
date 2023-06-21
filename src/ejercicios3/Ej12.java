/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 12.Algoritmo que determine si un número entero dado es perfecto o no. Se dice que un número es perfecto cuando es igual a la suma 		de sus divisores, excluido él mismo. Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3. 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num1 = teclado.nextInt();
		int suma=0;
		for (int i = 1; i<num1; i++) {
			if (num1%i==0) {
				suma=suma+i;
			}
		} 
		if (suma==num1)System.out.println("Es perfecto.");
		else System.out.println("No es perfecto");
		teclado.close();
	}

}
