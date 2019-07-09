/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L7Q3 {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileInputStream("C:/Users/User/Desktop/Testing.txt"));

            int count = 0, lengthofline = 0;
            int sumofchar = 0;
            int words = 0;
            while (in.hasNextLine()) {
                count++;
                String a = in.nextLine();
                lengthofline = lengthofline + a.length();
                sumofchar = sumofchar + lengthofline;
                String[] box = a.split(" ");
                words = words + box.length;

            }
            System.out.println("The number of lines : " + count);
            System.out.println("The number of character : " + lengthofline);
            System.out.println("The number of words :" + words);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } 
    }
}
