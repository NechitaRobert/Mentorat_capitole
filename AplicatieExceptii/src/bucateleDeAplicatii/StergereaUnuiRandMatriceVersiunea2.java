package bucateleDeAplicatii;


import java.util.Arrays;
import java.util.Scanner;

public class StergereaUnuiRandMatriceVersiunea2 {

	 
	private static String[][] stergereColoana(String[][] matrice, int stergereColoana) {
		int rand = matrice.length;
		int coloana = matrice[0].length;
		String [][] matrice2 = new String[rand][coloana-1];
		for (int i = 0; i < rand; i++) {
			for (int j = 0; j < stergereColoana; j++) {
				matrice2[i][j] = matrice[i][j];
			}
			for (int j = stergereColoana; j < coloana-1; j++) {
				matrice2[i][j] = matrice[i][j+1];
			}
			System.out.println();
		}
		return matrice2;
	} 
	 
	 
	public static void main(String args[]) {
		
		int stergere;
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Ce coloana doriti sa stergeti ");
		stergere = valoriTastatura.nextInt();
		valoriTastatura.close();
		
		
        String idSir[] = {"1","2","3","4", "5", "6", "7"};
	    String pretSir[] = {"10","20","30","40", "50", "60", "43"};
	    String denumireSir[] = {"tic" , "mat" , "bio" , "chim", "alg", "bio" , "des"};
		 
	    int dimensiuneRand = idSir.length + pretSir.length + denumireSir.length;
	    int dimensiuneColoana = 3;
		String matrice[][] = new String[dimensiuneRand][dimensiuneColoana];
		for (int i = 0; i < idSir.length; i++)   {
			matrice[i][0] = idSir[i];
		}
		// pt a adauga o rand nou la o matrice...pot folosi una din astea 
		for (int i = 0; i < pretSir.length; i++) {
			matrice[i][1] = pretSir[i];
		}
		for (int i = 0; i < denumireSir.length; i++) {
			matrice[i][2] =  denumireSir[i];
		}
		
		for (int i = 0; i < matrice[i].length; i++) {
			for (int j = 0; j < matrice[j].length; j++) {
				matrice[i][j] = matrice[i][j];
			}
		}
		
		for (int i = 0; i < idSir.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
		String matrice2[][] = stergereColoana(matrice, stergere);
		System.out.println(Arrays.deepToString(matrice2));

		int numarare = 0;
		String matriceNoua[][] = new String[dimensiuneRand-1][dimensiuneColoana];
		int temporarRand = -1;
		int temporarColoana = -1;
		for (int i = 0; i < dimensiuneRand; i++) {
			temporarRand++;
			if (i == stergere) {
				temporarRand--;
			}
			for (int j = 0; j < dimensiuneColoana; j++) {
				if (i != stergere) {
				numarare++;
				matrice[i][j] = matriceNoua[i][j];
				}
			}
		}

		for (int i = 0; i < dimensiuneRand-1; i++) {
			for (int j = 0; j < dimensiuneColoana; j++) {
				System.out.print(matriceNoua[i][j] + " ");
			}
		}
	
	
	}
		
		
		
	}
	
	
	
	

