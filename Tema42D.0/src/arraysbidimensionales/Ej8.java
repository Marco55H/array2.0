package arraysbidimensionales;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		// Creamos la tabla
		int tabla[][] = new int[4][4];
		boolean simetrico;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.println("eee");
				tabla[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		simetrico = igual(tabla);

		if (simetrico == true) {
			System.out.println("Tu tabla es simétrica");
		} else {
			System.out.println("Tu tabla no es simétrica");
		}
		sc.close();
	}

	public static boolean igual(int tabla[][]) {
		boolean igual = false;
		int cont=0;
		int i=0;
		int j=0;
		for ( i = 0; i < tabla.length; i++) {
			for ( j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] == tabla[j][i]) {
					cont++;
				}
			}
		}

		if(cont==i*j) {
			igual=true;
		}

		return igual;
	}

}
