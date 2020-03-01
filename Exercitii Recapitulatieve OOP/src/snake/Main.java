package snake;

public class Main {

	//overloading: ai mai multe metode cu acelasi nume dar parametri diferiti
	//overrideing: ai acceasi metode cu acelasi nume si parametri dar se gasesc in clase diferite
	
	
	public static void main(String args[]) {
		
		Sarpe sarpe = new Sarpe("Robert",2 , 2);
		
		TableBoard tableBoard = new TableBoard(25, 25);
		
		Game snakeGame = new Game(tableBoard, sarpe);
		snakeGame.playGame();
		
	}
	
	
}
