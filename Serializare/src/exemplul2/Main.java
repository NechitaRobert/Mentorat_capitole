package exemplul2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


// intrebare..de ce nu imi reia valorile care le-am introdus 

public class Main {

	public static void main(String args[]) {
		
		Scanner valoriTastatura = new Scanner(System.in);
	    ArrayList<CatalogProduse> listaProduse = new ArrayList<CatalogProduse>();
	    CatalogProduse produse = null;
	    
	    
		// numele fisieurului
		String numeFisierSalvare = "produseCatalog.ser";
		CatalogProduse obiecteProduse = null;
	
		
		int optiune;
		while(true) {
			System.out.println("1 - adauga un produs ");
			System.out.println("2 - afisare catalog");
			System.out.println("3 - salveaza fisierul ");
			System.out.println("4 - reia fisierul ");
			System.out.println("5 - exit");
			
			optiune = valoriTastatura.nextInt();
			switch(optiune) {
			case 1 :
				System.out.println("Specificati denumirea produsului ");
				String denumire = valoriTastatura.next();
				System.out.println("Specificati pretul produsului ");
			    int pret = valoriTastatura.nextInt();
			    produse = new CatalogProduse(denumire, pret);
			    listaProduse.add(produse);
			break;
			case 2:
				for (CatalogProduse catalog : listaProduse) {
					System.out.println(catalog);
				}
			break;
			case 3 :
				// serializare
				try {
				
					// salvarea obiecteleor si a fisierului cu obiectele salvate
					// salvarea fisierului
					FileOutputStream  fisier = new FileOutputStream(numeFisierSalvare);
					// salvarea obiectelor in fisierul respectuv
					ObjectOutputStream SalveazaObiecte = new ObjectOutputStream(fisier);
					// metoda de a serializa obiectele
					SalveazaObiecte.writeObject(produse);
					SalveazaObiecte.close();
					fisier.close();
					System.out.println("Fisierul a fost serializat/salvat");
					
				}
				catch(IOException e) {
					System.out.println("A fost gasita o eroare in serializare cu succes");
				}
				
			break;
			case 4 :
				// deserializare
				try {
					// reluarea fisierului cu obiectele salvate in el
					// realuarea fisierului salvat
					FileInputStream fisier = new FileInputStream(numeFisierSalvare);
					// reluarea obiectelor din fisierul salvat
					ObjectInputStream ReiaObiecte = new ObjectInputStream(fisier);
					// metoda de a deserializa obiectele
					obiecteProduse = (CatalogProduse)ReiaObiecte.readObject();
					ReiaObiecte.close();
					fisier.close();
					
					System.out.println("Fisierul a fost deserializat/reluat cu succes ");
					for (CatalogProduse catalog : listaProduse) {
						System.out.println(catalog);
					}
					
					
				}
				catch(IOException  e) {
					System.out.println("A fost gasita o eroare la deserializare");	
				}
				catch(ClassNotFoundException e) {
					System.out.println("Exceptia ClassNotFoundException a fost prinsa ");
				}
				
			break;
			case 5 :
			    System.exit(0);
			break;
			
			}
			
			
		}
				
		
	}
	
}
