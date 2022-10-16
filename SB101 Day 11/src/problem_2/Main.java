package problem_2;


/*
 Q2/- Write a program to read data from a text file using BufferedReader class.
 */
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("problem2.txt");
        BufferedReader br = new BufferedReader(fr);

        // int i = fr.read(); only for FileReader Class.....

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
