/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Lecturer extends PersonProfile{
    protected String[] CC = new String[4];
    protected String[] CN = new String[4];
    protected String[] SS = new String[4];
    protected String[] SEM = new String[4];
    protected String[] CH = new String[4];
    protected String[] NS = new String[4];
    Lecturer(String n,String g,String d ){
        super(n,g,d);
    }
    public void readlect(){
        try{
    int counter=0,i=0;
    Scanner inlect = new Scanner(new FileInputStream("lecturer.txt"));
    while(inlect.hasNextLine()){
    if(counter==6){
        counter=0;
        i++;
    }
     String a = inlect.nextLine();
        switch (counter) {
            case 0:
                CC[i] = a;
                break;
            case 1:
                CN[i] = a;
                break;
            case 2:
                SS[i] =a;
                break;
            case 3:
                SEM[i] = a;
                break;
            case 4:
                CH[i]=a;
            case 5:
                NS[i]=a;
                break;
        }
counter++;
        
    }}
catch(IOException e){
    System.out.println("File Input Problem");
}
    }
    
    
    public double computeCH(String numstd,String cd){
        double chrs=Double.parseDouble(cd);
        double nostd= Double.parseDouble(numstd);
        if(nostd>=150){
            return chrs*3;
        }
            else if(nostd<150&&nostd>=100){
              return chrs*2;
                    }
            else if(nostd<100&&nostd>=50){
                return chrs*1.5;
        }
        else
              return chrs*1;  
        
    }


public void displayL(){
super.display();
    System.out.println("");
     for (int i = 0; i <CC.length; i++) {
         System.out.println("Course Code :"+CC[i]);
         System.out.println("Course Name :"+CN[i]);
         System.out.println("Session :"+SS[i]);
         System.out.println("Semester :"+SEM[i]);
         System.out.println("Credit Hour:"+computeCH(NS[i],CH[i]));
         System.out.println("Number of student:"+NS[i]);
         System.out.println("");
    }

}}