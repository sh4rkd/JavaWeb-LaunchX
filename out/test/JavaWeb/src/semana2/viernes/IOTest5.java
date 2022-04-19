package semana2.viernes;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest5 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\JavaWeb\\src\\semana2\\viernes\\magic.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            String s = "Hola viajexs de \nInnovaccion Virtual";
            byte[]b = s.getBytes();

            bout.write(b);
            bout.flush();

            bout.close();
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
