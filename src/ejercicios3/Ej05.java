/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 5.Algoritmo  que  sume  los n primeros  números  enteros,  siendo  n  un  número introducido por el usuario
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número: ");
		int num1 = teclado.nextInt();
		int suma= 0;
		for (int i = 1; i <= num1; i++) {
			suma=suma+i;
		}
		System.out.printf("La suma de los números por debajo de %d es %d",num1,suma);
		teclado.close();
	}

}
