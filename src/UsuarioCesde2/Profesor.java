package UsuarioCesde2;

public class Profesor extends Academico{
    private String curso;

    public Profesor(){

    }

    public Profesor(int id, String nombre, String apellido, String correo, String password, String direccion, String telefono, String escuela, String curso) {
        super(id, nombre, apellido, correo, password, direccion, telefono, escuela);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void registrarUsurio() {
        super.registrarUsurio();
        System.out.println("Agregar la escuela");
        escuela =sc.next();
        System.out.println("Agregue el curso");
        curso =sc.next();
    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
        System.out.println("Escuela "+ escuela + "\n" + "Curso " + curso + "\n");
    }
}
