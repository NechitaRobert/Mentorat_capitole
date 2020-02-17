/*Scrieti o clasa Java denumita “Time” care sa efectueze urmatoarele cerinte:
->3 variabile de instanta(ora, minut si secunda)
->un constructor implicit care sa initializeze cele 3 variabile
->ora trebuie sa fie cuprinsa intre 0-24
->minut/secunda trebuie sa fie cuprinse intre 0-59
*Aceste verificari trebuie integrate in constructor. Daca se insereaza o valoare mai
mare sau mai mica se va afisa un mesaj de eroare si variabila de instanta va ramane
neinitializata(acelasi comportament pentru metodele de get si set)
->metode de set si get pentru cele 3 variabile cu aceleasi conditii ca si in constructor
->o metoda “nextHour” care va returna ora curenta incrementata
->o metoda nextSecond” care va returna secunda curenta incrementata
 * */
import java.util.Scanner;

public class Time {

	private int ora;
	private int minut;
	private int secunda;
	
	public Time() {}
	public Time(int ora, int minut, int secunda)
	{

		if (ora < 24 && ora > 0)
		{
			this.ora = ora;
		}
		else
		{
			System.out.println("Ora nu este corecta, incercati din nou ");
		}this.ora = ora;
		
		if (minut < 24 && minut > 0)
		{
			this.ora = ora;
		}
		else
		{
			System.out.println("Minutele nu sunt corecte, incercati din nou ");
		}this.ora = ora;
		
		if (minut < 24 && minut > 0)
		{
			this.secunda = secunda;
		}
		else
		{
			System.out.println("Minutele nu sunt corecte, incercati din nou ");
		}this.secunda = secunda;
	
	}
	
	public int getOra()
	{
		if (ora < 24 && ora > 0)
		{
			return this.ora;
		}
		else
		{
			System.out.println("Ora nu este corecta, incercati din nou ");
		}
		return this.ora;
	}
	public int setOra(int ora) {
		return this.ora = ora;
	}
	
	
	public int getMinut() {
		if (minut < 24 && minut > 0)
		{
			return this.ora;
		}
		else
		{
			System.out.println("Minutele nu sunt corecte, incercati din nou ");
		}
		return this.ora;
	}
	public int setMinut(int minut) {
		return this.minut = minut;
	} 
	
	
	public int getSecunda() {
		if (minut < 24 && minut > 0)
		{
			return this.secunda;
		}
		else
		{
			System.out.println("Minutele nu sunt corecte, incercati din nou ");
		}
		return this.secunda;
	}
	public int setSecunda(int secunda) {
		return this.secunda = secunda;
	}
	
	
	public int nextHour (int ora)
	{
		return ++ora;
	}
	public int nextSeconda (int secunda)
	{
		return ++secunda;
	}
	
	
	public void printTastatura()
	{
		Scanner valoriTastatura = null;
		valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati ora : ");
		ora = valoriTastatura.nextInt();
		System.out.println("Specificati minutele : ");
		minut = valoriTastatura.nextInt();
		System.out.println("Specificati secundele : ");
		secunda = valoriTastatura.nextInt();
		valoriTastatura.close();
	}
	
	public static void main(String args[])
	{
		
		Time timpul = new Time();
		timpul.printTastatura();
			
		int ora = timpul.getOra();
		int secunde = timpul.getSecunda();
	
		int urmatoareaOra = timpul.nextHour(ora);
		System.out.println("Peste o ora, va fi ora : " + urmatoareaOra);
		int urmatoareSecunda = timpul.nextSeconda(secunde);
		System.out.println("Peste o secunda, vor fi " + urmatoareSecunda + " secunde");
		
	}
	
}
