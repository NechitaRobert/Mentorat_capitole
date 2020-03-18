package bucateleDeAplicatii;

import java.util.Scanner;

public class StergereaUnuiRandMatrice {

	public static void main(String agrs[]) {
		
		int matrice[][] = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
		int stergere;
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati ce rand doriti sa stergeti ");
		stergere = valoriTastatura.nextInt();
		valoriTastatura.close();
		
		int randuri = matrice.length;
		int coloane = matrice[0].length;
		int matriceNoua[][] = new int[randuri - 1][coloane];
		
		int numarare = 0;
		boolean verificare = false;
		for (int i = 0; i < randuri; i++) {
			for (int j = 0; j < coloane; j++) {
				matriceNoua[i-numarare][j] = matrice[i][j];
				if (matrice[i][j] == stergere) {
				    numarare += 1;
				    if (i == randuri-1) {
				    	verificare = true;
				    }
				    break;
				}
			}
		}
		
//		if (verificare) {
//			for (int i = randuri-numarare; i < randuri-numarare + 1; i++) {
//				for (int j = 0; j < coloane; j++) {
//					matriceNoua[i][j] = 0;
//				}
//			}
//		}
		
		for (int i = 0; i < randuri - 1 ; i++) {
			for (int j = 0; j < coloane; j++) {
				System.out.print(matriceNoua[i][j]);
			}
			System.out.println();
		}
					 
	}
	
}
