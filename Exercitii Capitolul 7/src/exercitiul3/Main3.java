package exercitiul3;

public class Main3  {
	
	Main3() {}
	Main3(String sirDeCaractere) {
		super();
	}
	
	
	Exercitiul3 e;
	public void aruncat(String sirDeCaractere) throws Exercitiul3 {
		 int numarare = 0;
		  for (int i = 0; i < sirDeCaractere.length(); i++) {
			  if(sirDeCaractere.charAt(i) != ' ') {
			    numarare++;
			  }
		  }
		  System.out.println("Are un numar de " + numarare + " caractere");
		  if(numarare < 4 || numarare > 6) {
			  e = new Exercitiul3 ("are " + numarare + " elemente... prea multe elemente ");
			  throw(e);
		  }
		  
		}
	
	public static void main(String args[]) throws Exercitiul3 {
	Main3 test = new Main3();
    try {
    	  test.aruncat("negrisor");
    }
    catch(Exception e) {
    	System.out.println("metoda aruncat trebuie tratata ");
    }	
   }

    
		
	}


