package semana2.viernes;

import java.io.FileInputStream;
import java.io.IOException;

public class IOTest4 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\JavaWeb\\src\\semana2\\viernes\\magia.txt");
            int i=0;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
