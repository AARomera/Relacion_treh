/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 14.Algoritmo  que  pida  dos  números  naturales  e  imprimir  su  cociente  entero  por  el método de las restas sucesivas. 

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número a dividir: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduzca el número por el que quieres dividir: ");
		int num2 = teclado.nextInt();
		int contador = 0;
		int i=0;
		for(i = num1 ; i>=num2; i=i-num2) {
			contador++;
		}
		System.out.printf("El resultado de dividir %d entre %d es %d con resto %d",num1,num2,contador,i);
		teclado.close();
	}

}
