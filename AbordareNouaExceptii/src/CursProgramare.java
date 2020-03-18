import java.util.ArrayList;

public class CursProgramare extends Curs {

	private ArrayList <Curs> cursuriProgramare;
	public CursProgramare() {};
	public CursProgramare(int id, String denumire, double pret, ArrayList<Curs> cursuriProgramare) {
		super(id,denumire,pret);
		this.cursuriProgramare = cursuriProgramare;
		cursuriProgramare.add(this);
	}
	
	@Override
	void adaugaCurs(Curs curs) {
		cursuriProgramare.add(curs);
		
	}
	@Override
	void afiseazaCursuri() {
		for (Curs curs : cursuriProgramare) {
			System.out.println(curs.toString());
		}
		
	}
	@Override
	void stergeCurs(int index) {
		cursuriProgramare.remove(index);
		
	}
	
	public void afisareCursuriProgramare() {
		this.afiseazaCursuri();
	}
	
	
	
}
