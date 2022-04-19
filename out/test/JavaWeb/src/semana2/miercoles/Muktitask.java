package semana2.miercoles;

public class Muktitask extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea 1");
    }

    public static void main(String[] args) {
        Muktitask t1 = new Muktitask(),
                t2 = new Muktitask(),
                t3 = new Muktitask();
        t1.start();
        t2.start();
        t3.start();
    }
}

class Multitasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea Uno Runnable");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Multitasking());
        Thread t2 = new Thread(new Multitasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        t1.start();
        t2.start();

        task1.start();
        task2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A");
    }
}

class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea B");
    }
}

