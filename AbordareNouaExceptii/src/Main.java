import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		ArrayList <Curs> cursuriProgramare = new ArrayList<Curs>();
		ArrayList <Curs> cursLimbiStraine = new ArrayList<Curs>();
		Scanner s = new Scanner(System.in);
		
		int optiune;
		while(true) {
			System.out.println("1-exit");
			System.out.println("2-adauga curs Programare");
			System.out.println("3-adauga curs Limbi straine");
			System.out.println("4-afisare cursuri limbi straine");
			System.out.println("5-afisare_cursuri_programare ");
			System.out.println("6-sterge curs");
			
			optiune = s.nextInt();
			switch(optiune) {
			case 1:
				System.exit(0);
			break;
			case 2:
				System.out.println("Adauga Curs Programare");
				CursProgramare cProgramare = new CursProgramare(1, "Java", 100, cursuriProgramare);
				
				//cProgramare.adaugaCurs(cProgramare);
			break;
			
			case 3:
				System.out.println("Adauga Curs Limbi Straine");
				CursLimbiStraine cLStraine = new CursLimbiStraine(1, "Java", 100, cursLimbiStraine);
			break;
			case 4:
				for(Curs c : cursLimbiStraine) {
					System.out.println(c.toString());
				}
			break;
			}
		} 
		
	}
}
