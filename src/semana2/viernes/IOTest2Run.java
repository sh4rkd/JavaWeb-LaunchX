package semana2.viernes;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2Run {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos = new FileOutputStream("C:\\JavaWeb\\src\\semana2\\viernes\\magiaRunnable.txt");
                    String s = "Magia con Runnable!!!";
                    byte b[]=s.getBytes();
                    fos.write(b);
                    System.out.println("Se ha creado la magia Runnable");
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(rm);
        t1.start();
    }
}
