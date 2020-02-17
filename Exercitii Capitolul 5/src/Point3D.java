
public class Point3D extends Point2D {

	private float z;
	
	public Point3D() {}
	public Point3D(float x, float y, float z) {
		super (x, y);
		this.z = z;
		
	}
	
	public float getZ() {
		return this.z;
	}
	public float setZ(float z) {
		return this.z = z;
	}
	
	
	// la fel ca la point 2D , nu inteleg partea asta
	public float getXYZ() {
		return 3;
	}
	public void setXYZ(float x, float y, float z) {
		x = 3;
		y = 3;
		z = 3;	
	}
	
	
	public String toString(float x , float y, float z)
	{
		x = 3;
		y = 3;
	    z = 3;
		return (x  + " " +  y + " " + z);
	}
	
	public static void main(String args[])
	{
		Point3D point3D = new Point3D();
			
		float x = point3D.getX();
		float y = point3D.getY();
		float z = point3D.getZ();
		
		String structuraCubica = point3D.toString(x,y,z);
		System.out.println(structuraCubica);
	}
	
	
}
