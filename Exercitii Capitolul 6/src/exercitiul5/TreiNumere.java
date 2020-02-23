package exercitiul5;

public class TreiNumere extends DouaNumere {
	
	// declararea variabilei globale
	private int alTreileaNumar;
	
	// creearea constructorilor si mostenirea variabilelor din clasa DouaNumere
	public TreiNumere() {}
	public TreiNumere(int unNumar, int alDoileaNumar, int alTreileaNumar) {
		super(unNumar, alDoileaNumar);
		this.alTreileaNumar = alTreileaNumar;
	}
	
	// getter si setter
	public int getAlTreileaNumar() {
	   return this.alTreileaNumar;
	}
	public int setAlTreileaNumar(int alTreileaNumar) {
	   return this.alTreileaNumar = alTreileaNumar;
	}
	
	// metodele abstracte
	@Override
	int getInmultire() {
		return (unNumar * alDoileaNumar);
	}
	@Override
	int getImpartire() {
		return (unNumar / alTreileaNumar);
	}
	@Override
	public String toString() {
		return "TreiNumere [alTreileaNumar=" + alTreileaNumar + ", unNumar=" + unNumar + ", alDoileaNumar="
				+ alDoileaNumar + "]";
	}
	
	
	
	// polimorfism supraincarcare -- aici nu inteleg de ce nu merge corect
	int InmultireTotala (int unNumar, int alDoileaNumar, int alTreileaNumar) {
		return (unNumar * alDoileaNumar * alTreileaNumar);
	}
	
	// polimorfism supradefinire
	public void print() {
		System.out.println("Specificati primul numar : ");
		unNumar = valoriTastatura.nextInt();
		System.out.println("Specificati al doilea numar : ");
		alDoileaNumar = valoriTastatura.nextInt();
		System.out.println("Specificati al treilea numar : ");
		alTreileaNumar = valoriTastatura.nextInt();
	}
	
	
	// testare
	public static void main(String args[]) {
		
		TreiNumere numere = new TreiNumere();
		numere.print();
		System.out.println("Inmultirea numerelor este : " + numere.getInmultire());
		System.out.println("Impartirea numerelor este : " + numere.getImpartire());
		
		System.out.println("Inmultirea tuturor numerelor este  " + numere.InmultireTotala(numere.getUnNumar(),
				numere.getAlDoileaNumar(), numere.getAlTreileaNumar()));
		System.out.println(numere.toString());
		
		
	}
	
}
