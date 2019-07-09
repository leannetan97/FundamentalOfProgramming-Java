package lab3;

import java.util.Scanner;
/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Lab3Q6 {

    public static void main(String[] args) {
        char type;
        int hours, salary = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the number of hours the employee work:");
        hours = keyboard.nextInt();
        System.out.print("Permanent Staff - P \nContract Staff - C \nTemporary Staff - T \nPlease enter the employee type :");
        type = keyboard.next().charAt(0);

        if (type == 'P' || type == 'p') {
            salary = hours * 200;
        } else if (type == 'C' || type == 'c') {
            salary = hours * 150;
        } else if (type == 'T' || type == 't') {
            salary = hours * 100;
        } else {
            System.out.println("Invalid employee type");
        }

        System.out.println("The salary of the employee is " + salary);

    }

}
