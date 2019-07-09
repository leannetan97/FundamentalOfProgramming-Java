/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Random;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L5Q2 {

    public static void main(String[] args) {
        Random rdm = new Random();
        int[] box = new int[10];

        for (int i = 0; i < 10; i++) {
            box[i] = rdm.nextInt(21);

            for (int j = 0; j < i; j++) {
                if (box[i] == box[j]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(box[i] + ";");
        }

    }
}
