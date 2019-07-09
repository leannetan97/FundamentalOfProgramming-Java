/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L6Q4 {

    public static void main(String[] args) {
        int a, b;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = kb.nextInt();
        System.out.println("Enter the second number:");
        b = kb.nextInt();
        int gcd = findGCD(a, b);
        System.out.println("The GCD is :" + gcd);
    }

    public static int findGCD(int a, int b) {
        int temp, rmd, n1, n2;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (a % b != 0) {
            rmd = a % b;
            a = b;
            b = rmd;
        }
        n1 = a / b;
        n2 = b;

        if (n1 >= n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
