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
public class L5Q4 {

    public static void main(String[] args) {
        //Declare
        Scanner kb = new Scanner(System.in);
        int row;

        //Input&Output
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        row = kb.nextInt();
        int[][] box = new int[row][row];
        System.out.println("The Pascal Triangle with " + row + " row(s)");

        for (int x = 0; x < row; x++) {
            box[x][0] = box[x][x] = 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < row; j++) {
                box[i][j] = box[i - 1][j - 1] + box[i - 1][j];
            }
        }

        for (int pi = 0; pi < row; pi++) {
            for (int pj = 0; pj < row; pj++) {
                System.out.print(box[pi][pj] + "\t");
            }
            System.out.println();

        }

    }
}
