package semana2.lunes;

abstract class Sombra{
    abstract void dibujarSombra();
}

class Arma extends Sombra{
    void dibujarSombra(){
        System.out.println("Dibujando sombras en el arma");
    }
}

public class Personaje extends Arma{
    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        flecha.dibujarSombra();

        Sombra arco = new Arma();
        arco.dibujarSombra();
    }

    @Override
    void dibujarSombra() {
        System.out.println("Dibuja una silueta blanca");
    }
}
