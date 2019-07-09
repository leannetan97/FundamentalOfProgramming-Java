/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Game {

    private int player;
    String n1, n2;
    private Scanner kb = new Scanner(System.in);
    private Random g = new Random();

    public Game(String p1, String p2) {
        n1 = p1;
        n2 = p2;
        System.out.println("Player 1 (p1) : " + p1);
        System.out.println("Player 2 (p2) : " + p2);
    }

    public void move() {
        int score = 0, dice, sum1 = 0, sum2 = 0;
        System.out.print("Which player start the game first? (Please select 1 or 2) :");
        player = kb.nextInt();
        if (player == 1) {
            while (sum1 < 100 || sum2 < 100) {

                dice = g.nextInt(6) + 1;
                System.out.println("P1: " + dice);
                sum1 = sum1 + dice;
                System.out.println("Sum of the score of p1 :" + sum1);
                if (sum1 >= 100) {
                    System.out.println(n1 + "win!");
                    break;
                }
                System.out.println("");

                dice = g.nextInt(6) + 1;
                System.out.println("P2: " + dice);
                sum2 = sum2 + dice;
                System.out.println("Sum of the score of p2 :" + sum2);
                if (sum1 >= 100) {
                    System.out.println(n2 + "win!");
                    break;
                }
                System.out.println("");

            }
        } else {
            while (sum1 < 100 || sum2 < 100) {

                dice = g.nextInt(6) + 1;
                System.out.println("P2: " + dice);
                sum2 = sum2 + dice;
                System.out.println("Sum of the score of p2 :" + sum2);
                if (sum1 >= 100) {
                    System.out.println(n2 + "win!");
                    break;
                }
                System.out.println("");
                dice = g.nextInt(6) + 1;
                System.out.println("P1: " + dice);
                sum1 = sum1 + dice;
                System.out.println("Sum of the score of p1 :" + sum1);
                if (sum1 >= 100) {
                    System.out.println(n1 + "win!");
                    break;
                }
                System.out.println("");
            }
        }

    }
}
