package dayTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Chase on 2015-12-04.
 */
public class dayTwo {
    public static void main(String args[]) {
        ArrayList<Present> presents = new ArrayList<>();
        int total = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayTwo\\testing.txt"))) {
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
        int width;
        int height;
        int length;

        Present(String[] sides) {
            this(sides[0], sides[1], sides[2]);
        }

        Present(String width, String height, String length) {
            this.width = Integer.parseInt(width);
            this.height = Integer.parseInt(height);
            this.length = Integer.parseInt(length);
        }

        int getWrappingPaper() {
            int total = (2 * length * width) + (2 * width * height) + (2 * height * length);
            int small1 = (width < height || width < length) ? width : 1;
            int small2 = (height < width || height < length) ? height : 1;
            int small3 = (length < height || length < width) ? length : 1;

            int slack = small1 * small2 * small3;

            return total + slack;
        }
    }
}
