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
public class L8Q2bankacc {

    public static void main(String[] args) {
        BankAccount a = new BankAccount("ALI", "97000000", "WIF10000");
        a.deposit();
        a.withdraw();
        a.display();

    }

}
