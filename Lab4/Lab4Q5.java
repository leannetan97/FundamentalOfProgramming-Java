/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;

/**
 *
 * @author TAN LAY YAN WIF160058
 */
public class Lab4Q5 {

    public static void main(String[] args) {
        Random kb = new Random();
        int rn, x = 1;

        do {
            rn = kb.nextInt();
        } while (rn < 0);

        System.out.println("The random number is " + rn);

        while (rn / 10 != 0) {
            rn=rn/10;
            x = x + 1;
        }

        System.out.println("The number of digit of the positive random number : " + x);
    }

}
