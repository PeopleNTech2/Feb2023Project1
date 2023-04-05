package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    //throws keyword on method signature
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\PNT\\eclipse-workspace\\Feb2023Project1\\src\\exercise");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        fr.close();
        br.close();

    }
}
