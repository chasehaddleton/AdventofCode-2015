package dayFour;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Chase on 2015-12-19.
 */
public class dayFour {
    public static void main(String[] args){
        int i = 0;
        String key = "yzbqklnj";
        String hash;
        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex){
            ex.printStackTrace();
            System.exit(0);
        }

        long start = System.nanoTime();

        do  {
            byte[] bytesOfMessage = null;

            try {
                bytesOfMessage = (key + Integer.toString(i++)).getBytes("UTF-8");
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
                System.exit(0);
            }

            hash = convertByteArrayToHexString(md.digest(bytesOfMessage));

            if (i % 100000 == 0) {
                System.out.println(i);
                System.out.println(hash);
            } else if (hash.substring(0, 7).equals("0000000")) {
                System.out.println(hash);
            }
        } while (!hash.substring(0, 7).equals("0000000"));

        long finish = System.nanoTime();

        System.out.println(--i);
        System.out.println("Time: " + (finish - start));
    }

    // http://www.codejava.net/coding/how-to-calculate-md5-and-sha-hash-values-in-java
    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }
}
