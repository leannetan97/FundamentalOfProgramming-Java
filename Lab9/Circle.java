/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Circle extends Shape {

    private double diameter;
    private Scanner kb = new Scanner(System.in);

    public Circle() {
        super("Circle");
    }

    public void input() {
        System.out.print("Please enter the diameter : ");
        this.diameter = kb.nextDouble();
        calculate();
    }

    public void calculate() {
        setperimeter(2*Math.PI*(this.diameter/2));
        setarea(Math.PI*Math.pow((this.diameter/2), 2));
    }
}
