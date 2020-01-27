// Scrie un program java pentru a sorta un tablou numeric
// si un array de String-uri
import java.util.Arrays;
import java.util.Scanner;


public class Exercitiul_18 {

	public static void main(String args[])
	{
		
		// Metoda simpla
		
		// creearea vectorului si adauarea de valori
		String []sir = {"1", "a", "5", "b", "4"};
		// afisarea valorilor
		System.out.println(Arrays.toString(sir));
		// sortarea valorilor
		Arrays.sort(sir);
		// afisarea valorilor sortate
		System.out.println(Arrays.toString(sir));
		
		
		
		// O mica idee : incearca sa transformi elemente numerice din string in int, 
		// sa le extragi si sa le pui intr-un nou vector si sa fac operatii
		// Nota : documenteaza-te legat de metoda LIFO SI FIFO
		
		// declararea variabilei
		int dimensiune;
		
		// declararea scanerului
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.println("Ce dimensiune a-ti dori sa aiba sirul ? : ");
		dimensiune= valori_tastatura.nextInt();
		
		System.out.println("Specificati ce valori a-ti dori sa aiba sirul : ");
		
		// declararea vectorului
		String []vector = new String[dimensiune];
		
		// citirea vectorului
		for(int i = 0; i < dimensiune; i++ )
		{
			vector[i] = valori_tastatura.next();
		}
		
		// afisarea vectorului
		Arrays.sort(vector);	
		
		// Afisarea rezultatelor
		System.out.println(Arrays.toString(vector));
		
		
	}
	
}
