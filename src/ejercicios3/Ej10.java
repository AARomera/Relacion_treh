/**
 * 
 */
package ejercicios3;

/**
 * @author Alejandro
 *
 */
public class Ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 10.Algoritmo que escriba la tabla de multiplicar usando esquemas while.
		
		int i=1,j=1;
		
		while(i<=10) {
			j=1;
			while(j<=10) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
