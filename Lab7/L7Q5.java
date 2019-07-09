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
public class L7Q5 {

    public static void main(String[] args) {
        try {
            //Scanner in1 = new Scanner(new FileInputStream("product.txt"));
            Scanner in2 = new Scanner(new FileInputStream("order.txt"));

            System.out.println("ProductID\tProdectName\tOrderQuantity\tPricePerUnit\tTotalPrice");
            while (in2.hasNextLine()) {
                String b = in2.nextLine();
                String[] box2 = b.split(",");

                Scanner in1 = new Scanner(new FileInputStream("product.txt"));
                while (in1.hasNextLine()) {
                    String a = in1.nextLine();
                    String box1[] = a.split(",");

                    if (box2[1].equalsIgnoreCase(box1[0])) {
                        double total = Double.parseDouble(box1[2]) * Double.parseDouble(box2[2]);
                        System.out.printf(box1[0] + "\t" + box1[1] + "\t%.0f   \t%.2f   \t%.2f", Double.parseDouble(box2[2]), Double.parseDouble(box1[2]), total);
                    }

                }
                System.out.println("");
            }

            in2.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }

    }
}
