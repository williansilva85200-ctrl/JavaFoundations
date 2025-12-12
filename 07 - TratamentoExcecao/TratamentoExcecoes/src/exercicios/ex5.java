package exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {

        File file = new File("exemplo.txt");
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("A causa do erro foi " + e.getMessage());
        }
    }
}
