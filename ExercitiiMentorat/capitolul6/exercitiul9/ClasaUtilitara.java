package exercitiul9;
/*Scrieti o clasa Java denimita “ClasaUtilitara” care sa efectueze urmatoarele cerinte:
->o variabila de instanta de tip int
->un constructor care sa initializeze acea variabila de instanta (foloseste cuvantul cheie this)
->o metoda care sa returneze suma dintre variabila de instanta si o valoare luata de la
argumentul metodei
->o metoda care sa returneze variabila de instanta incrementata
->o metoda care sa primeasca un argument de tip int si sa il returneze decrementat
->o metoda care sa printeze valoarea variabilei de instanta
->o metoda care sa returneze numarul de cifre din variabila de instanta
->o metoda care sa returneze suma cifrelor din variabila de instanta
->o metoda care sa primeasca un argument de tip int si sa returneze acel numar rasturnat
->o metoda care sa primeasca un argument de tip int si sa returneze “true” in caz ca acel
numar este par si “false” in caz ca numarul este impar
->o metoda care sa returneze suma cifrelor pare dintr-un numar
->o metoda care sa primeasca 3 argumente de tip int si sa returneze cel mai mare numar din
cele trei argumente
->o metoda fara argumente care sa returneze un numar generat Random
 * */


import java.util.Random;
import java.util.Scanner;

public class ClasaUtilitara {

	private int numar;
	
	public ClasaUtilitara() {}
	public ClasaUtilitara(int numar) {
		this.numar = numar;
	}
	
	public int getnumar() {
		return this.numar;
	}
	public int setnumar(int numar) {
		return this.numar = numar;
	}
	
    public int suma(int numar) {
    	int altnumar = 2;
    	return numar + altnumar;
    }
	
    public int numarIncrementat(int numar) {
    	return ++numar ; //de ce nu creste
    }
	
    public int numarDecrementat(int numar) {
    	return --numar; // de ce nu scade
    }
	
    public int valoareaVariabileiDeInstanta (int numar) {
    	int unAltNumar = numar;
    	return unAltNumar;
    }
    
    public int numarulDeCifre (int numar) {
    	int cateCifreAreNumarul = 0;
    	while (numar != 0)
    	{
    		numar = numar / 10;
    		cateCifreAreNumarul ++;
    	}
    	return cateCifreAreNumarul;
    }
    
    public int sumaCifrelorDinNumar (int numar) {
    	
    	int sumaCifrelor = 0;
    	while (numar != 0)
    	{
    		numar = numar / 10;
    		sumaCifrelor = sumaCifrelor + numar % 10;
    	}
    	return sumaCifrelor;
    }
    
    public int numarRasturnat (int numar) {
    	int invers = 0;
    	while ( numar != 0)
    	{
    		int cifra = numar % 10;
    		invers = invers * 10 + cifra;
    		numar = numar / 10;
    	}
    	return invers;
    }
    
    public int parImpar (int numar) {
    	if (numar % 2  == 0)
    	{
    		System.out.println("Numarul este par");
    	}
    	else
    	{
    		System.out.println("Numarul este impar");
    	}
    	return numar;
    }	
    	
    public int sumaCifrelorPare(int numar)
    {
    	int sumaPara = 0;
    	while (numar > 0)
    	{
    		int cifra = numar % 10;
    		if (cifra % 2 == 0)
    		{
    			sumaPara = sumaPara + cifra;
    		}
    		numar = numar / 10;
    	}
    	return sumaPara;  	
    }
    
    public int celMaiMareNumar (int primulNumar, int alDoileaNumar, int  alTreileaNumar)
    {  	
        primulNumar = 2;
        alDoileaNumar = 3;
        alTreileaNumar = 5;
        
    	int numarMaxim=0;
    	if (primulNumar > alDoileaNumar && primulNumar > alTreileaNumar )
    	{
    		numarMaxim = primulNumar;
    	}
    	else if (alDoileaNumar > primulNumar && alDoileaNumar > alTreileaNumar )
    	{
    		numarMaxim = alDoileaNumar;
    	}
    	else if (alTreileaNumar > primulNumar && alTreileaNumar > alDoileaNumar )
    	{
    		numarMaxim = alTreileaNumar;
    	}
    	
    	return numarMaxim;
     }
    
    public int aleator() {
    	Random aleator = new Random();
    	int numarAleator = aleator.nextInt(100);
    	return numarAleator;
    }
    
    public void print () {
    	Scanner valoriTastatura = null;
    	valoriTastatura = new Scanner(System.in);
    	System.out.println("Spuneti un numar ");
    	numar = valoriTastatura.nextInt();
    	valoriTastatura.close();
    }
    
    public static void main(String args[])
    {
    	ClasaUtilitara functii = new ClasaUtilitara();
    	functii.print();
    	int numar = functii.getnumar(); 
    	
    	int suma = functii.suma(numar);
    	System.out.println("Suma numerelor este " + suma);
    	int numarIncrementat = functii.numarIncrementat(numar);
    	System.out.println("Numarul urmator este : " + numarIncrementat);
    	int numarDecrementat = functii.numarDecrementat(numar);
    	System.out.println("Numarul anterior este : " + numarDecrementat);
    	int valoareaVariabileiDeInstanta = functii.valoareaVariabileiDeInstanta(numar);
    	System.out.println("Numarul este : " + valoareaVariabileiDeInstanta);
    	int numarulDeCifre = functii.numarulDeCifre(numar);
    	System.out.println("Numarul are " + numarulDeCifre + " cifre");
    	int sumaCifrelorDinNumar = functii.sumaCifrelorDinNumar(numar);
    	System.out.println("Suma cifelor este " + sumaCifrelorDinNumar);
    	int numarRasturnat = functii.numarRasturnat(numar);
    	System.out.println("Numarul invers este : " + numarRasturnat);
    	int parImpar = functii.parImpar(numar);
    	System.out.println("Numarul este " + parImpar);
    	int sumaCifrelorPare = functii.sumaCifrelorPare(numar);
    	System.out.println("Suma cifrelor pare din numar este " + sumaCifrelorPare);
    	int aleator = functii.aleator();
    	System.out.println("Un numar aleator : " + aleator);
    	int celMaiMareNumar = functii.celMaiMareNumar(1,2,3);
    	System.out.println("Cel mai mare numar este : " + celMaiMareNumar);
    	
    }
    
    
}
