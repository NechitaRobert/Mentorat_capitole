// Calcularea arei unui triunghi folosind formula lui Heron

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_16 {

	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor de instanta
		// formula lui Heron(Aria lui Heron) este A = radacina(p*(p-a)*(p-b)*(p-c))
		// unde p este semiperimetru p = (a+b+c)/2
		double a, b, c, p, A;
		
		// creearea scanerului
		Scanner latura_1 = new Scanner(System.in);
		Scanner latura_2 = new Scanner(System.in);
		Scanner latura_3 = new Scanner(System.in);
		
		// introducerea valorilor laturilor trinunghiului
		System.out.print("Introduceti valoarea primei laturi ");
		a = latura_1.nextDouble();
		System.out.print("Introduceti valoarea laturii nr 2 ");
		b = latura_2.nextDouble();
		System.out.print("Introduceti valoarea laturii nr 3 ");
		c = latura_3.nextDouble();
		
		// calcularea semiperimetrului
		p = (a+ b + c)/2;
		System.out.println("Valoarea semiperimetrului este " + p);
		
		// calcularea ariei lui Heron
		A = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Valoarea ariei lui Heron este " + A);
		
		
	}
}
