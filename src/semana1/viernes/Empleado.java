package semana1.viernes;

public class Empleado extends Persona{
    private double salario;

    Empleado(int id, String nombre, double salario){
        super(id,nombre);
        this.salario = salario;
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public double getSalario() {
        return salario;
    }

    void display(){
        System.out.println(getId()+" "+getNombre()+" "+getSalario());
    }

}

class TestPersonaEmpleado{
    public static void main(String[] args) {
        Empleado empleado = new Empleado(1,"Fred",1000);
        empleado.display();
    }
}

class Persona{
    private int id;
    private String nombre;

    Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}