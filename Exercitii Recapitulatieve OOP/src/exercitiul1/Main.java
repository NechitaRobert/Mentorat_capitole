package exercitiul1;

public class Main {

	// main method
	public static void main(String args[])
	{
			
		Salarii salarii;
		Tata salariulTata = new Tata();
		salarii = salariulTata;
		salarii.getToString();
		System.out.println(salariulTata.getToString() + salariulTata.getSalariuLunar(200, 5) + " de lei pe an");
		System.out.println(salariulTata.getToString() + salariulTata.getSalariuLunar1(200, 5) + " de lei pe an dupa recalculare");
		System.out.println();
		Mama salariuMama = new Mama();
		salarii = salariuMama;
		salarii.getToString();
		System.out.println(salariuMama.getToString() + salariuMama.getSalariuLunar(160, 6) + " de lei pe an");
		System.out.println(salariuMama.getToString() + salariuMama.getSalariuLunar(100, 6, 3) + " de lei pe an dupa recalculare");
		
		
		
	}
	
}
