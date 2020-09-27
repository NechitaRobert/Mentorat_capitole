package capitolul3;
// Scrieti un program JAVA in care sa inversati valorile unui sir/ array/ vector

import java.util.Scanner;
import java.util.Arrays;

public class Exercitiul_26 {

	public static void main(String args[])
	{
		
		// declararea variabilelor
		int dimensiune;     // variabila in care specificam dimensiunea sirului
		int i = 0;          // inceputul vectorului
		int j = 0;          // capatul vectorului
		int temporar;       // variabila temporara in care ne va ajuta sa schimbam valorile intre ele
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Ce dimensiune a-ti dori sa aiba vectorul ");
		dimensiune = valoriTastatura.nextInt();
		System.out.println("Specificati ce valori contine vectorul ");
		
		// creearea vectorului
		int vector[] = new int[dimensiune];
		
		// citirea vectorului
		for ( i = 0; i < dimensiune; i++)
		{
			vector[i] = valoriTastatura.nextInt();
		}
		// afisarea vectorului cu valorile introduse
		System.out.println("Sirul initial este " + Arrays.toString(vector) + " ");
		
		// formula de mai jos e pt a ajuta computerul sa citeasca de la capatul vectorului
		// el va incepe intai de la numarul declarat la dimensiune dupa care cu ajutorul formulei 
		// de mai jos va incerca sa citeasca vectorul invers
		// formula matematica aprox arata asa :     0(j) = dimensiune -0(i) -1;  // j fiind ultima valoare din vector
		// va functiona gen asa : dimensiune = 5 => 5(j) = dimensiune -0(i) -1;  // i fiind prima  valoare din vector
		// dupa care va tot decremeta               5(j) =          5 -0(i) -1; => 4(j)
		//                                          4(j) =          4 -0(i) -1; => 3(j);
		j = dimensiune -i -1;
		
		for (i = 0; i < dimensiune / 2; i++)
		{
			// aici vom face schimb de valori cu ajutorul unei variabile temporare
			temporar  = vector[i];
			vector[i] = vector[j];
			vector[j] = temporar;
				
		}
		// afisarea valorilor vectorului sub forma inversa
		System.out.println("Sirul inversat este " + Arrays.toString(vector) + " ");
		
	}
	
}
