/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Fraction {

    private int n, d;

    public Fraction() {
    }

    public void setmutator(int numerator, int denominator) {
        n = numerator;
        d = denominator;
    }

    public void getaccessor() {
        int n1 = n, n2 = d, rmd = 1;
        while (rmd != 0) {
            rmd = n1 % n2;
            n1 = n2;
            n2 = rmd;

        }

        if (n2 == 0) {
            n = n / n1;
            d = d / n1;
        }
    }

    public void display() {
        System.out.println(n + "/" + d);
    }

}
