package daySeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chase on 2015-12-07.
 */
public class daySeven {
    public static void main(String args[]) {
        Map<String, Integer> wireMap = new HashMap<String, Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayTwo\\input.txt"))) {
            String line = br.readLine();
            String[] input;

            while (line != null) {
                input = line.split(" ");

                if (input[0].toUpperCase() == input[0]) {
                    switch (input[0]) {
                        case "NOT":
                            wireMap.put(input[1], Integer.valueOf(input[4]));
                            break;
                        case "RSHIFT":

                            break;
                        case "LSHIFT":

                            break;
                        case "OR":
                            break;
                        case "AND":
                            break;
                    }
                } else {

                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
