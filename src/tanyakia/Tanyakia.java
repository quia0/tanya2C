
package tanyakia;

import java.util.Scanner;

public class Tanyakia {

   
    public static void main(String[] args) {
        Scanner ki = new Scanner (System.in);
        String nm;
        int byear;
        
        System.out.print("Enter your name: ");
        nm = ki.nextLine();
        
        System.out.print("Enter your birth year: ");
        byear = ki.nextInt();
        
        System.out.print("\nHello " + nm + "your age is" +(2025-byear));
    }
    
}
