/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 2.Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  a  un  número comprendido  entre  uno  y  diez,  		introducido  por  el  usuario,  usando  un  esquema while.
		
		Scanner teclado = new Scanner(System.in);
		int num1=0;
		int i=1;
		do {
		System.out.println("Introduzca un número entre 1 y 10: ");
		num1 = teclado.nextInt();
		} while (num1<1 || num1>10);
		
		while (i<=10) {
			System.out.printf("%d x %d = %d\n",num1,i,num1*i);
			i++;
		}
		teclado.close();
	}

}
