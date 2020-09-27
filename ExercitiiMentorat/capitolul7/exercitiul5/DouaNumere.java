package exercitiul5;

import java.util.Scanner;
public abstract class DouaNumere {

	// creearea variabilelor
	protected int unNumar;
	protected int alDoileaNumar;
	
	// creearea scanerului
	Scanner valoriTastatura = new Scanner(System.in);
	public void print() {}
	
	// abstractizarea metodelor
	abstract int getInmultire();
	abstract int getImpartire();
	public abstract String toString();
	
	// constructorul
	public DouaNumere() {}
	public DouaNumere(int unNumar, int alDoileaNumar) {
		this.unNumar = unNumar;
		this.alDoileaNumar = alDoileaNumar;
	}
	
	// encapsulare(getter si setter) pt variabile
	public int getUnNumar() {
		return this.unNumar;
	}
	public int setUnNumar(int unNumar) {
		return this.unNumar = unNumar;
	}
	
	
	public int getAlDoileaNumar() {
		return this.unNumar;
	}
	public int setAldoileaNumar(int alDoileaNumar) {
		return this.alDoileaNumar = alDoileaNumar;
	}

	
	
	
	
	
	
}
