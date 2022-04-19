package semana1.miercoles;

public class Bicitleta {
    Bicitleta(){}
    Bicitleta(String color,int piniones,int rodada,double velocidad){
        setColor(color);
        setPiniones(piniones);
        setRodada(rodada);
        setVelocidad(velocidad);
    }

    private int piniones, rodada;
    private double velocidad;
    private String color;

    public double getVelocidad(){  return velocidad;  }
    public int getPiniones() {  return piniones;  }
    public int getRodada() {  return rodada;  }
    public String getColor() {  return color;  }

    public boolean setPiniones(int piniones){
        if(piniones>0){
            this.piniones = piniones;
            return true;
        }else
            return false;
    }

    public boolean setRodada(int rodada){
        if(rodada>0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad>0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }

     public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
     }

    public String printState(){
        return "Piñones: "+piniones+
                "\nRodada: "+rodada+
                "\nVelocidad: "+velocidad+
                "\nColor: "+color;
    }
}
