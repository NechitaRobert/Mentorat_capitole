// e clasa copil a superclasei Persoana

public class Staff extends Persoana {

	private String scoala;
	private double plata;
	
	public Staff() {}
	public Staff(String scoala, double plata, String nume, String adresa) {
		super (nume, adresa);
		this.scoala = scoala;
		this.plata = plata;
	}
	
	public String getScoala() {
		return this.scoala;
	}
	public String setScoala(String scoala) {
		return this.scoala = scoala;
	}
	
	
	public double getPlata() {
		return this.plata;
	}
	public double setPlata(double plata) {
		return this.plata = plata;
	}
	
	public String toString(String scoala, double plata) {
		scoala = "Sfantul Mihailskov";
		plata = 300;
		return (super.getNume() + " este la scoala " + scoala + " unde a platit o suma de " 
				+ plata + " de lei");
	}
	
	// metoda de verifica daca s-a mostenit
	public static void main(String args[])
	{
		
		Persoana persoana = new Persoana();
		Staff staff = new Staff();
		
		/*String scoala, double plata, String nume, String adresa*/
		Staff staff2 = new Staff ("Scoala mihailskov", 300, "Ghita" , "Aleea armoniei");
		System.out.println(staff2);
		
		String scoala = staff.getScoala();
		double plata = staff.getPlata();
			
		// aici se poate verifica data se returneaza metoda toString din calsa persoana(clasa mama)
		String informatie1 = staff.toString(persoana.getNume() , persoana.getAdresa());
		System.out.println(informatie1);
		
		// aici se poate verifica daca se returneaza metoda toString din clasa Student(clasa copil)
		String informatie2 = staff.toString(scoala, plata); 
		System.out.println(informatie2);
		
	}
	
	
	
}
