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
public class L8Q1number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Number a = new Number();
        System.out.println("Test case 1 : object a");
        System.out.print("The item of the array : ");
        a.display();
        System.out.println("\nThe even number : ");
        a.evenNumber(a.box);
        System.out.println("\nThe prime number :");
        a.primeNumber(a.box);
        System.out.println("\nThe maximum number :");
        a.maxNumber(a.box);
        System.out.println("\nThe minimum number :");
        a.minNumber(a.box);
        System.out.println("\nThe average number :");
        a.average(a.box);
        System.out.println("\nThe square number :");
        a.squareNumber(a.box);
        System.out.println("");

        Number b = new Number(5);
        System.out.println("\nTest case 2 : object b");
        System.out.print("The item of the array : ");
        b.display();
        System.out.println("\nThe even number : ");
        b.evenNumber(b.box);
        System.out.println("\nThe prime number :");
        b.primeNumber(b.box);
        System.out.println("\nThe maximum number :");
        b.maxNumber(b.box);
        System.out.println("\nThe minimum number :");
        b.minNumber(b.box);
        System.out.println("\nThe average number :");
        b.average(b.box);
        System.out.println("\nThe square number :");
        b.squareNumber(b.box);
        System.out.println("");

        Number c = new Number(4, 50);
        System.out.println("\nTest case 3: object c");
        System.out.print("The item of the array : ");
        c.display();
        System.out.println("\nThe even number : ");
        c.evenNumber(c.box);
        System.out.println("\nThe prime number :");
        c.primeNumber(c.box);
        System.out.println("\nThe maximum number :");
        c.maxNumber(c.box);
        System.out.println("\nThe minimum number :");
        c.minNumber(c.box);
        System.out.println("\nThe average number :");
        c.average(c.box);
        System.out.println("\nThe square number :");
        c.squareNumber(c.box);
        // TODO code application logic here
    }

}
