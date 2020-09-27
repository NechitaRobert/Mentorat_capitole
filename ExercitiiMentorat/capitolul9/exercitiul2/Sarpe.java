package exercitiul2;

public class Sarpe {

	private String nume;
	private int xSarpe;
	private int ySarpe;
	private SnakeMovement snakeMovements;
	
	Sarpe(String nume , int xSarpe, int ySarpe) {
		this.nume = nume;
		this.xSarpe = xSarpe;
		this.ySarpe = ySarpe;
	}
	
	public String getNume() {
		return this.nume;
	}	
	public String setNume(String nume) {
		return this.nume = nume;
	}
	
	
	public int getxSarpe() {
		return xSarpe;
	}

	public void setxSarpe(int xSarpe) {
		this.xSarpe = xSarpe;
	}

	public int getySarpe() {
		return ySarpe;
	}

	public void setySarpe(int ySarpe) {
		this.ySarpe = ySarpe;
	}

	public SnakeMovement getSnakeMovements() {
		return this.snakeMovements;
	}
	
	
}
