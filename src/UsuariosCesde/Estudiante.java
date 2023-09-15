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
}
