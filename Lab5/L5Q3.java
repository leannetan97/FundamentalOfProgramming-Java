/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L5Q3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rdm = new Random();
        int insert, low, high, middle, t;
        int[] box = new int[20];

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < box.length; i++) {
            box[i] = rdm.nextInt(101);
            System.out.print(box[i] + ";");

        }
        System.out.println("\nArray in desecending order");
        for (int i = 1; i < box.length; i++) {
            for (int j = 0; j < box.length - 1; j++) {
                if (box[j] < box[j + 1]) {
                    t = box[j];
                    box[j] = box[j + 1];
                    box[j + 1] = t;
                }
            }

        }
        for (int j = 0; j < box.length; j++) {
            System.out.print(box[j] + ";");

        }

        System.out.println("\nEnter a number to search");
        insert = kb.nextInt();

//LINEAR SEARCH
        int loopLinear = 0;
        boolean check = false;
        System.out.print("\nLinear Search");
        Linear:
        {
            for (int i = 0; i < box.length; i++) {
                if (box[i] == insert) {
                    check = true;
                    break Linear;
                }
                loopLinear++;
            }
        }
        if (check == true) {
            System.out.println("-" + loopLinear + " loop(s)");
            System.out.println("-" + insert + "found");
        } else {
            System.out.println("-" + insert + "not found");
        }

//BINARY SEARCH
        int LoopBi = 0;
        low = 0;
        high = box.length - 1;

        System.out.print("\nBinary search");
        Binary:
        {
            while (low <= high) {

                middle = (low + high) / 2;
                if (box[middle] == insert) {
                    check = true;
                    break Binary;
                } else if (insert < box[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
                LoopBi++;
            }
        }
        if (check == true) {
            System.out.println("-" + LoopBi + " loop(s)");
            System.out.println("-" + insert + "found");
        } else {
            System.out.println("-" + insert + "not found");
        }
    }

}
