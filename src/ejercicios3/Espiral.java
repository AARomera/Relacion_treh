/**
 * 
 */
package ejercicios3;

import java.util.Scanner;

/**
 * @author Alejandro
 * ═ ║ ╗ ╔ ╝ ╚
 */
public class Espiral {
	
	public static final char HORIZONTAL ='═';
	public static final char VERTICAL ='║';
	public static final char ESQUINA1 ='╗';
	public static final char ESQUINA2 ='╝';
	public static final char ESQUINA3 ='╚';
	public static final char ESQUINA4 ='╔';
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//* Crea una función que dibuje una espiral como la del ejemplo.
		//* - Únicamente se indica de forma dinámica el tamaño del lado.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la longitud de la espiral: ");
		int size = teclado.nextInt();
		char espira[][] =new char[size][size];
		int largo=0;
		
		if (size%2==0) largo=size/2;
		else largo=size/2+1;
		
		for (int fila=0; fila<largo;fila++) {
			for(int columna=0; columna<size;columna++) {
				if (fila+columna==size-1) {
					espira[fila][columna] = ESQUINA1;
				} else if(fila-columna==1) {
					espira[fila][columna] = ESQUINA4;
				}else if((fila-columna)>1 || (fila+columna)>(size-1)){
					espira[fila][columna] = VERTICAL;
				} else  {
					espira[fila][columna] = HORIZONTAL;
				}
				System.out.print(espira[fila][columna]+" ");
			}
			System.out.println();
		}
		
		if (size%2==0) largo=size/2;
		else largo=size/2+1;
		
		for (int fila=largo; fila<size;fila++) {
			for(int columna=0; columna<size;columna++) {
				if (fila+columna==size-1) {
					espira[fila][columna] = ESQUINA3;
				} else if(fila==columna) {
					espira[fila][columna] = ESQUINA2;	
				}else if((fila+columna)<(size-1) || (columna>fila)){
					espira[fila][columna] = VERTICAL;
				}else if (fila+columna>=size) {
					espira[fila][columna] = HORIZONTAL;
				}
				
				System.out.print(espira[fila][columna]+" ");
			}
			System.out.println();
		}
		
		teclado.close();	
	}

}
