/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class Shape {
protected double perimeter,area;
protected String name;
    
public Shape(String name){
    this.name= name;
}
    public void setperimeter(double p){
        perimeter=p;
    }
    public void setarea(double a){
        area=a;
    }
   
    public double getperimeter(){
        return perimeter;
    }
    public double getarea(){
        return area;
    }
    
    public void display(){
        System.out.println("Name : "+name);
        System.out.printf("Perimeter : %.2f",perimeter);
        System.out.println("");
        System.out.printf("Area : %.2f",area);
        System.out.println("");
        System.out.println("");
    }
}
