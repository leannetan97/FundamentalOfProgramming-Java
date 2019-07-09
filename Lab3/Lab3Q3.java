package lab3;

import java.util.Random;
/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Lab3Q3 {

    public static void main(String[] args) {
        int num;
        String w = "error";
        Random system = new Random();
        num = system.nextInt(6);
        System.out.println("The random number is " + num);

        if (num == 0) {
            w = "zero";
        } else if (num == 1) {
            w = "one";
        } else if (num == 2) {
            w = "two";
        } else if (num == 3) {
            w = "three";
        } else if (num == 4) {
            w = "four";
        } else if (num == 5) {
            w = "five";
        }

        System.out.println(num + " is  " + w + ".");

    }

}
