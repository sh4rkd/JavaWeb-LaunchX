package semana2.viernes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOTest6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\JavaWeb\\src\\semana2\\viernes\\magic.txt");
        BufferedInputStream bin = new BufferedInputStream(fis);

        int i;
        while ((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fis.close();
    }
}
