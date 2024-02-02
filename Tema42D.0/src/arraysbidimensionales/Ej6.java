package arraysbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ej6 {
	public static void main(String[] args) {
		int tabla[][];
		int tablita[];
		tablita = new int[2];
		tabla = new int[6][10];
		Random r = new Random();

		// Para llenar la tabla bidimensional
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = r.nextInt(0, 1001);
			}
		}
		tablita = MayorMenor(tabla);
		System.out.println(Arrays.toString(tablita));
	}

	// Funcion que nos devolverá el array de 1 dimension en la que introduciremos el
	// array de dos dimensiones
	public static int[] MayorMenor(int tabla[][]) {
		// Creamos la tabla 1D
		int[] tablaD;
		tablaD = new int[2];
		// Iniciamos el maximo
		int max = Integer.MIN_VALUE;
		// Iniciamos el minimo
		int min = Integer.MAX_VALUE;
		// Creamos un auxiliar para ayudarnos y no escribir en el máximo y en el mínimo
		// y para limpieza del código
		int aux = 0;

		// For para recorrer la tabla bidimensional
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// El auxiliar es el número con las siguientes coordenadas
				aux = tabla[i][j];
				// Si aux es menor q minimo hay un nuevo minimo
				if (aux <= min) {
					min = aux;
				}
				// Si aux es mayor que máximo hay un nuevo máximo
				if (aux >= max) {
					max = aux;
				}
			}

		}

		tablaD[0] = min;
		tablaD[1] = max;
		return tablaD;
	}
}
