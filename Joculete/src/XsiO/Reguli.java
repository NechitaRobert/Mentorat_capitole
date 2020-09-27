<<<<<<< HEAD
package XsiO;

public class Reguli {

	// compozitii si variabile
	Jucatori jucator; 
	TablaDeJoc tabla;
	int pozitie;
	
	// constructorul
	public Reguli() {}
	public Reguli(Jucatori jucator, TablaDeJoc tabla, int pozitie) {
		this.jucator = jucator;
		this.tabla = tabla;
		this.pozitie = pozitie;
		tabla.tablaJocului();	
	}
	
	// metoda de a verfica daca toate cele 3 elementele sunt identice
	// si nu exista spatii goale pentru a identifica victoria 
	public boolean verificareElemente(String element1, String element2, String element3) {
		return ((element1 != " ") && (element1 == element2 ) && (element2 == element3));
	}
	
	// metoda de a verifica daca exista castig pe linie
	public boolean castigPeLinie(TablaDeJoc tabla) {
		for (int i = 0; i < 3; i++) {
			if(verificareElemente(TablaDeJoc.tabla[i][0], TablaDeJoc.tabla[i][1], TablaDeJoc.tabla[i][2]) == true ) {
				return true;
			}
		}
		return false;
	}
	
	// metoda de a verifica daca exista castig pe coloana
	public boolean castigPeColoana(TablaDeJoc tabla) {
		for (int i = 0; i < 3; i++) {
			if(verificareElemente(TablaDeJoc.tabla[0][i], TablaDeJoc.tabla[1][i], TablaDeJoc.tabla[2][i]) == true ) {
				return true;
			}
		}
		return false;
	}
	
	// metoda de a verifica daca exista un castig pe coloana
	public boolean castigPeDiagonala(TablaDeJoc tabla) {
		return ((verificareElemente(TablaDeJoc.tabla[0][0], TablaDeJoc.tabla[1][1], TablaDeJoc.tabla[2][2]) == true)
				|| (verificareElemente(TablaDeJoc.tabla[0][2], TablaDeJoc.tabla[1][1], TablaDeJoc.tabla[2][0]) == true));
	}

	// metoda de a verifica daca exista un castig
	public boolean verificareCastig() {
		return ( castigPeLinie(tabla) || castigPeColoana(tabla) || castigPeDiagonala(tabla));
	}
	
	// metoda de a verifica daca tabelul este plin
	public boolean TabelPlin(TablaDeJoc tabla) {
		boolean eFull = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) { 
				    if(TablaDeJoc.tabla[i][j] == " ") {
				    	eFull = false;
				    }
				}
			}
		return eFull;
	}

	// metoda de a stabili introducerea pozitiilor pe tabla
	// de exemplu pozitia din tabla[0][0] = va avea valoarea 1, tabla[0][1] va avea valoarea 2, etc
	public static void pozitie(TablaDeJoc tabla, int pozitie, Jucatori jucatori) {
	  	
		switch(pozitie) {
		case 1:
			TablaDeJoc.tabla[0][0] =  Jucatori.semne(pozitie);
			break;
		case 2:
			TablaDeJoc.tabla[0][1] =  Jucatori.semne(pozitie);
			break;
		case 3:
			TablaDeJoc.tabla[0][2] =  Jucatori.semne(pozitie);
			break;
		case 4:
			TablaDeJoc.tabla[1][0] =  Jucatori.semne(pozitie);
			break;
		case 5:
			TablaDeJoc.tabla[1][1] =  Jucatori.semne(pozitie);
			break;
		case 6:
			TablaDeJoc.tabla[1][2] =  Jucatori.semne(pozitie);
			break;
		case 7:
			TablaDeJoc.tabla[2][0] =  Jucatori.semne(pozitie);
			break;
		case 8:
			TablaDeJoc.tabla[2][1] =  Jucatori.semne(pozitie);
			break;
		case 9:
			TablaDeJoc.tabla[2][2] =  Jucatori.semne(pozitie);
			break;
			
		}
		
    }
		
}
=======
package XsiO;

