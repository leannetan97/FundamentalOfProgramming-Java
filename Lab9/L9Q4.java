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
public class L9Q4 {

    public static void main(String[] args) {
        int op;
        Scanner kb1 = new Scanner(System.in);
        System.out.println("Please Select Your Game.");
        System.out.println("1.Game 1");
        System.out.println("2.Game 2");
        op = kb1.nextInt();
        switch (op) {
            case 1:
                System.out.println("[Game1]");
                game1 a = new game1();
                a.g1();
            case 2:
                System.out.println("[Game2]");
                game2 b = new game2();
                b.g2();
            default:
                break;
        }

    }

}
