package arraysbidimensionales;

import java.util.Random;

/*j9
 * 
 */
public class Ej5 {
	/*
	 * h09
	 */
	public static void main(String[] args) {
		int tabla[][];
		int sumaLinea=0;
		int sumaColumna=0;
		int sumaTotal=0;
		int dato;

		tabla = new int[4][5];

		rellena(tabla);
		
		for (int i = 0; i < 4; i++) {
			sumaLinea=0;
			for (int j = 0; j < 5; j++) {
				dato=tabla[i][j];
				System.out.print(tabla[i][j] + "\t");
				sumaLinea +=dato;
			}
			System.out.println(sumaLinea);
		}
		
		for (int j = 0; j < tabla[0].length; j++) {
			sumaColumna=0;
			for (int i = 0; i < tabla.length; i++) {
			
				dato=tabla[i][j];
				sumaColumna +=dato;
				
			}
			sumaTotal+=sumaColumna;
			System.out.print(sumaColumna+"\t");
		
		}
		System.out.println(sumaTotal);
	}

	/*
	 * jbhijhgy
	 */
	public static int[][] rellena(int tabla[][]) {
		Random r = new Random();


		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				tabla[i][j] = r.nextInt(100,1000);
			}
		}
		return tabla;
	}

}
