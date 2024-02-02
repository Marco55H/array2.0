package arraysbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ej7 {
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
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				System.out.print(tabla[i][j]+"\t");
			}
			System.out.println();
		}
		tablita = Transpuesta(tabla);
		System.out.println("-----------------------------------------");
		for(int i=0;i<tablita.length;i++) {
			for(int j=0;j<tablita[i].length;j++) {
				System.out.print(tablita[i][j]+"\t");
			}
			System.out.println();
		}
	}

	// funcion en la que metemos la primera tabla para devolver la funcion
	// transpuesta
	public static int[][] Transpuesta(int[][] tabla) {
		
		int[][] transpuesta;
		
		transpuesta = new int[4][4];

		for (int j = 0; j < tabla.length; j++) {
			for (int i = 0; i < tabla[j].length; i++) {
				transpuesta[i][j] = tabla[j][i];
			}
		}
		
		return transpuesta;
	}
}
