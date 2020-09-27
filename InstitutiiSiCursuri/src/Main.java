<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		ArrayList <Curs> cursuriProgramare = new ArrayList<Curs>();
		ArrayList <Curs> cursLimbiStraine = new ArrayList<Curs>();
		Scanner s = new Scanner(System.in);
=======

import java.util.Scanner;

// nota pentru mine : dupa ce termin complet exercitiul ...incearca sa adaugi si SERIALIZARE
// pentru a salva valorile introduse....


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Institutie institutie = new Institutie();
>>>>>>> ede2816... actualizare
		
		int optiune;
		while(true) {
			System.out.println("1-exit");
<<<<<<< HEAD
			System.out.println("2-adauga curs Programare");
			System.out.println("3-adauga curs Limbi straine");
			System.out.println("4-afisare cursuri limbi straine");
			System.out.println("5-afisare_cursuri_programare ");
			System.out.println("6-sterge curs");
=======
			System.out.println("2-adauga curs");
			System.out.println("3-afisare Cursuri");
			System.out.println("4-afisare_cursuri_programare ");
		    System.out.println("5-afisare_cursuri_limbiStraine ");
			System.out.println("6-sterge curs");
			System.out.println("7-ordonare in functie de pret");
>>>>>>> ede2816... actualizare
			
			optiune = s.nextInt();
			switch(optiune) {
			case 1:
				System.exit(0);
			break;
<<<<<<< HEAD
			case 2:
				System.out.println("Adauga Curs Programare");
				CursProgramare cProgramare = new CursProgramare(1, "Java", 100, cursuriProgramare);
				
				//cProgramare.adaugaCurs(cProgramare);
			break;
			
			case 3:
				System.out.println("Adauga Curs Limbi Straine");
				CursLimbiStraine cLStraine = new CursLimbiStraine(1, "Java", 100, cursLimbiStraine);
			break;
			case 4:
				for(Curs c : cursLimbiStraine) {
					System.out.println(c.toString());
				}
			break;
=======
			
			case 2:
				System.out.println("Pentru adaugarea unui curs de programare - apasati tasta 1");
				System.out.println("Pentru adaugarea unui curs de limbi strainte - apasati tasta 2");
				int tipCurs = s.nextInt();
				switch(tipCurs) {
				case 1:
					try {
						System.out.println("Vreti sa adaugati un curs de programare ");
						System.out.println("Specificati denumirea ");
						String denumire = s.next();
						System.out.println("Specificati pretul ");
						double cost = s.nextDouble();
						institutie.adaugaCurs(0,denumire,cost);
					    } 
					catch (PreaMulteCursuri e) {
						 System.out.println("Prea multe cursuri ");
						                        
					}
				break;
				case 2:	 
					try {
						System.out.println("Vreti sa adaugati un curs de limbi straine ");
						System.out.println("Specificati denumirea ");
						String denumire = s.next();
						System.out.println("Specificati costul ");
						double cost = s.nextDouble();
						institutie.adaugaCurs(1,denumire,cost);
					    } 
					catch (PreaMulteCursuri e) {
						 System.out.println("Prea multe cursuri ");
					}
				break;			
				}
					break;
			case 3 :
				institutie.afiseazaCursuri();
		    break;
		    
			case 4:
				for(int i=0;i<institutie.afisareCursuriProgramare().size();i++) {
					System.out.println(institutie.afisareCursuriProgramare().get(i)/*.getDenumire()*/);
				}
				
			break;
			case 5:
				for(int i=0;i<institutie.afisareCursuriLimbiStraine().size();i++) {
					System.out.println(institutie.afisareCursuriLimbiStraine().get(i)/*.getDenumire()*/);
				}
				
			break;
			case 6 :
				System.out.println("Care curs a-ti dori sa stergeti ?");
				int cursSters = s.nextInt();
				institutie.stergeCurs(cursSters);
			break;	
			case 7 :
				institutie.ordonareInFunctieDePret();
				
>>>>>>> ede2816... actualizare
			}
		} 
		
	}
}
