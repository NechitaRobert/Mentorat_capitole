package exercitiul3;

public class Rectangle extends Shape {
    
	private double lungime;
	private double latime;
	
	public Rectangle() {};
	public Rectangle(String culoare, double latime, double lungime) {
		super(culoare);
		this.lungime = lungime;
		this.latime = latime;
	}
	
	
	public double getLungime() {
		return this.lungime;
	}
	public double setLungime(double lungime) {
		return this.lungime = lungime;
	}
	
	
	public double getLatime() {
		return this.latime;
	}
	public double setLatime(double latime) {
		return this.latime = latime;
	}
		
	@Override
	double getArea() {
		return lungime * latime;
	}
	 // pt a accesa toString automat..da click dreapta pe source
	@Override
	public String toString() {
		return "Rectangle [lungime=" + lungime + ", latime=" + latime + ", getLungime()=" + getLungime()
				+ ", getLatime()=" + getLatime() + ", getArea()=" + getArea() + "]";
	}
	
	public void print() {
		System.out.println("Cati cm are lungimea ? : ");
		lungime = valoriTastatura.nextDouble();
		System.out.println("Cati cm are latimea ? : ");
		latime = valoriTastatura.nextDouble();
	}
	
	// metoda test
	public static void main(String args[])
	{
		Rectangle dreptunghi = new Rectangle();
		dreptunghi.print();
		double arie = dreptunghi.getArea();
		System.out.println("Aria dreptunghiului este de " + arie);
		String informatie = dreptunghi.toString();
		System.out.println(informatie);
	}
	
	
	
}
