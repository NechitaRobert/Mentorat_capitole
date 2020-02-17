// e clasa copil a superclasei Persoana

public class Student extends Persoana {

	private int an;
	private double taxa;
	private String program;
	
	public Student() {}
	
	public Student (int an, int taxa, String program, String nume, String adresa)
	{
		super (nume, adresa);
		this.an = an;
		this.taxa = taxa;
		this.program = program;
	}
	
	public int getAn() {
		return this.an;
	}
	public int setAn(int an) {
        return this.an = an;
	}
	
	public double getTaxa() {
		return this.taxa;
	}
	public double setTaxa(int taxa) {
		return this.taxa = taxa;
	}
	
	public String getProgram() {
		return this.program;
	} 
	public String setProgram(String program) {
		return this.program = program;
	}
	
	public String toString (int an, double taxa, String program) {
	    an = 2;
		taxa = 0.35;
		program = "Erasmus";
		return ( super.getNume() + " de pe " + super.getAdresa() + " este in anul " + an + 
				" si este in programul " + program  +
				" si a platit o taxa de " + taxa + " %");
	}
	
	// metode de verificare daca s-a mostenit
	public static void main (String args[])
	{
		// metode de verificare
		Persoana persoana = new Persoana();
		Student mostenire = new Student();
		
		// (int an, int taxa, String program, String nume, String adresa)
		Student mosternire2 = new Student(1, 234 , "erasmus" ,"Gigel" , "Allea aleeilor");
		System.out.println(mosternire2);
			
		int an = mostenire.getAn();
		double taxa = mostenire.getTaxa();
		String program = mostenire.getProgram();
		
		// aici se poate verifica data se returneaza metoda toString din calsa persoana(clasa mama)
		String informatie = mostenire.toString(persoana.getNume() , persoana.getAdresa());
		System.out.println(informatie);
		
		// aici se poate verifica daca se returneaza metoda toString din clasa Student(clasa copil)
		String informatie2 = mosternire2.toString(an, taxa ,program);
		System.out.println(informatie2);
		
		
	}
	
}
