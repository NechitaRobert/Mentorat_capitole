package exercitiul2;


public class Exercitiul2 extends Exception {

	private String sirDeCaractere;

	
	public Exercitiul2() {}
	public Exercitiul2(String sirDeCaractere) {
		this.sirDeCaractere = sirDeCaractere;
	}
	
	
	public String getExercitiul2() {
		return sirDeCaractere;
	}
	public String setExercitiul2(String sirDeCaractere) {
		return this.sirDeCaractere = sirDeCaractere;
	}
	
	
	@Override
	public String toString() {
		return "Exercitiul2 [sirDeCaractere=" + sirDeCaractere + "]";
	}
	
	
	
	public static void main(String args[]) {
		
		Exercitiul2 exemplu = new Exercitiul2("rosu");
		System.out.println(exemplu.toString());
		try {
			int index  = exemplu.sirDeCaractere.charAt(5);
			System.out.println((char)index);
		}
		catch (Exception e) {
			System.out.println("Sunt mai putine elemente in string");
		}
		
//		int numar = Integer.valueOf("123");
//		String s = String.valueOf(7);
		
	}
	
	
	
}
