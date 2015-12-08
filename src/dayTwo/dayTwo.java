package dayTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Created by Chase on 2015-12-04.
 */
public class dayTwo {
    public static void main(String args[]) {
        ArrayList<Present> presents = new ArrayList<>();
        int total = 0;

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

        ListIterator<Present> presentList = presents.listIterator();

        while (presentList.hasNext()) {
            total += presentList.next().getWrappingPaper();
        }

        System.out.println(total);
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
    }
}
