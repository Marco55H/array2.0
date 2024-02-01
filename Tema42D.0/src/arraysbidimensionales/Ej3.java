package arraysbidimensionales;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[][];
		int ancho;
		int largo;
		System.out.println("Que valores quieres para tu tabla");
		System.out.println("Largo");
		ancho = sc.nextInt();
		System.out.println("Ancho");
		largo = sc.nextInt();
		tabla = new int[largo][ancho];

		Rellena(tabla, ancho, largo);

		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}

	public static void Rellena(int tabla[][], int ancho, int largo) {

		
		
		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				tabla[i][j] = 10 * (i + j);
			}
		}

	}
}
