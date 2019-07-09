/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L7Q2read {

    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("reverse.txt"));
            out.println("Hello Java!");
            out.println("Frist try yar :) ");
            out.println("Be nice to be o ~ ");

            out.close();
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
    }

}
