package capitolul5;
/* Cati constructori are clasa?
2) Scrie implementarea metodei “setSample()” astfel incat x sa fie egal cu
10 si y sa fie egal cu 25.8 dupa executarea metodei
3) Scrie implementarea functiei “print()” astfel incat dupa executarea
acesteia sa printeze valorile x si y.
4) Scrie implementarea constructorului implicit al clasei Sample astfel
incat variabilele de instanta sa fie initializate cu 1;
5) Scrie definitia constructorului cu parametri astfel incat variabila de
instanta x sa fie initializata cu valoarea variabilei a si variabila de
instanta y sa fie initializata cu valoarea variabilei b. (Foloseste
cuvantul cheie “this”)
6) Scrie functia main intr-o clasa separata si creeaza doua obiecte de tip
“Sample” utilizand pe rand cei doi constructori
7) Apeleaza functia print() pentru cele doua obiecte declarate mai sus
 */


import java.util.Scanner;

public class Sample {

	private int x;
	private double y;
	
	public Sample()
	{
		
	}
	
	public Sample(int a, double b)
	{
		this.x = a;
		this.y = b;
	}
	
	public void setSample(double x, double y)
	{
		System.out.println("Numarul x va avea valoarea : " + x);
		System.out.println("Numarul y va avea valoarea : " + y);
		
	}
	
	public void print(int x, double y)
	{
         System.out.println("Numerele sunt " + this.x + this.y);
	
	}


public static void main(String args[])
{
	// 1. are 2 constructori (primii 2)..ultimele 2 sunt functii
	
	int numar;
	double altNumar;
	Scanner valoriTastatura = new Scanner(System.in);
	System.out.println("Specificati un numar : ");
	numar = valoriTastatura.nextInt();
	System.out.println("Speciicati un alt numar");
	altNumar = valoriTastatura.nextInt();
	
	Sample partea2 = new Sample();
	partea2.setSample(10,25.8);
	
	Sample partea3 = new Sample(10, 25.8);
	System.out.println("Numerele sunt " + partea3.x + " " + partea3.y);
	
	Sample partea4 = new Sample();
	partea4.x = numar + 1;
	partea4.y = altNumar + 1;
	System.out.println("Noile numere sunt : " + partea4.x + " " + partea4.y);
	
	Sample partea5 = new Sample(10,25.8);
	System.out.println(partea5.x);
	System.out.println(partea5.y);
	
	Sample partea6 = new Sample(1,2);
	System.out.println(partea6.x + " " + partea6.y);
	
	Sample partea7 = new Sample();
	partea7.print(2,3);
	
	valoriTastatura.close();
	
}




	
	
}
