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
        int x = 250;
        int y = 250;
        int sum = 0;

        for (int i = 0; i < 500; i++) {
            for (int k = 0; k < 500; k++) {
                house[i][k] = false;
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayThree\\input.txt"))) {
            String line = br.readLine();

            input = line.toCharArray();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (char ch : input) {
            switch (ch) {
                case '<':
                    y--;
                    break;
                case '>':
                    y++;
                    break;
                case '^':
                    x++;
                    break;
                case 'v':
                    x--;
                    break;
            }
            house[x][y] = true;
        }

        for (int i = 0; i < 500; i++) {
            for (int k = 0; k < 500; k++) {
                if (house[i][k]) sum++;
            }
        }

        System.out.println(sum);
    }
}
