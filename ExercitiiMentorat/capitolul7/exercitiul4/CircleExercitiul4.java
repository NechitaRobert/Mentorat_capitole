package exercitiul4;

public class CircleExercitiul4 extends ShapeExercitiul4 {

	// variabila de instanta
	 double raza;
	
	public CircleExercitiul4() {}
	// constructorul
	public CircleExercitiul4(String culoare, double raza)
	{
		// apelam constructorul "Shape"
		// calling Shape constructor
		super(culoare);
		this.raza = raza;
		
	}
	
	
	//------- getter si setter nu e obligatoriu--------- (is not mandatory)
	public double getRaza() {
		return this.raza;
	}
	public double setRaza(double raza) {
		return this.raza = raza;
	}
	
	
	// metoda de calcul pentru aria cercului
	// method to calculate circle area
	double arie() {
		return Math.PI * Math.pow(raza, 2);
	}
	// metoda de afisare 
	public String toString() {
		return "Culoarea cercului este " + super.culoare + 
				" si raza este de : " + arie() + " cm";
	}
	
	
	// ----- nu e obligatoriu -----------------
	public String toString(double raza) {
		return "Culoarea cercului este " + super.culoare + 
				" si raza este de : " + arie() + " cm";
	}

	
	public void print() {
			System.out.println("Specificati raza cercului : ");
			raza = valoriTastatura.nextDouble();
			System.out.println("Specificati culoarea cercului : ");
			culoare = valoriTastatura.next();
		     }
		
	public static void main (String args[])
	{
		CircleExercitiul4 cerc = new CircleExercitiul4();
		cerc.print();
		
		String informatie = cerc.toString();
		System.out.println(informatie);
		
	}
	
	
}
	

