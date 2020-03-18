package bucateleDeAplicatii;

public class DivizareaMatriciiFormatDinArray {

	public static void main(String agrs[]) {
		
		String id[] = {"1", "2", "3", "4"};
		String pret[] = {"10" , "20", "30", "40"};
		String denumire[] = {"mat", "bio", "chim", "eng"};
		
		int dimensiune = id.length+pret.length+denumire.length;
		String matrice[][] = new String[dimensiune][3];
		
		for (int i = 0; i < id.length; i++) {
			matrice[i][0] = id[i];
		}
		for (int i = 0; i < pret.length; i++) {
			matrice[i][1] = pret[i];
		}
		for (int i = 0; i < denumire.length; i++ ) {
			matrice[i][2] = denumire[i];
		}
		
		for (int i = 0; i < id.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
	
		String matriceNoua[][] = new String[dimensiune - ((dimensiune) -1 ) /2][3];
		for (int i = 0; i < matriceNoua[i].length; i++) {
			for (int j  = 0; j < matriceNoua[j].length; j++) {
				matrice[i][0] = id[i -(i - 1)/2];
				matrice[i][1] = pret[i -(i - 1)/2];
				matrice[i][2] = denumire[i -(i - 1)/2];
				matrice[i][j] = matriceNoua[i][j];
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < matrice[i].length; i++) {
			for (int j  = 0; j < matrice[j].length; j++) {
				System.out.print( matriceNoua[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
