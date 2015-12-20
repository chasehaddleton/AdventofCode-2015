package dayThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Chase on 2015-12-04.
 */
public class dayThree {
    public static void main(String args[]) {
        char[] input = null;
        boolean[][] house = new boolean[500][500];
        int sx, sy;
        int rx, ry;
        int sum = 0;
        int i;

        sx = sy = rx = ry = 250;

        for (i = 0; i < 500; i++) {
            for (int k = 0; k < 500; k++) {
                house[i][k] = false;
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayThree\\input.txt"))) {
            input = br.readLine().toCharArray();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        for (char ch : input) {
            if (i++ % 2 == 0) {
                switch (ch) {
                    case '<':
                        sy--;
                        break;
                    case '>':
                        sy++;
                        break;
                    case '^':
                        sx++;
                        break;
                    case 'v':
                        sx--;
                        break;
                }
                house[sx][sy] = true;
            } else {
                switch (ch) {
                    case '<':
                        ry--;
                        break;
                    case '>':
                        ry++;
                        break;
                    case '^':
                        rx++;
                        break;
                    case 'v':
                        rx--;
                        break;
                }
                house[rx][ry] = true;
            }
        }

        for (i = 0; i < 500; i++) {
            for (int k = 0; k < 500; k++) {
                if (house[i][k]) sum++;
            }
        }

        System.out.println(sum); // Increment by 1 for just santa
    }
}
