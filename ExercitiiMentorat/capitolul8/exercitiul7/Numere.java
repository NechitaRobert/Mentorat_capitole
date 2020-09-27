package exercitiul7;

public class Numere extends Exception {

	private int primulNumar;
	private int alDoileaNumar;
	
	Numere() {}
	Numere(String mesaj) {
		super();
	}
	Numere(int primulNumar, int alDoileaNumar) {
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
	

	
	
	
	
}
