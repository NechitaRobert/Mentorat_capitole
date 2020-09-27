<<<<<<< HEAD
package XsiO;

import java.util.Random;
import java.util.Scanner;


public class Main {

	// metoda main
	public static void main(String args[]) {

        // instantierea si initializarea obiectelor
		TablaDeJoc joc = new TablaDeJoc();  
		Jucatori jucatori = new Jucatori();
		Reguli reguli = new Reguli();
		Random rand = new Random();
		// scannerul
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// creearea unui meniu
		int optiune;
		while(true) {
			System.out.println("Bine a-ti venit la jocul X si 0");
			System.out.println("1 - singlePlayer(1 jucator)");
			System.out.println("2 - multiPlayer (2 jucatori)");
			System.out.println("3 - exit");
			
			
			optiune = scan.nextInt();
			switch(optiune) {
			// singleplayer
			case 1 :
				// initializarea tablei de joc
				joc.tablaJocului();
			    while(true) {	
			    	      // afisarea tablei
				          joc.afisareTabla();

				          // introducerea pozitiilor de catre jucator
				          System.out.println("Jucatorul : specificati locatia semnului de la 1 la 9");
				          int pozitie = scan.nextInt();
				          // conditia in care blocheaza jucatorul daca introduce
				          // din greseala aceeasi pozitie in tabel sau introduce
				          // in mod eronat in pozitia botului
				          while(Jucatori.pozitiiJucatori.contains(pozitie)) {
					            System.out.println("Locatie luata....Precizati o alta locatie");
					            pozitie = scan.nextInt();
			               }

                          // afisarea pozitiilor pe tabla de joc
				          Reguli.pozitie(joc, pozitie, jucatori);
				          // varificarea daca se intalnesc conditiile de castig si precizarea cine castiga
				          if (reguli.verificareCastig() == true) {
				        	  if (Jucatori.jucator.contains("X")) {
						    		 System.out.println("A castigat jucatorul X");
						    	 } else {
						    		 System.out.println("A castigat jucatorul O");
						    	 }
					          break;
				          }
				          if (reguli.TabelPlin(joc) == true) {
					          System.out.println("Tabloul e full - E remiza");
					          break;	
				          }	

				          // botul
				          pozitie = rand.nextInt(9) + 1;
				          while(Jucatori.pozitiiJucatori.contains(pozitie)) {
					            pozitie = rand.nextInt(9) + 1;
				          }
				          // conditiile de castig
				          Reguli.pozitie(joc, pozitie, jucatori);
				          if (reguli.verificareCastig() == true) {
				        	  if (Jucatori.jucator.contains("X")) {
						    		 System.out.println("A castigat jucatorul X");
						      } else {
						    	System.out.println("A castigat jucatorul O");
						      }
					          break;
				          }
				          if (reguli.TabelPlin(joc) == true) {
					          System.out.println("Tabloul e full - E remiza");
					          break;
				          }
				          	          
				}
			    break;
			// multiplayer
			case 2:
				joc.tablaJocului();
				while(true) {
					     joc.afisareTabla();
					
					     // introducerea pozitiilor de catre jucatori si conditionarea de a nu suprapune
					     // elementele intre jucatori
					     System.out.println("Jucatorul : specificati locatia semnului de la 1 la 9");
					     int pozitie = scan.nextInt();
					     while(Jucatori.pozitiiJucatori.contains(pozitie)) {
					           System.out.println("Locatie luata....Precizati o alta locatie");
						       pozitie = scan.nextInt();
					     }
					   
					     // conditiile de castig
					     Reguli.pozitie(joc, pozitie, jucatori);
					     if (reguli.verificareCastig() == true) {
					    	 if (Jucatori.jucator.contains("X")) {
					    		 System.out.println("A castigat jucatorul X");
					    	 } else {
					    		 System.out.println("A castigat jucatorul O");
					    	 }
						     break;
					     }
					     if (reguli.TabelPlin(joc) == true) {
						     System.out.println("Tabloul e full - E remiza");
						     break;
					     }				   
				}
				break;
				// inchiderea jocului
			case 3:
				System.exit(0);
				break;	
		    }
		}		
	}
		
}
				


	

	
	

	
	
	

