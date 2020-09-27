package exercitiul4;

public class UnNumar {

	private int numar;
	public UnNumar() {}
	public UnNumar(int numar) {
		this.numar = numar;
	}
	
	private int getNumar() {
		return this.numar;
	}
	private int setNumar(int numar) {
		return this.numar = numar;
	}
	
	public int rezultat(int numar) {
		return numar / 1 ;
	} 
	
	public static void main(String args[]) {
		UnNumar numere = null;
		try {
	    	  numere.rezultat(4);
	    }
	    catch(Exception e) {
	    	System.out.println("metoda rezultat trebuie tratata ");
	    }	
	}
	
}
