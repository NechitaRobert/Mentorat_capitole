package exercitiul6;

public class Exceptii extends Exception{

	private int sir[] = new int[10];
	private int cateNumereSunt;
	private int pozitie;
	
	public Exceptii() {}
	public Exceptii(String mesaj) {
		super(mesaj);
	}
	public Exceptii(  int sir[],  int cateNumereSunt, int pozitie) {
		this.sir = sir;
		this.cateNumereSunt = cateNumereSunt;
		this.pozitie = pozitie;
		
	}
		
	private int[] getSir() {
		return sir;
	}
	private void setSir(int[] sir) {
		this.sir = sir;
	}
	private int getCateNumereSunt() {
		return cateNumereSunt;
	}
	private void setCateNumereSunt(int cateNumereSunt) {
		this.cateNumereSunt = cateNumereSunt;
	}
	private int getPozitie() {
		return pozitie;
	}
	private void setPozitie(int pozitie) {
		this.pozitie = pozitie;
	}
	
	
	
	
}
