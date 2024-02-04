package arraysbidimensionales;

import java.util.Random;

public class Ej10 {
	public static void main(String[] args) {
		int tabla[][];
		int tablita[][];
		tablita = new int[4][4];
		tabla = new int[4][4];
		Random r = new Random();

		// Para llenar la tabla bidimensional
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = r.nextInt(0, 10);
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}	

		tablita = noventa(tabla);
			System.out.println("-----------------------------------------");
		for (int i = 0; i < tablita.length; i++) {
			for (int j = 0; j < tablita[i].length; j++) {
				System.out.print(tablita[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// funcion en la que metemos la primera tabla para devolver la funcion
	// transpuesta
	public static int[][] noventa(int[][] tabla) {

		int[][] noventa;
		int guardar[][] = new int[4][4];
		noventa = new int[4][4];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				guardar[i][j] = tabla[j][i];

			}
		}
		
		for (int i = tabla.length-1; i >= 0; i--) {
			for (int j = tabla[i].length-1; j >= 0; j--) {
				
				noventa[i][j] = tabla[j][i];

			}
		}
		
		
		
		return noventa;
	}

}