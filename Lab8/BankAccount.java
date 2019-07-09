/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class BankAccount {

    private String name, ic, passport;
    private int deposit = 0, withdraw = 0;
    private Scanner kb = new Scanner(System.in);

    public BankAccount(String name, String ic, String passport) {
        this.name = name;
        this.ic = ic;
        this.passport = passport;
    }

    public void deposit() {
        System.out.print("Enter deposit amount : RM");
        deposit = kb.nextInt();
    }

    public void withdraw() {
        System.out.print("Enter withdraw amount : RM");
        withdraw = kb.nextInt();
    }

    public void display() {
        //System.out.println("The deposit= "+ deposit);
        //System.out.println("The withdraw= "+ withdraw);
        System.out.println("The current balance = RM" + (deposit - withdraw));
    }

}
