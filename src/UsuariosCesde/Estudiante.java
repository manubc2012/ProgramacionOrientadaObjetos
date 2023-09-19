package UsuariosCesde;

public class Estudiante extends Usuario{

    private String carrera;

    public Estudiante(){

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String password, String direccion, String telefono, String carrera) {
        super(id, nombre, apellido, correo, password, direccion, telefono);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void registrarUsurio() {
        System.out.println("Soy el de estudiante");
        //super.registrarUsurio();
        System.out.println("Ingrese su id");
        this.id= sc.nextInt(); //This es un operador que hace referencia a un atributo de la clase
        sc.skip("\n");
        System.out.println("Ingrese su nombre");
        this.nombre= sc.nextLine();
        System.out.println("Ingrese su apellido");
        this.apellido= sc.nextLine();
        System.out.println("Ingrese su correo");
        this.correo= sc.nextLine();
        System.out.println("Ingrese su contraseña");
        this.password= sc.nextLine();
        System.out.println("Ingrese su dirección");
        this.direccion= sc.nextLine();
        System.out.println("Ingrese su telefono");
        this.telefono=sc.nextLine();
        System.out.println("Indique el programa de su interés");
        this.carrera= sc.nextLine();
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
