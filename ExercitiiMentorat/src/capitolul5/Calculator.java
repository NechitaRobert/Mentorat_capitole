package capitolul5;
/*Realizeaza o clasa numita Calculator cu urmatoarea structura:
->Un constructor implicit
->o metoda care sa returneze suma a doua numere de tip int (metoda trebuie sa
aiba ca si parametri cele doua numere)
->o metoda care sa returneze suma a doua numere de tip double (metoda trebuie
sa aiba ca si parametri cele doua numere)
->o metoda care sa returneze produsul a trei numere de tip int (metoda
trebuie sa aiba ca si parametri cele trei numere)
->o metoda “print” care va printa la consola valorile celor 3 numere
->O metoda main unde vei testa cerintele de mai sus
 * */

import java.util.Scanner;

public class Calculator {
	
	 private int unu;
	 private int doi;
 	 private int trei;
	 
 	public Calculator()
 	{
 		 
 	}
 	 
 	public Calculator(int primulNumar, int alDoileaNumar, int alTreileaNumar)
	{
		this.unu = primulNumar;
		this.doi = alDoileaNumar;
		this.trei = alTreileaNumar;	
	}
 	

	 public void print()
	 {
		 Scanner valoriTastatura = null;
		 valoriTastatura = new Scanner(System.in);
		 
		 System.out.println("Specificati o valoare pentru primul numar ");
		 unu = valoriTastatura.nextInt();
		 System.out.println("Specificati o valoare pentru al doilea numar ");
		 doi = valoriTastatura.nextInt();
		 System.out.println("Specificati o valoare pentru al treilea numar ");
		 trei = valoriTastatura.nextInt();
		   System.out.println("Valorile sunt : " + this.unu+" "+this.doi+" "+ this.trei);
		 
		 valoriTastatura.close();
		
	 }
 	
 	public int getUnu()
 	{
 		return this.unu;
 	}
 	public double getDoi()
 	{
 		return this.doi;
 	}
 	public int getTrei()
 	{
 		return this.trei;
 	}
 	
 		
 	public int suma() 
 	{
 		return this.unu + this.doi;		
 	}
    public double produs()
    {
    	return this.unu + this.doi;
    }
 	public double produsTreiNumere()
 	{
 		return this.unu * this.doi * this.trei;
 	}
	
	public static void main(String args[])
	{
		
		Calculator constructor = new Calculator();
		constructor.print();
		
		int suma = constructor.suma();
		System.out.println(suma);
		
		double produs = constructor.produs();
		System.out.println(produs);
		
		double produs3numere = constructor.produsTreiNumere();
		System.out.println(produs3numere);
		
	}
	
}
