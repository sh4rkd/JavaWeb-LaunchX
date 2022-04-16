package semana2.viernes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOTest2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\JavaWeb\\src\\semana2\\viernes\\magia.txt");
            String s = "Magia!!!";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
