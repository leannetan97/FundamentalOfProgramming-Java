/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Random;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L6Q1 {

    public static void main(String[] args) {
        Random g = new Random();
        int max;
        int[] box = new int[10];
        box[0] = max = g.nextInt(101);

        System.out.print(box[0] + ";");
        for (int i = 1; i < 10; i++) {
            box[i] = g.nextInt(101);
            System.out.print(box[i] + ";");

            max = maxNum(max, box[i]);

        }
        System.out.println("The maximum number :" + max);
    }
    
    public static int maxNum(int n1, int n2) {
        int max;
        if (n1 >= n2) {
            max = n1;
        } else {
            max = n2;
        }

        return max;
    }
}
