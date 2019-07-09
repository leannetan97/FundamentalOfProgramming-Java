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
public class PersonProfile {
    protected String name ;
    protected String gender;
    protected String birthdate;
    PersonProfile(String n,String g,String d){
        this.name=n;
        this.gender=g;
        this.birthdate=d;
    }
    
    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Birth date = "+birthdate);
        }
    }
    
