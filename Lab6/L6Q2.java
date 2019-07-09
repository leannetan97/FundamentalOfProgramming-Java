/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L6Q2 {

    public static void main(String[] args) {
        System.out.println("Triangle:");
        System.out.print("  ");
        multiPrint(1, '*');
        System.out.print("\n ");
        multiPrint(3, '*');
        System.out.println("");
        multiPrint(5, '*');
        System.out.println("");

        for (int space = 2, star = 1; star <= 5; space--, star += 2) {
            multiPrint(space, ' ');
            multiPrint(star, '*');
            System.out.println("");
        }

        System.out.println("\nDiamond:");
        System.out.print("  ");
        multiPrint(1, '*');
        System.out.print("\n ");
        multiPrint(3, '*');
        System.out.print("\n");
        multiPrint(5, '*');
        System.out.print("\n ");
        multiPrint(3, '*');
        System.out.print("\n  ");
        multiPrint(1, '*');
    }

    public static void multiPrint(int n, char c) {
        for (int i = n; i > 0; i--) {
            System.out.print(c);
        }
    }
}
