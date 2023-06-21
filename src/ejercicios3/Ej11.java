/**
 * 
 */
package ejercicios3;

/**
 * @author Alejandro
 *
 */
public class Ej11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 11.Algoritmo que escriba la tabla de multiplicar usando esquemas do while.
		
		int i=1,j=1;
		
		do {
			System.out.println();
			j=1;
			do {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			} while (j<=10);
			i++;
		} while (i<=10);
	}

}
