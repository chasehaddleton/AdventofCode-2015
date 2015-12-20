package daySix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Chase on 2015-12-19.
 */
public class daySix {
    public static void main(String[] args) {
        String[][][] lights = new String[999][999][1];

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayTwo\\input.txt"))) {
            String line = br.readLine();

            while (line != null) {

                line = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
