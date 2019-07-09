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
public class Square extends Shape{
    private Scanner kb = new Scanner(System.in);
    private double length;
    
    Square(){
    super("Square");
    }
    
    public void input(){
        System.out.print("Please enter the length or width : ");
        this.length = kb.nextDouble();
        calculate();
    }
    public void calculate(){
    setperimeter(this.length*4);
    setarea(this.length*this.length);
}
            }

