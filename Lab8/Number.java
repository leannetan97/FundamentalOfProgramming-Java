/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Random;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Number {

    protected int[] box;
    Random g = new Random();

    public Number() {
        box = new int[10];
        for (int i = 0; i < 10; i++) {
            box[i] = g.nextInt(100);
        }
    }

    public Number(int n) {
        //int size=n;
        box = new int[n];
        for (int i = 0; i < n; i++) {
            box[i] = g.nextInt(100);
        }

    }

    public Number(int n, int r) {
        //int size=n;
        box = new int[n];
        for (int i = 0; i < n; i++) {
            box[i] = g.nextInt(r);
        }
    }

    //method
//transfer method is needed if i set to private
//    public int[] transferarray(){   
//    
//    return box;
//    }
    public void display() {
        for (int i = 0; i < box.length; i++) {
            // System.out.print(box[i]+" "+isEven(box[i]));
            System.out.print(box[i] + " ");
        }
    }

    public void minNumber(int[] box) {
        int min = 100;
        for (int i = 0; i < box.length; i++) {
            if (box[i] < min) {
                min = box[i];
            }
        }
        System.out.print(min);
    }

    public void maxNumber(int[] box) {
        int max = 0;
        for (int i = 0; i < box.length; i++) {
            if (box[i] > max) {
                max = box[i];
            }
        }
        System.out.print(max);
    }

    public void evenNumber(int[] box) {
        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 == 0) {
                System.out.print(box[i] + " ");
            }
        }

    }

//       public boolean isEven (int a){
//            if(a%2==0)
//                return true;
//            else
//                return false;
//       }
//       public String isEven (int a){
//            if(a%2==0)
//                return "Even";
//            else
//                return "Odd";
//       }
    public void squareNumber(int[] box) {
        for (int i = 0; i < box.length; i++) {
            if ((int) Math.sqrt(box[i]) * (int) Math.sqrt(box[i]) == box[i]) {
                System.out.print(box[i] + " ");
            }
        }
    }

    public void primeNumber(int[] box) {

        for (int i = 0; i < this.box.length; i++) {
            int count = 0;
            for (int j = 1; j <= box[i]; j++) {
                if (box[i] % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(box[i] + " ");
            }
        }
    }

    public void average(int[] box) {
        double sum = 0;
        for (int i = 0; i < box.length; i++) {
            sum = sum + box[i];
        }
        double avarage = sum / (box.length);
        System.out.print(avarage);
    }

}
