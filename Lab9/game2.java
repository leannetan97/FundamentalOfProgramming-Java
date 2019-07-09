/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class game2 extends Dice {

    private int sum = 0,enter;

    public game2() {
    
    }

    public void g2() {
        Scanner kb = new Scanner(System.in);
        while (sum != 100) {
            if (sum > 100) {
                sum = sum - d1;
            }
            System.out.println("Player(Enter 1 continue):");
            enter = kb.nextInt();
            rundice1();
            sum = sum + d1;
            if (d1 == 6) {
                System.out.println("First time get 6 !Roll again! \nPlayer(Enter 1 continue):");
                enter = kb.nextInt();
                rundice1();
                sum = sum + d1;
                if (d1 == 6) {
                    System.out.println("Second time get 6 !Roll again! \nPlayer(Enter 1 continue):");
                    enter = kb.nextInt();
                    rundice1();
                    sum = sum + d1;
                    if (d1 == 6) {
                        System.out.println("Opps , you gt 6 for the third time ! You wont have any score.");
                        sum = sum - 12;
                    }
                }
                
            }
           System.out.println("Sum of dice for player :" + sum);
        }
        System.out.println("Game2 end.\nSum of dice for player :" + sum);
    }}