package arraysbidimensionales;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		
		//Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		//Variable en la que leeremos la nota
		int nota;
		//Variable en la que iremos guardando el minimo
		int min=999999;
		//Variable en la que iremos guardando el maximo
		int max=-9999999;
		//Variable en la que iremos guardando la media
		int media=0;
		//Creamos la tabla de 4 alumnos y 5 asignaturas
		int alumnoAsignatura[][] = new int[4][5];
		
		//Creamos un for dentro de un for para ir metiendo las notas en los alumnos
		for(int i=0;i<4;i++) {
			//Volvemos a iniciar las variables a sus valores iniciales después de haberlas modificado
			 min=999999;
			 max=-9999999;
			 media=0;
			 //El otro for
			for (int j=0;j<5;j++){
				//Pedimos las notas de los alumnos en cada asignatura
				System.out.println("Introduce el nota del alumno "+(i+1)+" y de la Asignatura "+(j+1));
				nota=sc.nextInt();
				//calculamos el mínimo, si la nota es menor tendremos un nuevo minimo
				if(nota<min) {
					min=nota;
					//calculamos el máximo, si la nota es mayor tendremos un nuevo máximo
				} else if(nota>max){
					max=nota;
				}
				
				//Sumamos todas las notas 
				media=media+nota;
				
				//Asignamos la nota a un valor en la tabla
				alumnoAsignatura[i][j]=nota;
			}	
			//Dividimos la suma de las notas entre el numero de asignaturas ara obtener la media
			media=media/5;
			//Damos los resultados de el máximo el mínimo y la media
			System.out.println("la media de las notas del alumno de de "+media);
			System.out.println("La nota máxima del alumno "+(i+1)+" es "+(max));
			System.out.println("La nota mínima del alumno "+(i+1)+" es "+(min));
		}
		//Damos la tabla de todas las notas
		System.out.println("Aquí tienes la tabla con todas las notas");
		//Un for dentro de un for para ir imprimiendo las notas de toos los espacios
		System.out.println("Alumnos"+"\t"+"    Asigantura 1"+"\t"+"Asigantura 2"+"\t"+"Asigantura 3"+"\t"+"Asigantura 4"+"\t"+"Asigantura 5");
		for(int i=0;i<alumnoAsignatura.length;i++) {
			System.out.print("Alumno "+(i+1)+"\t");
			

			for (int j=0;j<alumnoAsignatura[i].length;j++) {
				//Imprimimos los valores de un espacio específico
				System.out.print(alumnoAsignatura[i][j]+"\t"+"\t"); 
			}
			//Println para cambiar de línea
			System.out.println();
		}
		//cerramos escaner
		sc.close();
	}
}
