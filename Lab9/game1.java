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
public class game1 extends Dice {
private int sum1=0,sum2=0;


    game1() {

    }
Scanner kb = new Scanner(System.in);
    public void g1() {
        int enter;
        while (sum1 < 100 && sum2 < 100) {
            System.out.println("Player l(Enter 1 continue):");
            enter = kb.nextInt();
            rundice1();
            rundice2();
            sum1 = sum1 + (d1 + d2);
            System.out.println("Total Sum of dice for player1 :"+sum1);
            if(sum1>=100){
                break;
            }
            while (d1 == d2) {
                System.out.println("Player 1(Enter 1 continue):");
            enter = kb.nextInt();
            rundice1();
                rundice2();
                sum1 = sum1 + (d1 + d2);
                System.out.println("Total Sum of dice for player1 :"+sum1);
                if(sum1>=100){
                break;
            }
            }
            System.out.println("Player 2(Enter 2 continue):");
            enter = kb.nextInt();
            rundice1();
            rundice2();
            sum2 = sum2 + (d1 + d2);
            System.out.println("Total Sum of dice for player2 :"+sum2);
            while (d1 == d2) {
                System.out.println("Player 2(Enter 2 continue):");
            enter = kb.nextInt();
            rundice1();    
            rundice2();
                sum2 = sum2 + (d1 + d2);
                System.out.println("Total Sum of dice for player2 :"+sum2);
            }

        }
        System.out.println("");
        System.out.println("Total Sum of dice for P1:"+sum1);
        System.out.println("Total Sum of dice for P2:"+sum2);
        if (sum2 > sum1) {
            System.out.println("Player2 win!");
        } else if (sum1 > sum2) {
            System.out.println("Player1 win!");
        } else {
            System.out.println("Tie!");
        }
    }


}
