package exercitiul3;

public class Exercitiul3 extends Exception {

   private String sirDeCaractere;
   
   public Exercitiul3() {
	   super();
   }
   public Exercitiul3(String sirDeCaractere) {
	   super(sirDeCaractere);
	   this.sirDeCaractere = sirDeCaractere;
   }
   
   private String getSirDeCaractere() {
	return sirDeCaractere;
   }
   private void setSirDeCaractere(String sirDeCaractere) {
	this.sirDeCaractere = sirDeCaractere;
   }

	
//	public static void main(String args[]) { 
//	
//		 Exercitiul3 exemplu = new Exercitiul3("rosu");
//		 System.out.println(exemplu.toString());
//		 try {
//				int index  = exemplu.sirDeCaractere.charAt(5);
//				System.out.println((char)index);
//			}
//		 catch (Exception e) {
//				System.out.println("Sunt mai putine elemente in string");
//			                 }
//		
//	} 
	
}
	    
		
		
		
	
		
	
		
		
	

