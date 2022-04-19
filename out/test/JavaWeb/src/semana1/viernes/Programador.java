package semana1.viernes;

public class Programador extends Empleado{
    private double bono;

    public Programador(int id,String nombre,double salario, double bono){
        super(id,nombre,salario);
        this.bono = bono;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public double getBono() {
        return bono;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    void display() {
        System.out.println(getId()+" "+getNombre()+" "+(getSalario()+getBono()));
    }
}

class TestProgramador{
    public static void main(String[] args) {
        Programador fred = new Programador(1,"Fred",8500,2000);
        fred.display();
    }
}
