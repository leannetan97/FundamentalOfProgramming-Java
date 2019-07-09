/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author TAN LAY YAN WIF160058
 */
public class Lab4Q3 {

    public static void main(String[] args) {
        int score, maxn, minn, n = 0, sumxx;
        float total, ave, std;
        Scanner kb = new Scanner(System.in);

        System.out.print("Eneter a score [negative score to quit]:");
        score = kb.nextInt();
        maxn = score;
        minn = score;
        total = 0;
        sumxx = 0;

        while (score >= 0) {
            total = score + total;
            n++;
            sumxx = sumxx + (score * score);

            if (score > maxn) {
                maxn = score;
            }
            if (score < minn) {
                minn = score;
            }
            System.out.print("Eneter a score [negative score to quit]:");
            score = kb.nextInt();
        }
        ave = total / n;
        std = (float) Math.sqrt((sumxx - (total * total) / n) / (n - 1));
        System.out.println("Minimum score:" + minn);
        System.out.println("Maximum score:" + maxn);
        System.out.printf("Average score: %.2f\n", ave);
        System.out.printf("Standard deviation: %.2f\n", std);

    }
    // TODO code application logic here
}
