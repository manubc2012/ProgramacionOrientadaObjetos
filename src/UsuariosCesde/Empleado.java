package UsuariosCesde;

public class Empleado extends Usuario{

    private double salario;
    private String area;

    public Empleado(){

    }

    public Empleado(int id, String nombre, String apellido, String correo, String password, String direccion, String telefono, double salario, String area) {
        super(id, nombre, apellido, correo, password, direccion, telefono);
        this.salario = salario;
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void registrarUsurio() {
        super.registrarUsurio();
        System.out.println("Ingrese el salario base");
        salario= sc.nextDouble();
        System.out.println("Ingrese el área");
        area = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
}
