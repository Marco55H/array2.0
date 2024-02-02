package arraysbidimensionales;

public class Ej8 {
	public static void main(String[] args) {
		//Creamos la tabla 
		int tabla[][] = new int[4][4];
		
		for(int i =0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				tabla[i][j]=1;
			}
		}
		
	}
	public static boolean igual(int tabla[][]) {
		boolean igual=true;
		
		
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				if (tabla[i][j]==tabla[j][i]) {
					igual=false;
				}
			}
		}
		
		return igual;	
	}
	
}
