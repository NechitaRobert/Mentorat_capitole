

public abstract class Curs {
   
	protected int id;
	protected String denumire;
	protected double pret;
<<<<<<< HEAD
	
	public Curs() {};
	public Curs(int id, String denumire, double pret) {
		this.denumire = denumire;
		this.id = id;
		this.pret = pret;
	}
	
	abstract void adaugaCurs(Curs curs);
	abstract void afiseazaCursuri();
	//abstract void afiseazaCursuriProgramare();
	abstract void stergeCurs(int index);
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getDenumire() {
		return denumire;
	}
	private void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	private double getPret() {
		return pret;
	}
	private void setPret(double pret) {
		this.pret = pret;
	}
=======
	private int tipCurs;
	
	public Curs() {};
	public Curs(int id, String denumire, double pret, int tipCurs) {
		this.denumire = denumire;
		this.id = id;
		this.pret = pret;
		this.tipCurs = tipCurs;
	}
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getDenumire() {
		return denumire;
	}
	protected void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	protected double getPret() {
		return pret;
	}
	protected void setPret(double pret) {
		this.pret = pret;
	}
	
	public int getTipCurs() {
		return tipCurs;
	}
	public void setTipCurs(int tipCurs) {
		this.tipCurs = tipCurs;
	}
>>>>>>> ede2816... actualizare
	@Override
	public String toString() {
		return "Curs [id=" + id + ", denumire=" + denumire + ", pret=" + pret + "]";
	}
	
	
	
	
}
