/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tan Lay Yan WIF160058
 */
interface Searchable {

    public boolean search(String date, String starttime, String endTime);
}

class Appointment implements Searchable {

    private final int day, month, year, startTimeInHour, endTimeInHour;

    Appointment(int day, int month, int year, int startTimeInHour, int endTimeInHour) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTimeInHour = startTimeInHour;
        this.endTimeInHour = endTimeInHour;
    }

    @Override
    public boolean search(String date, String starttime, String endTime) {
        String[] dateArr = date.split("/");
        BufferedReader br;
//        System.out.println(Arrays.toString(dateArr));
        try {
            br = new BufferedReader(new FileReader("Appointment.txt"));
            String inputString;
        while ((inputString = br.readLine()) != null) {
            String[] file = inputString.split(";");
//            System.out.println(Arrays.toString(file));
            if(file[0].equalsIgnoreCase(dateArr[0]) && file[1].equalsIgnoreCase(dateArr[1]) && file[2].equalsIgnoreCase(dateArr[2]) && file[3].equalsIgnoreCase(starttime) && file[4].equalsIgnoreCase(endTime)){
             return true;
            }
        }
        br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void save() throws FileNotFoundException, IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Appointment.txt",true));
        bw.write(this.day + ";" + this.month + ";" + this.year + ";" + this.startTimeInHour + ";" + this.endTimeInHour);
        bw.newLine();
        bw.close();
    }

}

public class L10Q4 {
    public static void main(String[] args) throws IOException {
        Appointment a = new Appointment(12,12,2012,1,2);
        a.save();
        System.out.println("SAVE");
        Appointment a1 = new Appointment(12,12,2012,1,2);
        if(!a1.search("12/12/2012", "1", "2")){
            a1.save();
            System.out.println("SAVE");
        }else{
            System.out.println("Opps Clash, please make a new appointment");
        }
    }
}
