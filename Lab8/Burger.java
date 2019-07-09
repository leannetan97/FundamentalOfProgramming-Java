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
public class Burger {

    private int numpday = 0, increment = 0;
    private static int sum = 0;
    private String name;

    public Burger(String id, int NumsoldperDay) {
        name = id;
        numpday = NumsoldperDay;
    }

    public void sold(int increment) {
        increment = increment;
        numpday = numpday + increment;
    }

    public void displaysold() {
        System.out.println("The total number of burger sold by " + name + " is : " + numpday);

    }

    public void total() {
        sum = sum + numpday;
    }

    public void display() {
        System.out.println("The total of burgers sold by all stall : " + sum);
    }
}
