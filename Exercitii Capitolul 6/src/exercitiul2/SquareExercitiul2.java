package exercitiul2;
    
    // interface for sqaure
    interface Patrat {
	String toString();
}

    // implement interface and inheritance variable from shape class
    public class SquareExercitiul2 extends RectangleExercitiul2 implements Patrat {
	    private double side;
	    
        public SquareExercitiul2() {}
        public SquareExercitiul2(double side, double width, double length) {
		
		super (width, length);
		this.side = side;
		System.out.println("Construtor SquareExercitiul2");
	}
	
	// encapsulation
	public double getSide() {
		return this.side;
	}
	public void setSide(double side) {
		this.side = length;
		
	}
	
	// methods
	@Override
	public String toString() {
		return "SquareExercitiul2 [side=" + side + "]";
	}

}
