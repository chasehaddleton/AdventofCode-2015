package dayFour;

import java.security.MessageDigest;

/**
 * Created by Chase on 2015-12-19.
 */
public class dayFour {
    public static void main(String[] args) throws Exception {
        int i = 0;
        String key = "yzbqklnj";
        MessageDigest md = MessageDigest.getInstance("MD5");
        String hash;

        long start = System.nanoTime();

        do  {
            byte[] bytesOfMessage = null;

            try {
                bytesOfMessage = (key + Integer.toString(i++)).getBytes("UTF-8");
            } catch (Exception ex) {
                System.out.println(ex.getStackTrace());
            }

            hash = convertByteArrayToHexString(md.digest(bytesOfMessage));

            if (i % 100000 == 0) {
                System.out.println(i);
                System.out.println(hash);
            } else if (hash.substring(0, 6).equals("000000")) {
                System.out.println(hash);
            }
        } while (!hash.substring(0, 6).equals("000000"));

        long finish = System.nanoTime();

        System.out.println(--i);
        System.out.println("Time: " + (finish - start));
    }

    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }
}
