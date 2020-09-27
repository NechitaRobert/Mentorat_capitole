package exercitiul7;
/*Scrieti o clasa Java denumita “DataCalendaristica” care sa efectueze urmatoarele cerinte:
->3 variabile de instanta(zi, luna, an)
->constructor care sa initializeze cele 3 variabile
->metode de set si get pentru fiecare variabila
->o metoda setDate care seteaza valoarea fiecarei variabile de instanta prin argumentele
sale
->o metoda “toString” care sa printeze data in formatul: “dd/mm/yyyy”
 * */

// nota : am incercat sa fac sa-mi afiseze data curenta cand se executa codul

import java.util.Calendar;
import java.util.Date;

public class DataCalendaristica {

	// creearea variabilelor
	private Date zi;
	private Date luna;
	private Date an;
	
	// creearea constructorului
	public DataCalendaristica() {}
	public DataCalendaristica(Date zi, Date luna, Date an) {
		this.zi = zi;
		this.luna = luna;
		this.an = an;
	}
	
	// creearea setter si getter
	public Date getZi() {
		return this.zi;
	}
	public Date setZi(Date zi) {
		return this.zi = zi;
	}
	
	
	
	public Date getLuna() {
		return this.luna;
	}
	public Date setLuna(Date luna) {
		return this.luna = luna;
	}
	
	
	
	public Date getAn() {
		return this.an;
	}
	public Date setAn(Date an) {
		return this.an = an;
	}
	
	
	// creearea metodelor de a returna ziua de azi, luna de azi, si anul de azi
	// din pacate nu stiu cum sa fac sa-mi returneze toate 3 valori intr-o singura metoda asa ca am facut separat
	public int setDate1 (int zi )
	{
		Calendar calendar = Calendar.getInstance();
		zi = calendar.get(Calendar.DAY_OF_MONTH);
		return zi;	
	}
	
	public int setDate2 (int luna )
	{
		Calendar calendar = Calendar.getInstance();
		luna = calendar.get(Calendar.MONTH);
		// o ia de la 0 nu de la 1 deci luna ianuarie va afisa luna 0 , nu luna 1
		// pentru a afisa luna specifica adaugam un +1
		return luna + 1;
	}
	public int setDate3 (int an )
	{
		Calendar calendar = Calendar.getInstance();
		an = calendar.get(Calendar.YEAR);
		return an;
	}
	 
	// metoda in care va returna ziua calendaristica de astazi
	public String toString(int zi  , int luna, int an) {
		return "DataCalendaristica [zi=" + zi + ", luna=" + luna  + ", an=" + an + "]";
	}
	
	// metoda main
	public static void main(String args[])
	{
		DataCalendaristica data = new DataCalendaristica();
			
		// returneaza fiecare element din data calendaristica
		// nota : trebuie pusa o valoare aici oricare pt a functiona codul
		int ziuaDeAzi = data.setDate1(01); // oricum valoarea respectiva nu va fi luata in considerare
		System.out.println("Zi : " + ziuaDeAzi);
		int lunaDeAzi = data.setDate2(1);
		System.out.println("Luna : " + lunaDeAzi);
		int anulDeAzi = data.setDate3(2020);
		System.out.println("An : " + anulDeAzi);
		
		// retunarea metodei toString
		String dataDeAzi = data.toString(ziuaDeAzi, lunaDeAzi , anulDeAzi);
		System.out.println(dataDeAzi);
	
		
		
	}
	
	
	
	
	
}
