package bucateleDeAplicatii;

public class CreeareaMatriceiConcatenate {
	
	public static void main(String args[]) {
		
	    String idSir[] = {"1","2","3","4", "5", "6", "7"};
	    String pretSir[] = {"10","20","30","40", "50", "60" , "32"};
	    String denumireSir[] = {"tic","mat" ,"bio","chim","alg","bio", "cha"};
		 
		String matrice[][] = new String[idSir.length + pretSir.length + denumireSir.length][3];
		for (int i = 0; i < idSir.length; i++) {
			matrice[i][0] = idSir[i];
		}
		for (int i = 0; i <pretSir.length; i++) {
			matrice[i][1] = pretSir[i];
		}
		for (int i = 0; i < denumireSir.length; i++) {
			matrice[i][2] =  denumireSir[i];
		}
		
		for (int i = 0; i < idSir.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	


	
}
