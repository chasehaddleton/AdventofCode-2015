package dayTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Chase on 2015-12-04.
 */
public class dayTwo {
    public static void main(String args[]) {
        ArrayList<Present> presents = new ArrayList<>();
        int totalWrapping = 0;
        int totalRibbon = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayTwo\\input.txt"))) {
            String line = br.readLine();

            while (line != null) {
                presents.add(new Present(line.split("x")));

                line = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (Present gift: presents) {
            totalWrapping += gift.getWrappingPaper();
            totalRibbon += gift.getRibbon();
        }

        System.out.println("Total wrapping paper needed: " + totalWrapping);
        System.out.println("Total ribbon needed: " + totalRibbon);
    }

    static class Present {
        int[] sides = new int[3];

        Present(String[] sidesSt) {
            this(sidesSt[0], sidesSt[1], sidesSt[2]);
        }

        Present(String sides0, String sides1, String sides2) {
            this.sides[0] = Integer.parseInt(sides0);
            this.sides[1] = Integer.parseInt(sides1);
            this.sides[2] = Integer.parseInt(sides2);

            Arrays.sort(sides);
        }

        int getWrappingPaper() {
            return (3 * sides[0] * sides[1]) + (2 * sides[1] * sides[2]) + (2 * sides[2] * sides[0]);
        }

        int getRibbon() {
            return (2*sides[0] + 2*sides[1]) + (sides[0] * sides[1] * sides[2]);
        }
    }
}
