/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Tan Lay Yan WIF160058
 */

abstract class Employee {
    private final String name,type;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public Employee(String name,String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }
    
    public abstract void computeSalary();
    public abstract void display();
    
}

class PermanentEmployee extends Employee{
    private final char categories;
    
    PermanentEmployee(String name, String type, char categories){
        super(name,type);
        this.categories = categories;
    }
    
    @Override
    public void computeSalary() {
        switch(categories){
            case 'A':
                super.setSalary(4000);
                break;
            case 'B':
                super.setSalary(4000);
                break;
            case 'C':
                super.setSalary(4000);
                break;
            default:
                break;
        }  
    } 

    @Override
    public void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("Type: " + super.getType());
        System.out.println("Categories: " + categories);
        System.out.println("Salary: " + super.getSalary());
    }
}

class ContractStaff extends Employee{
    private final double totalSales;
    
    ContractStaff(String name, String type, double totalSales){
        super(name,type);
        this.totalSales = totalSales;
    }
    
    @Override
    public void computeSalary() {
       super.setSalary(1.5 * totalSales);
    }

    @Override
    public void display() {
       System.out.println("Name: " + super.getName());
        System.out.println("Type: " + super.getType());
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Salary: " + super.getSalary());
    }
}

class TemporaryStaff extends Employee{
    private final double hours;
    
    TemporaryStaff(String name, String type, double hours){
        super(name,type);
        this.hours = hours;
    }
    
    @Override
    public void computeSalary() {
       super.setSalary(15*hours);
    } 

    @Override
    public void display() {
    System.out.println("Name: " + super.getName());
        System.out.println("Type: " + super.getType());
        System.out.println("Hours: " + hours);
        System.out.println("Salary: " + super.getSalary());
    }
}

public class L10Q1 {

    public static void main(String[] args) {
       Employee permanent = new PermanentEmployee("lala","Permenanent",'A');
       permanent.computeSalary();
       permanent.display();
       
       Employee contract = new ContractStaff("hela","Contract",1000.00);
       contract.computeSalary();
       contract.display();
    
       Employee temporary = new TemporaryStaff("wala","Temporary",12);
       temporary.computeSalary();
       temporary.display();
    }
    
    
}
