package exercitiul5;

public class MetodaMain {

	public static void main(String args[]) {
		
		DouaNumere cifre;
		TreiNumere numere = new TreiNumere();
		cifre = numere;
		cifre.print();
		System.out.println("Inmultirea numerelor este : " + numere.getInmultire());
		System.out.println("Impartirea numerelor este : " + numere.getImpartire());
		
		System.out.println("Adunarea numerelor este " + numere.InmultireTotala(numere.getUnNumar(),
				numere.getAlDoileaNumar(), numere.getAlTreileaNumar()));
		System.out.println(numere.toString());
	}
	
}
