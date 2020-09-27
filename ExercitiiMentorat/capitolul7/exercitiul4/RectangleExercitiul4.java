package exercitiul4;

public class RectangleExercitiul4 extends ShapeExercitiul4 {

	 double lungime;
	 double latime;
	
	public RectangleExercitiul4() {}
	public RectangleExercitiul4(String culoare, double lungime, double latime ) {
		super(culoare);
		System.out.println("Un dreptunghi ");
		this.lungime = lungime;
		this.latime = latime;		
	}
	
	
	// ---------getter si setter nu e obligatoriu-----------
	public double getLungime() {
		return this.lungime;
	}
	public double setLungime(double latime) {
		return this.latime;
	}
	
	
	public double getLatime() {
		return this.latime;
	}
	public double setLatime(double lungime) {
		return this.lungime = lungime;
	}
	
	
	double arie() {
		return lungime*latime;
	}
	public String toString() {
		return "Culoarea dreptunghiului este " + super.culoare + " iar aria este de " + arie() + " cm";
	}
	
	
	//--------- nu e obligatoriu--------------
	public String toString(double lungime, double latime) {
		return "Culoarea dreptunghiului este " + super.culoare + " iar aria este de " + arie() + " cm";
	}
	
	
	public void print() {
		System.out.println("Specificati lungimea dreptunghiului : ");
		lungime = valoriTastatura.nextDouble();
		System.out.println("Specificati latimea dreptunghiului : ");
		latime = valoriTastatura.nextDouble();
		System.out.println("Specificati culoarea cercului : ");
		culoare = valoriTastatura.next();
	}
	
	// test metoda main
	public static void main(String args[])
	{
		RectangleExercitiul4 dreptunghi = new RectangleExercitiul4();	
		dreptunghi.print();
		
		Double lungime = dreptunghi.getLungime();
		System.out.println(lungime);
		Double latime = dreptunghi.getLungime();
		System.out.println(latime);
		String informatieDreptunghi2 = dreptunghi.toString(lungime, latime);
		System.out.println(informatieDreptunghi2);
	}
}

