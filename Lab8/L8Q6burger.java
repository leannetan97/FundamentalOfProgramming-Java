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
public class L8Q6burger {

    public static void main(String[] args) {
        Burger a = new Burger("ID00001", 10);
        a.sold(10);
        a.sold(10);
        a.displaysold();
        a.total();
        Burger b = new Burger("ID00002", 10);
        b.sold(10);
        b.sold(10);
        b.displaysold();
        b.total();
        b.display();

    }

}
