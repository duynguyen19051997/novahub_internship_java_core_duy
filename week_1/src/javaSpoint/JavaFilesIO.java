package javaSpoint;

import java.io.*;

public class JavaFilesIO {
    public static void main(String[] args) throws IOException {

        /* BYTE STREAM */
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("input.txt");
            fos = new FileOutputStream("output.txt");

            int a;
            while ((a = fis.read()) != -1) {
                System.out.println(a);
                fos.write(a);
            }
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }

        /* CHARACTER STREAM */
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("input.txt");
            fw = new FileWriter("output.txt");

            int b;
            while ((b = fr.read()) != -1) {
                System.out.println(b);
                fw.write(b);
            }
        } finally {
            if (fw != null) {
                fw.close();
            }
            if (fr != null) {
                fr.close();
            }
        }

        /* STANDARD STREAM */
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(System.in);
            System.out.println("Insert character, 'q'=exit: ");
            char x;
            do {
                x = (char) isr.read();
                System.out.println(x);
            } while (x != 'q');
        } finally {
            if (isr != null) {
                isr.close();
            }
        }

        /* INPUT STREAM AND OUTPUT STREAM */

        int[] numbers = {15, 1, 17, 3, 25, 5};
        OutputStream os = new FileOutputStream("text.txt");
        for (int b : numbers) {
            os.write(b);
        }
        os.close();

        InputStream is = new FileInputStream("text.txt");
        int size = is.available();
        for (int i = 0; i < size; i++) {
            System.out.print(is.read() + "\t");
        }
        is.close();
    }
}
