package exemplul2;

import java.io.*;

public class CatalogProduse implements Serializable {

	private String denumire;
	private int pret;
	
		public CatalogProduse(String denumire, int pret) {
		this.denumire = denumire;
		this.pret = pret;
		
	}
	
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	@Override
	public String toString() {
		return "CatalogProduse [denumire=" + denumire + ", pret=" + pret + "]";
	}
	
	
	
}
