package bucateleDeAplicatii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StergereaElementelorDinArray {

	public static void main(String args[]) {
		// pt array
		String id[] = {"1","2","3","4", "5", "6", "7"};
	    String pret[] = {"10","20","30","40", "50", "60", "90"};
	    String denumire[] = {"tic" , "mat" , "bio" , "chim", "alg", "bio", "fiz"};
	   
		
		int stergere;
		Scanner stergereValoare = new Scanner(System.in);
		System.out.println("SPECIFITCATI INDEXUL care doriti sa il stergeti : ");
		stergere = stergereValoare.nextInt();	
		
		
		// aici stergem un element din sirul String pe baza unui index utilizat
		String nouId[] = new String[id.length - 1];
		System.arraycopy(id, 0, nouId, 0, stergere);
		System.arraycopy(id, stergere + 1, nouId, stergere, id.length - stergere -1);
		
		String nouPret[] = new String[pret.length - 1];
		System.arraycopy(pret, 0, nouPret, 0, stergere);
		System.arraycopy(pret, stergere + 1, nouPret, stergere, pret.length - stergere - 1);
		
		String nouDenumire[] = new String[denumire.length - 1];
		System.arraycopy(denumire, 0, nouDenumire, 0, stergere);
		System.arraycopy(denumire, stergere + 1, nouDenumire, stergere, denumire.length - stergere - 1);
			
		// afisarea noului sir cu un element in minus
		for (int i = 0; i < nouId.length; i++) {
			System.out.print(nouId[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(nouId));
		System.out.println();
		for (int i = 0; i < nouPret.length; i++) {
			System.out.print(nouPret[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(nouPret));
		System.out.println();
		for (int i = 0; i < nouDenumire.length; i++) {
			System.out.print(nouDenumire[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(nouDenumire));
		System.out.println();
		
		// stergerea unui element din array ultilizant lista
		ArrayList<String> idList  =  new ArrayList<String>(Arrays.asList(id));
		idList.remove(stergere);
		System.out.println(idList);
		System.out.println();
		
		

	}
	
	
}
