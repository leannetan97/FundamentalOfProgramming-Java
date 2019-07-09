/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L6Q5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random g = new Random();
        int n1, n2, ans, marks = 0, result;
        do {
            n1 = g.nextInt(13);
            n2 = g.nextInt(13);
            System.out.println("Enter a negative number to quit:");
            System.out.print(n1 + " x " + n2 + "= ");
            ans = kb.nextInt();
            result = check(n1, n2, ans);
            marks = marks + result;
        } while (ans >= 0);
        System.out.println("Your Score is " + marks + ".");

    }

    public static int check(int n1, int n2, int ans) {
        int result;
        if (n1 * n2 == ans) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

}
