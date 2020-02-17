
public class Point2D {

	private float x;
	private float y;
	
	public Point2D() {}
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	public void setX(float x) {
	     this.x = x;
	}
	
	
	public float getY() {
		return this.y;
	}
	public void setY(float y) {
	     this.y = y;
	}
	
	
	// partea asta nu am inteles-o cu get si set XY de pe tabel :(
	public float getXY () {
		return 2;
	}
	public void setXY (float x, float y) {
		x = 2;
		y = 2;
		
	}
	
	
	public String toString(float x , float y)
	{
		x = 2;
		y = 3;
		return (x  + " " +  y);
	}
	
	public static void main(String args[])
	{
		Point2D matrice = new Point2D();
		float x = matrice.getX();
		float y = matrice.getY();
//		float xy = matrice.getXY();
//		System.out.println();
		//matrice.setXY(x, xy);
		
		String matriceAfisare = matrice.toString(x, y);
		System.out.println(matriceAfisare);
	}
	
}
