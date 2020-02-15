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
		Scanner valoriTastatura = new Scanner(System.in);
		
		// implementarea introducerii valorilor laturilor trinunghiului
		System.out.print("Introduceti valoarea primei laturi ");
		a = valoriTastatura.nextDouble();
		System.out.print("Introduceti valoarea laturii nr 2 ");
		b = valoriTastatura.nextDouble();
		System.out.print("Introduceti valoarea laturii nr 3 ");
		c = valoriTastatura.nextDouble();
		
		// calcularea semiperimetrului
		p = (a+ b + c)/2;
		System.out.println("Valoarea semiperimetrului este " + p);
		
		// calcularea ariei lui Heron
		A = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Valoarea ariei lui Heron este " + A);
		
		
	}
}
