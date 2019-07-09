/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Random;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Dice {
    Random g = new Random();
    protected int d1,d2;
    Dice(){
        
    }
    public void rundice1(){
    d1=g.nextInt(6)+1;
    System.out.println("d1:"+d1);
    
}
public void rundice2(){
    d2=g.nextInt(6)+1;
    System.out.println("d2:"+d2);
}
}
