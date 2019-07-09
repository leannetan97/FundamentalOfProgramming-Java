
package lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
public class L7Q4 {
    public static void main(String[] args) {
        try{
            
            int age;
            String name;
            char gender;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"));
            int a=in.readInt();
            String[] box = new String[a];
            System.out.println("Total number of Record:"+a);
            try{
               int k=0;
            while(true){
                name = in.readUTF();
                age = in.readInt();
                gender = in.readChar();
                
                box[k]=name +"\t"+ age+"\t" + gender;
            k++;    
            }
            
            
            }
                catch(EOFException e){
                    
            }
                
                        
            for (int i = 0; i < box.length; i++) {
                    for (int j = 0; j < box.length-1; j++) {
                        String temp;
                        if(box[j].compareTo(box[j+1])>0){
                        temp=box[j];
                        box[j]=box[j+1];
                        box[j+1]=temp;
                   
          
                }
                
            }
            }
            
            for (int z = 0; z < box.length; z++) {
                System.out.println(box[z]);
            }
                
            }
            
        
        catch(FileNotFoundException e){
                System.out.println("File not found");
                }
        catch(IOException e){
        System.out.println("Problem with file.");
    }
        
    }
    
}
