package persoana;

public class MainPersoana {

	public static void main(String args[])
	{
		Persoana persoana = new Persoana();
		String nume = persoana.getNume();
		String adresa = persoana.getAdresa();
		persoana.toString(nume, adresa);
		
		Staff staff = new Staff();
		String scoala = staff.getScoala();
		double plata = staff.getPlata();
		staff.toString(scoala, plata);
	
		Student student = new Student();
		int an = student.getAn();
		double taxa = student.getTaxa();
		String program = student.getProgram();
		student.toString(an, taxa, program);
		
		
	}
	
	
}
