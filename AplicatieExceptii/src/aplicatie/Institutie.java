package aplicatie;

interface InterfataInstitutie {
	
	void adaugaCurs();
	void afiseazaCurs();
	void afiseazaCursuriProgramare();
	void stergeCurs();
}

public abstract class Institutie implements InterfataInstitutie{

	private String id[] = { "1",   "2",  "3",  "4" ,  "5",  "6" , "7",  "8" , "9", "10", "11", "12", "13", "14", "15",
			               "16" , "17", "18", "19" , "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
	private String pret[] = {"20 lei" , "30 lei", "50 lei", "100 lei", "40 lei", "70 lei", "10 lei", "15 lei",  "23 lei" , "13 lei",
			                 "25 lei",  "90 lei", "32 lei", "43 lei",  "23 lei", "24 lei", "12 lei", "27 lei",  "76 lei" , "25 lei", 
			                 "45 lei",  "67 lei", "64 lei", "56 lei",  "12 lei", "12 lei", "42 lei", "453 lei", "123 lei", "66 lei" };
	private String denumire[] = {"limba romana" ,  "limba engleza", "limba franceza" , "limba germana" , "limba spaniola", 
			                     "limba italiana", "limba chineza", "limba japoneza",  "limba coreeana", "limba armeana", 
			                     "limba suedeza",  "limba catoneza","limba portugheza","limba rusa",     "limba latina", 
			                     "curs java" ,      "curs c++",     "curs pyton",      "curs R",         "curs Ruby",
			                     "curs C#" ,        "curs C",       "curs JavaScript", "curs HTML",      "curs CCS",
			                     "curs assembly" ,  "curs Fortran" ,"curs MATLAB" ,    "curs PHP",       "curs Pascal"};
	
	public Institutie() {}
	public Institutie(String id[], String pret[], String denumire[]) {
		this.id = id;
		this.pret = pret;
		this.denumire = denumire;
	}
	
	public abstract void adaugaCurs();
	public abstract void afiseazaCurs();
	public abstract void afiseazaCursuriProgramare();
	public abstract void stergeCurs();
	
	public String[] getId() {
		return this.id;
	}
	public String[] setId(String id[]) {
		return this.id = id;
	}
	
	public String[] getPret() {
		return this.pret;
	}
	public String[] setPret(String pret[]) {
		return this.pret = pret;
	}
	
	public String[] getDenumire() {
		return this.denumire;
	}
	public String[] setDenumire(String denumire[]) {
		return this.denumire = denumire;
	}
	


}
