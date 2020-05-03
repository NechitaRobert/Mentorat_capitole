package exemplul1;

import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		
	    Scanner valoriTastatura = new Scanner(System.in);
					
		System.out.println("Specificati denumirea produsului ");
		String denumire = valoriTastatura.next();
		System.out.println("Specificati pretul produsului ");
		int pret = valoriTastatura.nextInt();
		CatalogProduse produse = new CatalogProduse(denumire, pret);	
		System.out.println(produse);
		
		// numele fisieurului
		String numeFisierSalvare = "produseCatalog.ser";
		CatalogProduse obiecteProduse = null;
		
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
		catch(Exception e) {
			System.out.println("A fost gasita o eroare in serializare cu succes");
		}
		
		
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
			System.out.println(produse);
			
		}
		catch(Exception e) {
			System.out.println("A fost gasita o eroare la deserializare");	
		}		
		
		valoriTastatura.close();
		
		
	}
	
}
