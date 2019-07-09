/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author TAN LAY YAN WIF160058
 */
public class Lab4Q6 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double M, i, P, C, L, R, N, x, y, z, tint = 0;

        System.out.print("Enter principal amount:");
        P = kb.nextDouble();
        System.out.print("\nEnter interest in %:");
        i = kb.nextDouble();
        System.out.println("\nEnter total number of month(s):");
        N = kb.nextInt();
        System.out.println("Month               Month Payment                       Principal                        Interest                              Unpaid Balance      Total interest ");

        for (double n = 1; n <= N; n++) {
            x = i / (12 * 100);
            y = Math.pow(1 + i / (12 * 100), -N);
            M = (P * x) / (1 - y);
            z = Math.pow(1 + (i / (12 * 100)), -(1 + N - n));
            C = z * M;
            L = M - C;
            R = L / (i / (12 * 100)) - C;
            tint = tint + L;

            System.out.printf("%.0f                    %.2f                              %.2f                          %.2f                              %.2f                                     %.2f\n", n, M, C, L, R, tint);

        }
    }

}
