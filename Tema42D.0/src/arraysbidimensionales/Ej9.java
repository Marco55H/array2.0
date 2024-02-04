package arraysbidimensionales;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		int tabla[][] = new int[3][3];
		boolean magica;
		Scanner sc = new Scanner(System.in);

		// Meter datos a la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("eee");
				tabla[i][j] = sc.nextInt();
			}
		}

		// Pintar la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		magica = magica(tabla);

		if (magica == true) {
			System.out.println("Tu array es mágico");
		} else {
			System.out.println("Tu array no es mágico");
		}

		sc.close();

	}

	// PAra comprobar si es mágica
	public static boolean magica(int tabla[][]) {
		boolean igual = true;
		int i = 0;
		int j = 0;
		int sumaFilas = 0;
		int sumaColumnas = 0;
		int fijo = 0;

		// Recorrer la tabla para sacar el número fijo
		for (i = 0; i < 1; i++) {
			for (j = 0; j < tabla[i].length; j++) {
				sumaFilas += tabla[i][j];
			}
			fijo = sumaFilas;
		}

		// Para comprobar que todas las filas valen lo mismo

		for (i = 0; i < tabla.length; i++) {
			sumaColumnas = 0;
			sumaFilas = 0;
			for (j = 0; j < tabla[i].length; j++) {
				sumaFilas += tabla[i][j];
				sumaColumnas += tabla[j][i];
			} // 2for
			if (sumaFilas != fijo) {
				igual = false;
			} // if 1
			if (sumaColumnas != fijo) {
				igual = false;
			} // if2
		} // 1 for

		return igual;
	}
}
