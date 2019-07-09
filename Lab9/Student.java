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
public class Student extends PersonProfile{
    protected String coursename,coursecode,filename,grade,sem,session;
    protected String[] CC = new String[5];
    protected String[] CN = new String[5];
    protected String[] SS = new String[5];
    protected String[] SEM = new String[5];
    protected String[] Marks = new String[5];
    protected String[] GD = new String[5];
Student(String n,String g,String d){
    super(n,g,d);
    
}
public void readstd(){
    try{
    int counter=0,i=0;
    Scanner incourse = new Scanner(new FileInputStream("course.txt"));
    while(incourse.hasNextLine()){
    if(counter==5){
        counter=0;
        i++;
    }
     String a = incourse.nextLine();
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
                Marks[i]=a;
                break;
        }
counter++;
        
    }}
catch(IOException e){
    System.out.println("File Input Problem");
}
}

public String getGrade(String marks){
    int mark=Integer.parseInt(marks);
    
        if(mark>=85){
            grade = "A";
        }
        else if(mark>=75){
            grade = "A-";
        }
        else if(mark>=70){
            grade = "B+";
        }
        else if(mark>=65){
            grade = "B";
        }
        else if(mark>=60){
            grade = "B-";
        }
        else if(mark>=55){
            grade = "C+";
        }
        else if(mark>=50){
            grade = "C";
        }
        else if(mark>=45){
            grade = "D";
        }
        else if(mark>=35){
            grade= "E";
        }
        else
            grade = "F";
        return grade;
        
    }
 public void displayS(){
    super.display();
     System.out.println("");
     for (int i = 0; i <CC.length; i++) {
         System.out.println("Course Code :"+CC[i]);
         System.out.println("Course Name :"+CN[i]);
         System.out.println("Session :"+SS[i]);
         System.out.println("Semester :"+SEM[i]);
         System.out.println("Marks :"+Marks[i]);
         System.out.println("Grade :"+getGrade(Marks[i]));
         System.out.println("");
    }
 }
}
