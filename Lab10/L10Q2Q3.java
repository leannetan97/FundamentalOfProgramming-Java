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

/**
 *
 * @author Tan Lay Yan WIF160058
 */
interface MessageEncoder {

    public abstract String encode(String plainText);

    public abstract String decode(String chiperText);
}

class SubstitutionChiper implements MessageEncoder {

    private final String inputFileName, outputFileName;
    private final int shift;

    SubstitutionChiper(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

    public String getInputFileName() {
        return inputFileName;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    @Override
    public String encode(String plainText) {
        String str = "";
        for (int i = 0; i < plainText.length(); i++) {
            str += Character.toString((char) (plainText.charAt(i) + shift));
        }
        return str;
    }

    @Override
    public String decode(String chiperText) {
        String str = "";
        for (int i = 0; i < chiperText.length(); i++) {
            str += Character.toString((char) (chiperText.charAt(i) - shift));
        }
        return str;
    }

}

class SubstitutionShuffle implements MessageEncoder {

    private final String inputFileName, outputFileName;
    private final int N;

    SubstitutionShuffle(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }

    public String getInputFileName() {
        return inputFileName;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    @Override
    public String encode(String plainText) {
        String str = "";
        
        for (int i = 0; i < N; i++) {
            String subStr1 = plainText.substring(0, (plainText.length()/2));
            String subStr2 = plainText.substring((plainText.length()/2));
            int len = subStr2.length() > subStr1.length()? subStr2.length() : subStr1.length();
            for (int j = 0; j < len - 1; j++) {
                str += Character.toString(subStr1.charAt(j)) + Character.toString(subStr2.charAt(j));
            }
            str += subStr2.substring(subStr1.length(),subStr2.length());
        }
        return str;
    }

    @Override
    public String decode(String chiperText) {
        String str = "";
        for (int i = 0; i < N; i++) {
            String subStr1 = "";
            String subStr2 = "";
            for (int j = 0; j < chiperText.length(); j++) {
                if(j >= (chiperText.length()/2) *2){
                    subStr2 += chiperText.substring(j, chiperText.length());
                    break;
                }
                if(j%2==0){
                    subStr1 += Character.toString(chiperText.charAt(j));
                }else{
                    subStr2 += Character.toString(chiperText.charAt(j));
                }
            }
            str += subStr1 + subStr2;
        }
        return str;
    }

}

public class L10Q2Q3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Lab 10 Question 2
        SubstitutionChiper sc = new SubstitutionChiper("PlainTextInput.txt", "ChiperTextOutput.txt", 3);
        BufferedReader br = new BufferedReader(new FileReader(sc.getInputFileName()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(sc.getOutputFileName()));
        String inputString;
        while ((inputString = br.readLine()) != null) {
            String chiperText = sc.encode(inputString);
            System.out.println(chiperText);
            bw.write(chiperText);
        }
        br.close();
        bw.close();

        SubstitutionChiper sc2 = new SubstitutionChiper("ChiperTextOutput.txt", "PlainTextOutput.txt", 3);
        BufferedReader br2 = new BufferedReader(new FileReader(sc2.getInputFileName()));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(sc2.getOutputFileName()));
        String inputString2;
        while ((inputString2 = br2.readLine()) != null) {
            String plainText = sc2.decode(inputString2);
            System.out.println(plainText);
            bw2.write(plainText);
        }
        br2.close();
        bw2.close();
        
        // Lab 10 Question 3
        
        SubstitutionShuffle sc3 = new SubstitutionShuffle("PlainTextInput2.txt", "ChiperTextOutput2.txt", 1);
        BufferedReader br3 = new BufferedReader(new FileReader(sc3.getInputFileName()));
        BufferedWriter bw3 = new BufferedWriter(new FileWriter(sc3.getOutputFileName()));
        String inputString3;
        while ((inputString3 = br3.readLine()) != null) {
            String chiperText = sc3.encode(inputString3);
            System.out.println("Shuffle: Chiper : " +chiperText);
            bw3.write(chiperText);
        }
        br3.close();
        bw3.close();
        
        SubstitutionShuffle sc4 = new SubstitutionShuffle("ChiperTextOutput2.txt", "PlainTextOutput2.txt", 1);
        BufferedReader br4 = new BufferedReader(new FileReader(sc4.getInputFileName()));
        BufferedWriter bw4 = new BufferedWriter(new FileWriter(sc4.getOutputFileName()));
        String inputString4;
        while ((inputString4 = br4.readLine()) != null) {
            String plainText = sc4.decode(inputString4);
            System.out.println("Shuffle: Plain : " +plainText);
            bw4.write(plainText);
        }
        br4.close();
        bw4.close();
    }
}
