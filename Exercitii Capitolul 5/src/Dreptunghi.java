import java.util.Scanner;

public class Dreptunghi {

	private int lungime;
	private int latime;
	
	public Dreptunghi() {
		System.out.println("Vom folosi getter si setter + costructorul pentru a afisa variabilele si a calcula aria si perimetrul");
	}
	public Dreptunghi(int lungime, int latime) {
		   this.lungime = lungime;
		   this.latime = latime;
	}
	
	public int getlungime()	{
           return this.lungime;
	}
	public int setlungime(int lungime) {
		   return this.lungime = lungime;
	}
	
	public int getlatime() {
		   return this.latime;
	}
	public int setlatime(int latime) {
		   return this.latime = latime;
	}
	
	
	public int perimetru(int lungime, int latime) {
		return 2 * lungime + 2 * latime;
	}
	
	public int arie(int lungime, int latime) {
		return lungime * latime;
	}
	
	
    public void printareTastatura() {
		
	    Scanner valoriTastatura = null;
	    valoriTastatura = new Scanner(System.in);
	    System.out.println("Specificati lungimea dreptunghiului : ");
	    lungime = valoriTastatura.nextInt();
	    System.out.println("Specificati latimea dreptunghiului : ");
	    latime = valoriTastatura.nextInt();
	    valoriTastatura.close();
	}

	public static void main(String args[])
	{
		Dreptunghi dreptunghi = new Dreptunghi();
		dreptunghi.printareTastatura();
		
		int lungime = dreptunghi.getlungime();
		System.out.println("Lungimea dreptunghiului este : " + lungime);
		int latime = dreptunghi.getlatime();
		System.out.println("Latimea dreptunghiului este : " + latime);
		
		double arie = dreptunghi.arie(lungime, latime);
		System.out.println("Aria dreptunghiului este : " + arie);
		int perimetru = dreptunghi.perimetru(lungime, latime);
		System.out.println("Perimetrul dreptunghiului este : " + perimetru);
		
	}
	
}
