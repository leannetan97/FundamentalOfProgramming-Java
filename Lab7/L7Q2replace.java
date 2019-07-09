/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L7Q2replace {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileInputStream("reverse.txt"));
            PrintWriter out = new PrintWriter(new FileOutputStream("reverse.txt",true));
            while (in.hasNextLine()) {
                char newin;
                String hold = in.nextLine();
                for (int i = hold.length() - 1; i >= 0; i--) {
                    newin = hold.charAt(i);
                    out.print(newin);

                }
                out.println("");

            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }

}
