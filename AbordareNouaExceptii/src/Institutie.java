import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Institutie {
	private final static int NR_MAX_CURSURI = 30;
	private int id = 0;
	private ArrayList<Curs> listaCursuri;
	

	public Institutie() {
		listaCursuri = new ArrayList<Curs>();
	};

	public void adaugaCurs(int tipCurs, String denumire, double pret) throws PreaMulteCursuri {
		switch (tipCurs) {
		case 0:
			if(id < NR_MAX_CURSURI) {
				CursProgramare programare = new CursProgramare(++id, denumire, pret, 0);
				listaCursuri.add(programare);
			} else {
				throw new PreaMulteCursuri("Institutia suporta doar 30 cursuri");
			}
			
			break;

		case 1:
			if(id < NR_MAX_CURSURI) {
				CursLimbiStraine limbiStraine = new CursLimbiStraine(++id, denumire, pret, 1);
				listaCursuri.add(limbiStraine);
			} else {
				throw new PreaMulteCursuri("Institutia suporta doar 30 cursuri");
			}
			break;
		}
	}

	public void afiseazaCursuri() {
		for (Curs curs : listaCursuri) {
			System.out.println(curs);
		}
	}

	public void stergeCurs(int id) {
		listaCursuri.remove(id);
	}

	public List<Curs> afisareCursuriProgramare() {	
		return listaCursuri.stream().filter(curs -> curs.getTipCurs() == 0).collect(Collectors.toList()); 		
	}
		
		
	public List<Curs> afisareCursuriLimbiStraine() {
	    return listaCursuri.stream().filter(curs -> curs.getTipCurs() == 1).collect(Collectors.toList());
		}
	
	public void ordonareInFunctieDePret() {
	     listaCursuri.stream().sorted(Comparator.comparing(Curs::getPret))
	     .collect(Collectors.toList())
	     .forEach(System.out::println);;
	     
	     
		}

	
	
	
	
	
}

