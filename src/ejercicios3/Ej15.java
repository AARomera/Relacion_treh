/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 15.Implementar el ejercicio 7 de la práctica 2, introduciendo un esquema do-while, de forma que el usuariodecida cuando quiere salir del programa.
		
	Scanner teclado = new Scanner (System.in);
	int operador=0;	
	double num1=0;
	double num2=0;
	do {
		System.out.println("Seleccione el tipo de operacion:\n"
			+ "-Pulse 1 para suma\n"
			+ "-Pulse 2 para resta\n"
			+ "-Pulse 3 para multiplicar\n"
			+ "-Pulse 4 para dividir\n"
			+ "-Pulse 5 para la raíz cuadrada\n"
			+ "-Pulse 6 para la potencia \n"
			+ "-Pulse 7 para salir");
		operador = teclado.nextInt();
		
		if (operador < 7) {
			System.out.println("Introduzca el primer valor: ");
			num1 = teclado.nextDouble();
			if (operador != 5) {
			System.out.println("Introduzca el segundo valor: ");
			num2 = teclado.nextDouble();
			}
		}
	
		double resultado=Double.NaN;
		
		switch (operador) {
			case 1:
				resultado = num1+num2;
				break;
			case 2:
				resultado = num1-num2;
				break;
			case 3:
				resultado = num1*num2;
				break;
			case 4:
				resultado = num1/num2;
				break;
			case 5:
				resultado = Math.sqrt(num1);
				break;
			case 6:
				resultado = Math.pow(num1, num2);
				break;
			case 7:
				System.out.println("Tenga un buen día");
				return;
			default:
				System.out.println("ERROR: Operador erroneo");				
		}
		if (Double.isNaN(resultado)) 
			System.out.println("ERROR");
		 else 
			System.out.printf("El resultado es %f\n\n", resultado);	
		} while(operador!=7);
		teclado.close();
		
	}

}
