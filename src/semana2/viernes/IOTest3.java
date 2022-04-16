package semana2.viernes;

import java.io.FileInputStream;
import java.io.IOException;

public class IOTest3 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\JavaWeb\\src\\semana2\\viernes\\hola.txt");
            int i = fis.read();
            System.out.println((char) i);
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
