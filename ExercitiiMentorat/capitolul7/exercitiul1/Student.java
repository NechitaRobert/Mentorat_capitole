package exercitiul1;

interface interfataStudent {
	void toString(int an, double taxa, String program);
} 


public class Student extends Persoana implements interfataStudent {

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
	
	
	public void toString (int an, double taxa, String program) {
	    an = 2;
		taxa = 0.35;
		program = "Erasmus";
		System.out.println(super.getNume() + " de pe " + super.getAdresa() + " este in anul " + an + 
				" si este in programul " + program  +
				" si a platit o taxa de " + taxa + " % din suma");
	}
	
	
	
}
