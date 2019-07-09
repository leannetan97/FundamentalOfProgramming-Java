package lab3;

import java.util.Random;
/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Lab3Q5 {

    public static void main(String[] args) {
        int p1_1, p1_2, p2_1, p2_2, p1, p2;

        Random insert = new Random();
        p1_1 = insert.nextInt(6) + 1;
        System.out.println("Please enter the first dice score of player 1 :" + p1_1);

        p1_2 = insert.nextInt(6) + 1;
        System.out.println("Please enter the second dice score of player 1 :" + p1_2);

        p2_1 = insert.nextInt(6) + 1;
        System.out.println("Please enter the first dice score of player 2 :" + p2_1);

        p2_2 = insert.nextInt(6) + 1;
        System.out.println("Please enter the second dice score of player 2 :" + p2_2);

        p1 = p1_1 + p1_2;
        p2 = p2_1 + p2_2;

        System.out.println("The total score for player 1 is " + p1);
        System.out.println("The total score for player 2 is " + p2);

        if (p1 > p2) {
            System.out.println("Congratulation Player 1 !");
        } else if (p2 > p1) {
            System.out.println("Congratulation Player 2 !");
        } else {
            System.out.println("Tie !");
        }

    }

}
