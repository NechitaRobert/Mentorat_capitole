package capitolul5;

public class Exercitiul_1 {

	public static void main(String args[])
	{
		StringBuilder sb1 = new StringBuilder("Hello Java");
		// ".delte" sterge toate elementele cuprinse intre pozitia 4 si 8 dintr-un string
		sb1.delete(4, 8);
		System.out.println("Stergere prezentare : "  + sb1);
			
		StringBuilder sb2 = new StringBuilder("Hello java");
		// ".insert" inlocuieste de la pozitia 4 elementul cu altu sau cu un grup de elemente
		sb2.insert(4, "abc");
		System.out.println("Inserare valori " + sb2);
		
		StringBuilder sb3 = new StringBuilder("randomvalue");
		// ".replace" inlocuieste valorile intre pozitia 1 si 4 cu un alt set de valori dar trebuie sa fie egale
		sb3.replace(1, 4, "Amit");
		System.out.println("Inlocuieste valorile " + sb3);
		
		StringBuilder sb4 = new StringBuilder("ABCDE");
		// ".reverse" inverseaza elementele din string
		System.out.println("Scrierea inversa a lui ABCDE e : " + sb4.reverse());
		
		StringBuilder sb5 = new StringBuilder("ABCDEF");
		// ".setCharAt" inlocuieste un caracter din string
		sb5.setCharAt(3, 'x');
		System.out.println("Inlocuim caracterul de la indexul 3 : " + sb5);
		
	}
	
}
