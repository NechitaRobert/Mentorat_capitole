package exercitiul1;

public class Exercitiul1 extends Exception {

	private String forma;
	
	
	Exercitiul1(String forma) {
		this.forma = forma;
		try {
		  int numarare = 0;
		  for (int i = 0; i < forma.length(); i++) {
			  if(forma.charAt(i) != ' ') {
			    numarare++;
			  }
		  }
		  System.out.println("Are " + numarare / 0 + " litere");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ceva nu merge bine");
		}
		// nu prea stiu cum ar merge finally
		finally {
			System.out.println("codul final");
		}
	}
	
	public String getForma() {
		return forma;
	}
	public String setForma(String forma) {
		return this.forma;
	}
	
	public static void main(String args[]) {
		
		Exercitiul1 exemplu = new Exercitiul1("Sfera");
		
		
	}
	
	
	
}
