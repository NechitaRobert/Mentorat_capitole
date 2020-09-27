package exercitiul5;

public class Numere extends Exception {

	private int primulNumar;
	private int alDoileaNumar;
		
	public Numere() {}
	public Numere(String string) {
		super();
	}
	public Numere(int primulNumar, int alDoileaNumar) {
		this.primulNumar = primulNumar;
		this.alDoileaNumar = alDoileaNumar;
	}
	
	
	public int getPrimulNumar() {
		return primulNumar;
	}
	public void setPrimulNumar(int primulNumar) {
		this.primulNumar = primulNumar;
	}
	public int getAlDoileaNumar() {
		return alDoileaNumar;
	}
	public void setAlDoileaNumar(int alDoileaNumar) {
		this.alDoileaNumar = alDoileaNumar;
	}
	
	
	public void f(int primulNumar, int alDoileaNumar) throws Numere {
	   	if (primulNumar / alDoileaNumar == 0) {
	   		throw new Numere("nu este egal cu 0");
	   	}
	   	else {
	   		System.out.println("Este corect");
	   	}
	}
	
	public void g() {
		try {
			f(2,4);
		}
		catch(Exception e) {
			System.out.println("rezultatul ca sa fie 0, primul numar trebuie sa fie 0");
		}
	}
	
	public static void main(String args[]) {
		Numere numere = new Numere();
		numere.g();
	}
	
	
}
