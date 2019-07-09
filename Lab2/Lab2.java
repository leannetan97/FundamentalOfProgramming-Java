/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Lab2 {

    public static void main(String[] args) {
        // Lab2 Question 1
        double cels ,farenheit; 
        Scanner temperature = new Scanner(System.in);
        System.out.println("Please enter the Temperature(in fahrenheit): ");
        farenheit = temperature.nextDouble();
        cels = (farenheit-32)/1.8;
        System.out.println("The temperature in celsius is:"+cels);
        
        // Lab2 Question 2
        double p, d, r, y, m;
        Scanner payment = new Scanner(System.in);
        System.out.println("Please enter your price of your car: ");
        p = payment.nextDouble();
        System.out.println("Please enter your downpayment: ");
        d = payment.nextDouble();
        System.out.println("Please enter your interest rate in % :");
        r = payment.nextDouble();
        System.out.println("Please enter your Loan duration in year :");
        y = payment.nextDouble();
        m = (p - d) * (1 + r * y / 100) / (y * 12);
        System.out.println(" The monthly payment :" + m);
    
        // Lab 2 Question 3
        float num1, num2, num3;
        double sum, ave;
        Random value = new Random();
        num1 = value.nextInt(101);
        num2 = value.nextInt(101);
        num3 = value.nextInt(101);
        System.out.println("Random number 1:" + num1);
        System.out.println("Random number 2:" + num2);
        System.out.println("Random number 3:" + num3);
        sum = num1 + num2 + num3;
        ave = sum / 3;
        System.out.println("The sum =" + sum);
        System.out.println("The ave=" + ave);
        
        // Lab 2 Question 4
        float valueEnter;
        int money, no50, no20, no10, no5, no1, remain;
        Scanner v = new Scanner(System.in);
        System.out.println("Please enter the amount of the money:");
        valueEnter = v.nextFloat();
        money = (int) (valueEnter * 100);
        no50 = money / 50;
        remain = money % 50;
        no20 = remain / 20;
        remain = remain % 20;
        no10 = remain / 10;
        remain = remain % 10;
        no5 = remain / 5;
        remain = remain % 5;
        no1 = remain;

        System.out.println("The number of 50 cent:" + no50);
        System.out.println("The number of 20 cent:" + no20);
        System.out.println("The number of 10 cent:" + no10);
        System.out.println("The number of 5 cent :" + no5);
        System.out.println("The number of 1 cent :" + no1);
    
        // Lab 2 Question 5
        int num, digitSum, digit1, digit2, digit3, digit4, digit5, temp;
        Random valueRdm = new Random();
        num = valueRdm.nextInt(10001);
        System.out.println("The random number :" + num);

        digit1 = num / 10000;
        temp = num % 10000;
        digit2 = temp / 1000;
        temp = temp % 1000;
        digit3 = temp / 100;
        temp = temp % 100;
        digit4 = temp / 10;
        temp = temp % 10;
        digit5 = temp;
        
        digitSum = digit1 + digit2 + digit3 + digit4 + digit5;
        System.out.println("The sum of the digit :" + digitSum);
    
        // Lab 2 Question 6
        double pValue, rValue, earned;
        int n;
        Scanner amount = new Scanner(System.in);
        System.out.println("Please enter the amount:");
        pValue = amount.nextDouble();
        System.out.println("The interest rate annually (%)");
        rValue = amount.nextDouble();
        System.out.println("The number of years:");
        n = amount.nextInt();

        earned = pValue * Math.pow(1 + rValue / 100, n);

        System.out.print("The money earned after " + n + " years at " + rValue + "% : ");
        System.out.printf("%.2f", earned);
    }
}
