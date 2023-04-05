package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        //what the difference between final, finally, finalize

        //compile time exception (checked)
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\PNT\\eclipse-workspace\\Feb2023Project1\\src\\exercise");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        try {
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
