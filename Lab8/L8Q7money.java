/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L8Q7money {

    public static void main(String[] args) {
        double sum = 0, minus = 0;
        Money a = new Money(1270.99);
        a.Roundoff();
        a.Count();
        Money b = new Money(100.11);
        b.Roundoff();
        b.Count();
        sum = a.returnamount() + b.returnamount();
        System.out.printf("Addition:%.2f", sum);
        minus = a.returnamount() - b.returnamount();
        System.out.println("");
        System.out.printf("Subtraction:%.2f", minus);
    }

}
