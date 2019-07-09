package lab3;

import java.util.Scanner;
/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Lab3Q2 {

    public static void main(String[] args) {
        int num1, num2, ans;
        char simbol;
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard1 = new Scanner(System.in);
        System.out.print("Enter two integer number:");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        System.out.print("Enter the operand:");
        String iput = keyboard1.nextLine();
        simbol = iput.charAt(0);

        if (simbol == '+') {
            ans = num1 + num2;
            System.out.println(num1 + "" + simbol + "" + num2 + " = " + ans);
        } else if (simbol == '-') {
            ans = num1 - num2;
            System.out.println(num1 + "" + simbol + "" + num2 + " = " + ans);
        } else if (simbol == '*') {
            ans = num1 * num2;
            System.out.println(num1 + "" + simbol + "" + num2 + " = " + ans);
        } else if (simbol == '/') {
            ans = num1 / num2;
            System.out.println(num1 + "" + simbol + "" + num2 + " = " + ans);
        } else if (simbol == '%') {
            ans = num1 % num2;
            System.out.println(num1 + "" + simbol + "" + num2 + " = " + ans);
        } else {
            System.out.println("Operand is not valid.");
        }

    }

}
