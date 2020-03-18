package bucateleDeAplicatii;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InchidereaAplicatiei {

	public static void main(String args[]) throws InterruptedException {
		
		Thread inchidere = new Thread() {
			public void run() {
			    while(true) {
				    System.out.println("Aplicatia ruleaza");
				    try {
				    	Thread.sleep(100);
				    }
				    catch(InterruptedException exceptie) {
				    	Logger.getLogger(InchidereaAplicatiei.class.getName()).log(Level.SEVERE, null, exceptie );
				    }
			    }	
			}
		};	
		
		inchidere.start();
		Thread.sleep(200);
		System.out.println("inchiderea aplicatiei");
		System.exit(1);
	}


	
}
