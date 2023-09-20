package UsuarioCesde2;

public class Estudiante extends Academico{
    private String programa;

    public Estudiante(){

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String password, String direccion, String telefono, String escuela, String carrera) {
        super(id, nombre, apellido, correo, password, direccion, telefono, escuela);
        this.programa = carrera;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
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
        this.programa = sc.nextLine();
    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
}
