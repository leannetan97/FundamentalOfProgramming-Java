/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;

/**
 *
 * @author TAN LAY YAN WIF160058
 */
public class Lab4Q2 {

    public static void main(String[] args) {
        // Method 1:
        int num;
        Random kb = new Random();
        num = kb.nextInt(101);
        System.out.println("The random  number is " + num);

        System.out.println("The Prime number from 0 to " + num + ":");
        for (int x = 2; x <= num; x++) {
            if (x == 2 || x == 3 || x == 5 || x == 7 || x % 2 != 0 && x % 3 != 0 && x % 5 != 0 && x % 7 != 0) {
                System.out.print(x + ";");
            }
        }

        // Method 2:
        Random value = new Random();
        int n, counter = 1, val = 3, i, sqrt_ans;
        n = value.nextInt(101);
        boolean check;

        System.out.println("The random number : " + n);
        System.out.print("The first " + n + " prime number:");
        if (n != 0) {
            System.out.print("2;");
        }

        while (counter < n) {
            check = true;
            if (val % 2 == 0) {
                check = false;//if num cn devided by 2, means not prime num, so increase num to chceck the nect num.

            }
            if (check == false) {
                val++;
                continue;
            }

            sqrt_ans = (int) Math.sqrt(val);
            if (sqrt_ans * sqrt_ans == val) {
                check = false;// meanse that it cn be divided by sqrt ans,so it is not prime num.
                //if it is a not prime num ady ,can avoid the for loop , so hv to add another condition.
            }
            for (i = 3; i <= sqrt_ans && check == true; i += 2) {
                if (val % i == 0) {
                    check = false;
                }
            }

            if (check == true) {
                counter++;
                System.out.print(val + ";");
            }
            val++;

        }

        // Method 3:
        // Numbers of prime numbers needed between 0 ~ 100
        int totalPrimeNeeded = new Random().nextInt(101);
        // Log
        System.out.println("Number of prime number(s) needed '" + totalPrimeNeeded + "'");

        // Counter
        int numPrimeFound = 0;
        for (int number = 1; numPrimeFound < totalPrimeNeeded && number < 100; number++) {
            if (isPrimeNumber(number)) {
                System.out.println("Found a prime number :'" + number + "'");
                numPrimeFound++;
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
