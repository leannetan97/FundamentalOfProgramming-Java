/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L5Q1 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int i, j, t;

        System.out.println("3 by 3 Matrix");
        int matrix[][] = new int[3][3];
        int[][] matrixr = new int[3][3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j <= 2; j++) {
                matrix[i][j] = kb.nextInt();

            }
        }
        System.out.println("The 3 by 3 Matrix :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println("");
        }

        System.out.println("After rotates 90 degrees clockwise");

        matrixr[0][0] = matrix[2][0];
        matrixr[2][0] = matrix[2][2];
        matrixr[2][2] = matrix[0][2];
        matrixr[0][2] = matrix[0][0];

        matrixr[0][1] = matrix[1][0];
        matrixr[1][0] = matrix[2][1];
        matrixr[2][1] = matrix[1][2];
        matrixr[1][2] = matrix[0][1];

        matrixr[1][1] = matrix[1][1];

        for (i = 0; i < 3; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matrixr[i][j]);
            }
            System.out.println("");
        }

    }

}
