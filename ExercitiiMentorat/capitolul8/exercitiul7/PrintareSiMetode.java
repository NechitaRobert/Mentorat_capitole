package exercitiul7;

import java.util.Scanner;
public class PrintareSiMetode extends Numere {

	PrintareSiMetode() {}
	PrintareSiMetode(String mesaj) {
		super();
	}
	PrintareSiMetode(int primulNumar, int alDoileaNumar) {
		super(primulNumar, alDoileaNumar);
	}
	
	public void printare() {
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Valoarea primului numar : ");
		setPrimulNumar(valoriTastatura.nextInt());
		System.out.println("Valoarea celui de-al doilea numar : ");
		setAlDoileaNumar(valoriTastatura.nextInt());
	}
	
	public void comparare(int primulNumar, int alDoileaNumar) throws Numere {
		if(primulNumar < alDoileaNumar) {
			System.out.println("Primul numar e mai mic decat al doilea numar");
		}
		else {
			System.out.println((primulNumar + alDoileaNumar) / 0);
		}	
	}
	
	public static void main(String args[]) throws Numere {
		PrintareSiMetode testare = new PrintareSiMetode();
		testare.printare();
		int primulNumar = testare.getPrimulNumar();
		int alDoileaNumar = testare.getAlDoileaNumar();
		try {
			testare.comparare(primulNumar, alDoileaNumar);
		}
		catch(Exception e) {
			//  nu inteleg de ce nu se opreste while-ul cand conditia se indeplineste
				while(primulNumar >  alDoileaNumar) {
					System.out.println("Introduceti inca odata valorile");
					testare.printare();
				}	
		     
		}
		
	}
	
	
}
