package exercitiul6;

public class MetodaMain {

	// testare
		public static void main(String args[]) throws Exceptii {
			AruncareaExceptiilor exceptii = new AruncareaExceptiilor();
			// testare pt a vedea daca eroare este arrayIndexOutOfBoundException
			//  exceptii.prima(2,10, null);
			try {
				exceptii.prima(2,10, null);
				exceptii.aDoua(3,14, null);
				exceptii.aTreia(2,1, null);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("nu e corect");
			}
		}
	
}