=======
package XsiO;

import java.util.Random;
import java.util.Scanner;


public class Main {

	// metoda main
	public static void main(String args[]) {

        // instantierea si initializarea obiectelor
		TablaDeJoc joc = new TablaDeJoc();  
		Jucatori jucatori = new Jucatori();
		Reguli reguli = new Reguli();
		Random rand = new Random();
		// scannerul
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// creearea unui meniu
		int optiune;
		while(true) {
			System.out.println("Bine a-ti venit la jocul X si 0");
			System.out.println("1 - singlePlayer(1 jucator)");
			System.out.println("2 - multiPlayer (2 jucatori)");
			System.out.println("3 - exit");
			
			
			optiune = scan.nextInt();
			switch(optiune) {
			// singleplayer
			case 1 :
				// initializarea tablei de joc
				joc.tablaJocului();
			    while(true) {	
			    	      // afisarea tablei
				          joc.afisareTabla();

				          // introducerea pozitiilor de catre jucator
				          System.out.println("Jucatorul : specificati locatia semnului de la 1 la 9");
				          int pozitie = scan.nextInt();
				          // conditia in care blocheaza jucatorul daca introduce
				          // din greseala aceeasi pozitie in tabel sau introduce
				          // in mod eronat in pozitia botului
				          while(Jucatori.pozitiiJucatori.contains(pozitie)) {
					            System.out.println("Locatie luata....Precizati o alta locatie");
					            pozitie = scan.nextInt();
			               }

                          // afisarea pozitiilor pe tabla de joc
				          Reguli.pozitie(joc, pozitie, jucatori);
				          // varificarea daca se intalnesc conditiile de castig si precizarea cine castiga
				          if (reguli.verificareCastig() == true) {
				        	  if (Jucatori.jucator.contains("X")) {
						    		 System.out.println("A castigat jucatorul X");
						    	 } else {
						    		 System.out.println("A castigat jucatorul O");
						    	 }
					          break;
				          }
				          if (reguli.TabelPlin(joc) == true) {
					          System.out.println("Tabloul e full - E remiza");
					          break;	
				          }	

				          // botul
				          pozitie = rand.nextInt(9) + 1;
				          while(Jucatori.pozitiiJucatori.contains(pozitie)) {
					            pozitie = rand.nextInt(9) + 1;
				          }
				          // conditiile de castig
				          Reguli.pozitie(joc, pozitie, jucatori);
				          if (reguli.verificareCastig() == true) {
				        	  if (Jucatori.jucator.contains("X")) {
						    		 System.out.println("A castigat jucatorul X");
						      } else {
						    	System.out.println("A castigat jucatorul O");
						      }
					          break;
				          }
				          if (reguli.TabelPlin(joc) == true) {
					          System.out.println("Tabloul e full - E remiza");
					          break;
				          }
				          	          
				}
			    break;
			// multiplayer
			case 2:
				joc.tablaJocului();
				while(true) {
					     joc.afisareTabla();
					
					     // introducerea pozitiilor de catre jucatori si conditionarea de a nu suprapune
					     // elementele intre jucatori
					     System.out.println("Jucatorul : specificati locatia semnului de la 1 la 9");
					     int pozitie = scan.nextInt();
					     while(Jucatori.pozitiiJucatori.contains(pozitie)) {
					           System.out.println("Locatie luata....Precizati o alta locatie");
						       pozitie = scan.nextInt();
					     }
					   
					     // conditiile de castig
					     Reguli.pozitie(joc, pozitie, jucatori);
					     if (reguli.verificareCastig() == true) {
					    	 if (Jucatori.jucator.contains("X")) {
					    		 System.out.println("A castigat jucatorul X");
					    	 } else {
					    		 System.out.println("A castigat jucatorul O");
					    	 }
						     break;
					     }
					     if (reguli.TabelPlin(joc) == true) {
						     System.out.println("Tabloul e full - E remiza");
						     break;
					     }				   
				}
				break;
				// inchiderea jocului
			case 3:
				System.exit(0);
				break;	
		    }
		}		
	}
		
}
				


	

	
	

	
	
	

>>>>>>> ede2816... actualizare
