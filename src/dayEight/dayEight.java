package dayEight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Chase on 2015-12-19.
 */
public class dayEight {
    public static void main(String[] args) {
        String[] input = new String[300];
        int characterCount = 0;
        int codeCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chase\\Documents\\Programming\\Advent " +
                "of Code\\src\\dayEight\\input.txt"))) {
            String line = br.readLine();
            int i = 0;
            while (line != null) {
                input[i++] = line;

                line = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(hexToString(input[0]));

        /*for (String st : input) {
            byte[] bytes = HexBin.decode(st);
            for (int i = 0; i < st.length(); i++) {
                if ()
            }
        }*/
    }

    private static String hexToString(String txtInHex) {
        byte[] txtInByte = new byte[txtInHex.length() / 2];
        int j = 0;
        for (int i = 0; i < txtInHex.length(); i += 2) {
            txtInByte[j++] = Byte.parseByte(txtInHex.substring(i, i + 2), 16);
        }
        return new String(txtInByte);
    }
}
