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
public class Money {

    private int n1 = 0, n5 = 0, n10 = 0, n50 = 0, n100 = 0, n_05 = 0, n_10 = 0, n_20 = 0, n_50 = 0, roff = 0;
    private double amount = 0, rofmoney = 0, cost = 0, rmd = 0, sen = 0;

    public Money(double money) {
        amount = money;
        //cost = money;

    }

    public void Count() {
        cost = amount;
        n100 = (int) cost / 100;
        cost = cost % 100;
        n50 = (int) cost / 50;
        cost = cost % 50;
        n10 = (int) cost / 10;
        cost = cost % 10;
        n5 = (int) cost / 5;
        cost = cost % 5;
        n1 = (int) cost;

        cost = rofmoney;
        cost = cost - (int) rofmoney;
        cost = (int) (cost * 100);
        n_50 = (int) cost / 50;
        cost = cost % 50;
        n_20 = (int) cost / 20;
        cost = cost % 20;
        n_10 = (int) cost / 10;
        cost = cost % 10;
        n_05 = (int) cost / 5;

        System.out.println("Number of RM100 : " + n100);
        System.out.println("Number of RM50 : " + n50);
        System.out.println("Number of RM10 : " + n10);
        System.out.println("Number of RM5 : " + n5);
        System.out.println("Number of RM1 : " + n1);
        System.out.println("Number of 50sen : " + n_50);
        System.out.println("Number of 20sen : " + n_20);
        System.out.println("Number of 10sen : " + n_10);
        System.out.println("Number of 5sen : " + n_05);
    }

    public void Roundoff() {

        cost = (int) amount;
        sen = (amount - cost) * 100;
        //System.out.println("1sen"+sen);
        //sen = sen * 100;
        sen = (int) sen;
        //System.out.println("minus"+sen);
        rmd = sen % 10;
        if (rmd == 8 || rmd == 9) {
            roff = 10;
        } else if (rmd <= 7 && rmd >= 3) {
            roff = 5;
        } else {
            roff = 0;
        }
        rofmoney = cost + ((sen - rmd + roff) / 100);
        //System.out.printf("%.2f",rofmoney);
        //System.out.println("Roff"+roff);
        //System.out.println("rmd"+rmd);
        //System.out.println("sen"+sen);
        //System.out.println("amount"+amount);
        //System.out.println("cost"+cost);
        //System.out.println(rofmoney);
    }

    public double returnamount() {
        return rofmoney;

    }

}
