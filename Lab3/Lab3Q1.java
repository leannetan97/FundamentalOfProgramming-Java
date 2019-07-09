package lab3;

import java.util.Scanner;
/**
 *
 * @author Tan Lay Yan WIF160058
 */

public class Lab3Q1 {

    public static void main(String[] args) {

        int enter;
        String shape;

        Scanner num = new Scanner(System.in);

        System.out.print("1.Square \n 2. Circle \n 3. Triangle \n 4. Rectangle \n Enter a number to display the shape : ");
        enter = num.nextInt();
        switch (enter) {
            case 1:
                System.out.println("* * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("* * * *");
                System.out.println("\nSquare");
                break;
            case 2:
                System.out.println("       *   *   *");
                System.out.println("     *          *");
                System.out.println("    *            *");
                System.out.println("    *            * ");
                System.out.println("    *            *");
                System.out.println("     *          *");
                System.out.println("       *   *   * ");
                System.out.println("\nCirlce");
                break;
            case 3:
                System.out.println("     *");
                System.out.println("   *   *");
                System.out.println("  *     *");
                System.out.println(" *       *");
                System.out.println("* * * * * *");
                System.out.println("\nTriangle");
                break;
            case 4:
                System.out.println("* * * * * * *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("* * * * * * *");
                System.out.println("\nRectangle");
                break;
            default:
                System.out.println("Error!");
                break;
        }
        System.out.println(enter);
    }
}
