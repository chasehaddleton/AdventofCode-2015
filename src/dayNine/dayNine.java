package dayNine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Chase on 2015-12-19.
 */
public class dayNine {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayEight\\input.txt"))) {
            String line = br.readLine();
            int i = 0;
            while (line != null) {

                line = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
