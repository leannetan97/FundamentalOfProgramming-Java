/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class WeightCalculator {

    private Scanner kb = new Scanner(System.in);
    private double recweight = 0, age = 0, height = 0;

    public WeightCalculator() {

    }

    public void input() {
        System.out.print("Enter your age : ");
        age = kb.nextDouble();
        System.out.print("Enter your height in cm : ");
        height = kb.nextDouble();
    }

    public void recommendWeight() {
        recweight = (height - 100 + age / 10) * 0.9;
    }

    public void display() {
        System.out.println("The recommended Weight is : " + recweight);
    }

}
