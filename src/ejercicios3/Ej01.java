/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 1.Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  a  un  número comprendido entre uno y diez, introducido por 		el usuario, usando un esquema for. 
		
		Scanner teclado = new Scanner(System.in);
		int num1=0;
		do {
		System.out.println("Introduzca un número entre 1 y 10: ");
		num1 = teclado.nextInt();
		} while (num1<1 || num1>10);
		
		for (int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",num1,i,num1*i);
		}
		teclado.close();
	}

}