public class Reguli {

	// compozitii si variabile
	Jucatori jucator; 
	TablaDeJoc tabla;
	int pozitie;
	
	// constructorul
	public Reguli() {}
	public Reguli(Jucatori jucator, TablaDeJoc tabla, int pozitie) {
		this.jucator = jucator;
		this.tabla = tabla;
		this.pozitie = pozitie;
		tabla.tablaJocului();	
	}
	
	// metoda de a verfica daca toate cele 3 elementele sunt identice
	// si nu exista spatii goale pentru a identifica victoria 
	public boolean verificareElemente(String element1, String element2, String element3) {
		return ((element1 != " ") && (element1 == element2 ) && (element2 == element3));
	}
	
	// metoda de a verifica daca exista castig pe linie
	public boolean castigPeLinie(TablaDeJoc tabla) {
		for (int i = 0; i < 3; i++) {
			if(verificareElemente(TablaDeJoc.tabla[i][0], TablaDeJoc.tabla[i][1], TablaDeJoc.tabla[i][2]) == true ) {
				return true;
			}
		}
		return false;
	}
	
	// metoda de a verifica daca exista castig pe coloana
	public boolean castigPeColoana(TablaDeJoc tabla) {
		for (int i = 0; i < 3; i++) {
			if(verificareElemente(TablaDeJoc.tabla[0][i], TablaDeJoc.tabla[1][i], TablaDeJoc.tabla[2][i]) == true ) {
				return true;
			}
		}
		return false;
	}
	
	// metoda de a verifica daca exista un castig pe coloana
	public boolean castigPeDiagonala(TablaDeJoc tabla) {
		return ((verificareElemente(TablaDeJoc.tabla[0][0], TablaDeJoc.tabla[1][1], TablaDeJoc.tabla[2][2]) == true)
				|| (verificareElemente(TablaDeJoc.tabla[0][2], TablaDeJoc.tabla[1][1], TablaDeJoc.tabla[2][0]) == true));
	}

	// metoda de a verifica daca exista un castig
	public boolean verificareCastig() {
		return ( castigPeLinie(tabla) || castigPeColoana(tabla) || castigPeDiagonala(tabla));
	}
	
	// metoda de a verifica daca tabelul este plin
	public boolean TabelPlin(TablaDeJoc tabla) {
		boolean eFull = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) { 
				    if(TablaDeJoc.tabla[i][j] == " ") {
				    	eFull = false;
				    }
				}
			}
		return eFull;
	}

	// metoda de a stabili introducerea pozitiilor pe tabla
	// de exemplu pozitia din tabla[0][0] = va avea valoarea 1, tabla[0][1] va avea valoarea 2, etc
	public static void pozitie(TablaDeJoc tabla, int pozitie, Jucatori jucatori) {
	  	
		switch(pozitie) {
		case 1:
			TablaDeJoc.tabla[0][0] =  Jucatori.semne(pozitie);
			break;
		case 2:
			TablaDeJoc.tabla[0][1] =  Jucatori.semne(pozitie);
			break;
		case 3:
			TablaDeJoc.tabla[0][2] =  Jucatori.semne(pozitie);
			break;
		case 4:
			TablaDeJoc.tabla[1][0] =  Jucatori.semne(pozitie);
			break;
		case 5:
			TablaDeJoc.tabla[1][1] =  Jucatori.semne(pozitie);
			break;
		case 6:
			TablaDeJoc.tabla[1][2] =  Jucatori.semne(pozitie);
			break;
		case 7:
			TablaDeJoc.tabla[2][0] =  Jucatori.semne(pozitie);
			break;
		case 8:
			TablaDeJoc.tabla[2][1] =  Jucatori.semne(pozitie);
			break;
		case 9:
			TablaDeJoc.tabla[2][2] =  Jucatori.semne(pozitie);
			break;
			
		}
		
    }
		
}
>>>>>>> ede2816... actualizare
