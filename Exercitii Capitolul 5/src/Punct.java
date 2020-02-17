/*Scrieti doua clase Java denumite “Punct” si “Triunghi”:
clasa Punct:
->doua variabile de instanta(x, y) care reprezinta coordonatele
->constructor care sa initializeze acele variabile
->metode de set si get pentru cele doua variabile
clasa Triunghi:
->3 variabile de instanta de tip “Punct”
->un constructor care sa initializeze cele 3 puncte
ex: this.punct1 = new Punct(1,2);
->o metoda care sa printeze perimetrul triunghiului
->o metoda care sa specifice tipul triunghiului (Echilateral, Isoscel..)*/

// nota : incearca si cu distantele euclidiene

public class Punct {

	protected int punct1;
	protected int punct2;
	
	public Punct() {}
	public Punct(int punct1 , int punct2) {
		this.punct1 = punct1;
		this.punct2 = punct2;
	}
	
	public int getPunct1() {
		return this.punct1;
	}
	public int setPunct1(int punct1) {
		return this.punct1 = punct1;
	}
	
	
	public int getPunct2() {
		return this.punct2;
	}
	public int setPunct2(int punct2) {
		return this.punct2 = punct2;
	}
	
	
	
	
	
	
}
