<<<<<<< HEAD
package XsiO;

import java.util.ArrayList;

public class Jucatori {

	// creearea variabilelor
	static String jucator;
	public static ArrayList<Integer> pozitiiJucatori = new ArrayList<Integer>();
	
	// constructorul
	Jucatori() {}
	Jucatori( String jucator, ArrayList<Integer> pozitiiJucatori ) {
		Jucatori.jucator = jucator;
		Jucatori.pozitiiJucatori = pozitiiJucatori;
	}
	
	// getter si setter
	public String getJucator() {
		return jucator;
	}
	public void setJucator(String jucator) {
		Jucatori.jucator = jucator;
	}
	
	
	public static ArrayList<Integer> getPozitiiJucatori() {
		return pozitiiJucatori;
	}
	public static void setPozitiiJucatori(ArrayList<Integer> pozitiiJucatori) {
		Jucatori.pozitiiJucatori = pozitiiJucatori;
	}
	
	// creearea unei metode pt a schimba semnul dintre jucatori si a stoca intr-un arrayList
	// locatia respectiva
	public static String semne(int pozitie) {
		if(jucator == "X" ) {
			pozitiiJucatori.add(pozitie);
			return jucator = "O";
		}
		else {
		   pozitiiJucatori.add(pozitie);
		   return jucator = "X";
		}
		
	}
	

	
}
=======
package XsiO;

import java.util.ArrayList;

public class Jucatori {

	// creearea variabilelor
	static String jucator;
	public static ArrayList<Integer> pozitiiJucatori = new ArrayList<Integer>();
	
	// constructorul
	Jucatori() {}
	Jucatori( String jucator, ArrayList<Integer> pozitiiJucatori ) {
		Jucatori.jucator = jucator;
		Jucatori.pozitiiJucatori = pozitiiJucatori;
	}
	
	// getter si setter
	public String getJucator() {
		return jucator;
	}
	public void setJucator(String jucator) {
		Jucatori.jucator = jucator;
	}
	
	
	public static ArrayList<Integer> getPozitiiJucatori() {
		return pozitiiJucatori;
	}
	public static void setPozitiiJucatori(ArrayList<Integer> pozitiiJucatori) {
		Jucatori.pozitiiJucatori = pozitiiJucatori;
	}
	
	// creearea unei metode pt a schimba semnul dintre jucatori si a stoca intr-un arrayList
	// locatia respectiva
	public static String semne(int pozitie) {
		if(jucator == "X" ) {
			pozitiiJucatori.add(pozitie);
			return jucator = "O";
		}
		else {
		   pozitiiJucatori.add(pozitie);
		   return jucator = "X";
		}
		
	}
	

	
}
>>>>>>> ede2816... actualizare
