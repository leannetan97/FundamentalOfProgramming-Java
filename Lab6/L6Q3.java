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
public class L6Q3 {

    public static void main(String[] args) {
        System.out.println("Original array: ");
        int[] box = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 0; j < box.length; j++) {
            System.out.print(box[j] + " ");
        }
        System.out.println("");
        int[] reV = reverseNum(box);
        for (int i = 0; i < reV.length; i++) {
            System.out.print(reV[i] + " ");
        }

    }

    public static int[] reverseNum(int[] box) {
        int[] reV = new int[10];
        for (int i = 0; i < reV.length; i++) {
            reV[i] = box[box.length - 1 - i];
        }
        return reV;
    }
}
