package semana2.miercoles;

public class HilosT extends Thread{

    @Override //Runnable
    public void run() {
        System.out.println("El hilo se está ejecutando...");
    }

    

    public static void main(String[] args) {
        HilosT hilo = new HilosT();
        hilo.start();
        HilosR r = new HilosR();
        Thread t = new Thread(r);
        t.start();
    }
}

class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de runnable esta corriendo");
    }
}