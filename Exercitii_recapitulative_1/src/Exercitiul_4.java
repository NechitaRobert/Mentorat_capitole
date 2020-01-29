import java.util.Scanner;

public class Exercitiul_4 {

    public static void main(String args[])
    {
        int matrice[][] = new int[3][3];
        int rand = matrice.length;
        System.out.println(rand);
        int coloana = matrice[0].length;
        System.out.println(coloana);

        Scanner valoriTastatura = new Scanner(System.in);


        for (int i = 0; i < rand; i++)
        {
            for (int j = 0; j < coloana; j++)
            {
                System.out.println("Valoare la coordonatele " + i + j);
                matrice[i][j] = valoriTastatura.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < rand; i++)
        {
            for(int j = 0; j < coloana; j++)
            {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        // nota fa pe foaie cu coordonatele
        int matriceInversa[][] = new int[rand][coloana];

        for (int i = 0; i < rand; i++) {
            for (int j = 0; j < coloana; j++) {
                matriceInversa[i][j] = matrice[rand-i-1][coloana-j-1];
            }
        }

        System.out.println("Matrice inversa:");
        for (int i = 0; i < rand; i++)
        {
            for(int j = 0; j < coloana; j++)
            {
                System.out.print(matriceInversa[i][j] + " ");
            }
            System.out.println();
        }

    }

}
