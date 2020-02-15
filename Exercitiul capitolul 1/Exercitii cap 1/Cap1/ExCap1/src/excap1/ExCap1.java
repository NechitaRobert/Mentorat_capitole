/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excap1;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class ExCap1 {

    /**
     * @param args the command line arguments
     */
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
       System.out.println("a=");
       int a = console.nextInt();
       
       int b = console.nextInt();
       
       
       System.out.println(a+b);
       System.out.println(a%b);
    }
    
}
