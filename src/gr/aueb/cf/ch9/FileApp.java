package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("D:/Philip/Documents/Coding Factory/Java/file7.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.println(token + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
