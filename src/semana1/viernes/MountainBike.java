package semana1.viernes;

public class MountainBike {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Bike bike = new Bike("Azul",6);
        System.out.println("Color: "+bike.getColor()+"\nVelocidad: "+bike.getVelocidad());
    }

}
