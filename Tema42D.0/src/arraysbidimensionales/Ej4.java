package arraysbidimensionales;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		
		final int NUM1=11;
		final int NUM2=11;
		
		Scanner sc = new Scanner(System.in);
		int tabla[][];

		tabla = new int[NUM1][NUM2];

		Rellena(tabla,NUM1 , NUM2);

		for (int i = 0; i < NUM1; i++) {
			for (int j = 0; j < NUM2; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}

	public static int[][] Rellena(int tabla[][], int NUM1, int NUM2) {

		int tabla2[][]=new int[NUM1][NUM2];
		
		for (int i = 0; i < NUM1; i++) {
			for (int j = 0; j < NUM2; j++) {
				tabla[i][j] = i*j;
			}
		}	
	tabla2=tabla;
	return tabla2;
	}

}
