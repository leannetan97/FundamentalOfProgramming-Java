/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L5Q5 {

    public static void main(String[] args) {
        int box1[] = {1, 9, 2, 8, 5, 8, 9, 5, 8, 2, 3, 8, 2, 8, 3, 6, 9, 8, 2, 3, 9, 6, 8, 2, 3, 9, 8, 3, 2, 9};
        int box2[] = {0, 0, 8, 9, 7, 5, 7, 9, 3, 7, 2, 6, 3, 8, 3, 6, 9, 8, 2, 3, 6, 8, 9, 2, 3, 8, 9, 6, 8, 2};
        int[] box3 = new int[30];
        int add, in = 0;

        for (int i = box1.length - 1; i >= 0; i--) {
            add = box1[i] + box2[i] + in;
            box3[i] = (add) % 10;
            in = add / 10; // in= the carrier
        }
        System.out.println("ANS: ");
        for (int i = 0; i < box3.length; i++) {
            System.out.print(box3[i]);
        }

    }

}
