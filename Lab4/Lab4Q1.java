/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author TAN LAY YAN WIF160058
 */
public class Lab4Q1 {

    public static void main(String[] args) {
        int num;
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the integer:");
        num = kb.nextInt();
        
        System.out.print("The factor is:");
        for(int x=1;x<=num;x++){
            if (num%x==0)
                System.out.print( x+";");
        }
  }
    
}
