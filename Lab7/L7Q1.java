/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L7Q1 {

    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("index.htm"));
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            while (in.hasNextLine()) {
                out.println(in.nextLine());

            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }

}
