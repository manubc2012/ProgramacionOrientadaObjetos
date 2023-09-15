package UsuariosCesde;

public class Test {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();//Hemos creado una instancia de la clase Usuario
        Usuario usuarioPepito = new Usuario();
        Usuario nicolas = new Usuario();
    /*
        String nombre="Nicolás";
        nicolas.setNombre(nombre);

        System.out.println(nicolas.getNombre());*/

        nicolas.registrarUsurio();
        System.out.println(nicolas.toString());
        nicolas.iniciarSesion();

        Estudiante estudiante = new Estudiante();

    }


}