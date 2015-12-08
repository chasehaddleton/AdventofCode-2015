package dayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Chase on 2015-12-04.
 */
public class dayOne {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        int fileLength;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayOne\\~input.txt"))) {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        fileLength = sb.length();

        for(int i = 0; i < fileLength; i++) {
            if (sb.charAt(i) == '(') count++;
            else count--;
        }

        System.out.println(count);
    }
}
