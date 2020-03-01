package snake;

public class TableBoard {

	private int length;
	private int width;
	private char[][] table;
	
	
	TableBoard(int length, int width)
	{
		this.length = length;
		this.width = width;
		this.table = new char[length][width];
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void init() {
		for(int i  = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if(i == 0 || i == length - 1|| j == 0 || j == width - 1) {
				table[i][j] = '#';
				}
				else {
			    table[i][j] = ' ';	
				}
			}	
		}	
	}
	
	public void viewMatrix() {
		for(int i  = 0; i < length; i++) {
			for (int j = 0; j < width; j++)  {
			  System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}
	
	public void redesenare(int x, int y) {
		for(int i  = 0; i < length; i++) {
			for (int j = 0; j < width; j++)  {
			  if(i == x && j == y) {
				  table[i][j] ='O';
			  }
			}
		}
	}
	
	
	
	
	
}
