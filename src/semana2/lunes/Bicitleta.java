package semana2.lunes;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bicitleta de montaña");
    }

    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a rojo");
    }
}

class Magistroni extends Mountain{
    void cambiarVelocidad() {
        System.out.println("Se deben desbloquear las perillas del manubrio primero");
    }
}

public class Bicitleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bicitleta = new Magistroni();
        bicitleta.cambiarVelocidad();
        bicitleta.cambiarColor();
    }
}
