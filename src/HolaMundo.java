import java.awt.*;

public class HolaMundo {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Bienvenidxs a la misión Backend Java", "Helvetica",26,Colors.Desire);
        screen.setVisible(true);

        str = d.readString("¿Quieres aprendes a hacer esto? s/n\n");
        if(str.charAt(0) == 'S' || str.charAt(0) == 's'){
            screen.showImage("C:\\JavaWeb\\src\\sett.jpg");
            screen.out("\nHola Explorers");
        }else{
            screen.out("\nTal vez en otro momento, Adiós", "Century Schoolbook L", 28, Color.MAGENTA);
        }
    }
}
