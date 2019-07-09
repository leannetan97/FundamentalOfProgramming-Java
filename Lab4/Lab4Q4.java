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
public class Lab4Q4 {

    public static void main(String[] args) {
        Random system = new Random();
        int total_score = 0, t1 = 0, t2 = 0, d1, d2, x = 1, ed1 = 0, ed2 = 0;

        while (total_score < 100) {
            x++;
            d1 = system.nextInt(6) + 1;
            d2 = system.nextInt(6) + 1;
            ed1 = system.nextInt(6) + 1;
            ed2 = system.nextInt(6) + 1;
            System.out.println("The dice roll by player 1 for the " + x + " is： " + d1);
            if (d1 == 6) {
                System.out.println("Player 1 have another chance to roll again,the dice is :" + ed1);
            }
            System.out.println("The dice roll by player 2 for the " + x + " is: " + d2);
            if (d2 == 6) {
                System.out.println("Player 2 have another chance to roll again,the dice is :" + ed2);
            }

            t1 = t1 + d1 + ed1;
            t2 = t2 + d2 + ed2;

            if (t1 < t2) {
                total_score = t2;
            } else {
                total_score = t1;
            }

        }
        if (t1 >= 100) {
            System.out.println("Player 1 win!");
        }
        if (t2 >= 100) {
            System.out.println("Player 2 win!");
        }
// TODO code application logic here
    }

}
