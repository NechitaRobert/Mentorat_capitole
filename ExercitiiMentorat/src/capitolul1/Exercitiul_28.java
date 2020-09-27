package capitolul1;
// Sa se afiseze data si ora curenta

// importarea pachetului cu timp si data 
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

// declararea clasei
public class Exercitiul_28 {
	
	// declararea metodei main
	public static void main(String args[])
	{   
		//declararea datelor si afisarea lor
		
		// declararea orei curente
		LocalTime ora = LocalTime.now();
		System.out.println(ora);
		
		// declararea datei curente
		LocalDate data = LocalDate.now();
		System.out.println(data);
		
		// Calendarul curent
		Calendar calendar = Calendar.getInstance();
		System.out.println("Data curenta este : " +  calendar.getTime());
	
	
	}

}
