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
public class Rectangle extends Shape {
    private double length,width;
    private Scanner kb = new Scanner(System.in);
    
    Rectangle(){
        super("Rectangle");
    }
    public void getinput(){
        System.out.print("Please enter the length and width : ");
        this.length = kb.nextDouble();
        this.width = kb.nextDouble();
        calculate();
    }
    public void calculate(){
       setperimeter(this.length*2+this.width*2);
       setarea(this.length*this.width);
    }
    
}
