package semana1.viernes;

/*
* Overload: es cuando tienes varios métodos con el
* mismo nombre pero diferentes parámetros / diferentes tipos de retorno
*
* Override: Redefine
*
* Overwrite: Sobreescribe
* */


public class Bike {
    private int velocidad;
    private String color, marca;

    public Bike(){  }
    public Bike(String color){ this.color=color; }
    public Bike(String color, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
    }
    public Bike(String color, String marca, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }

    public int getVelocidad(){ return velocidad; }
    public String getColor(){ return color; }
    public String getMarca(){  return marca;  }
}
