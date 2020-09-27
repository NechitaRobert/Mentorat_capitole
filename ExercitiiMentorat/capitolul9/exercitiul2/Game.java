package exercitiul2;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.event.KeyAdapter;

public class Game {

	private TableBoard table;
	private Sarpe snake;
	 
	public Game(TableBoard table, Sarpe snake) {
		this.table = table; 
		this.snake = snake;
		table.init();
	}
	
	public void playGame() {
		int x;
		int y;
		SnakeMovement movements = snake.getSnakeMovements();	
		Scanner miscari = new Scanner(System.in);
		
		System.out.println("Sus: 1");
		System.out.println("Jos: 2");
		System.out.println("Stanga: 3");
		System.out.println("Dreapta: 4");
		
		while(true) {
			int miscare = miscari.nextInt();
			if(miscare <= 4 && miscare >= 1)
			{
				x = snake.getxSarpe();
				y = snake.getySarpe();
				table.redesenare(snake.getxSarpe(), snake.getySarpe());
				table.viewMatrix();
				switch(miscare) {
					case 1:
						//1-mut sarpele cu o pozitie in sus
						//2-redesenez tabla
						--x;
						snake.setxSarpe(x);
						snake.setySarpe(y);
					break;
					case 2:
						x++;
						snake.setxSarpe(x);
						snake.setySarpe(y);
					break;
					case 3:
						y++;
						snake.setxSarpe(x);
						snake.setySarpe(y);
					break;
					case 4:
					    y--;
					    snake.setxSarpe(x);
						snake.setySarpe(y);
				}
				
//				switch(movements) {
//				case case KeyEvent.VK_DOWN: 
//				}
				
				
				
				
			}
		}
		
		
	
	}
	
}
