package lab3;

import java.util.Scanner;
/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Lab3Q4 {

    public static void main(String[] args) {
        double sales, com = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your total sales: ");
        sales = keyboard.nextDouble();

        if (sales <= 100) {
            com = sales * 0.05;
        } else if (sales > 100 && sales <= 500) {
            com = sales * 0.075;
        } else if (sales > 500 && sales <= 1000) {
            com = sales * 0.1;
        } else if (sales > 1000) {
            com = sales * 0.125;
        }

        System.out.printf("The commision is RM " + "%.2f", com);

    }

}
