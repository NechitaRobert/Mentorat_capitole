<<<<<<< HEAD
import java.util.ArrayList;

public class CursLimbiStraine extends Curs {

	private ArrayList<Curs> cursuriLStraine;
	
	public CursLimbiStraine() {};
	public CursLimbiStraine(int id, String denumire, double pret, ArrayList<Curs> cursuriLStraine) {
		super(id,denumire,pret);
		this.cursuriLStraine = cursuriLStraine;
		cursuriLStraine.add(this);
	}
	@Override
	void adaugaCurs(Curs curs) {
		cursuriLStraine.add(curs);
	}
	@Override
	void afiseazaCursuri() {
		for(Curs curs : cursuriLStraine) {
			System.out.println(curs.toString());
		}
	}
	@Override
	void stergeCurs(int index) {
		cursuriLStraine.remove(index);
	};
=======

public class CursLimbiStraine extends Curs {

	
	public CursLimbiStraine() {};
	public CursLimbiStraine(int id, String denumire, double pret, int tipCurs) {
		super(id,denumire,pret, tipCurs);	
		
	}
	
	
	
	
	

	
	
	
	
>>>>>>> ede2816... actualizare
}
