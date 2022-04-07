package semana1.miercoles;

public class PruebaBicitleta {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Bicitleta biciMountain = new Bicitleta();
        biciMountain.setColor("Negra");
        biciMountain.setPiniones(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);
        biciMountain.printState();
        System.out.println("Soy una bici de montraña con estas características:\n"+biciMountain.printState()+"\n");

        Bicitleta biciPista = new Bicitleta("Blanco",4,15,8.2);
        System.out.println("Soy una bici de pista con estas características:\n"+biciPista.printState());
    }
}
