package UsuarioCesde2;

import java.util.Scanner;

public class Usuario {
    Scanner sc=new Scanner(System.in);

    //primero creamos los atributos encapsulados con private

    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String password;
    protected String direccion;
    protected String telefono;

    //método constructor vacio

    public Usuario(){

    }

    //Constructor con parametros

    public Usuario(int id, String nombre, String apellido, String correo, String password, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //construimos los getter and seter para permitir el acceso desde los métodos a las variables privadas

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }


    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return this.apellido;
    }


    public void setCorreo(String correo){
        this.correo=correo;
    }
    public String getCorreo(){
        return this.correo;
    }


    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }


    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }


    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

    //métodos

    public void registrarUsurio(){

        System.out.println("Soy el de Usuario");

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
    }


    public void imprimirUsuario() {
        System.out.println(
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}');
    }

    public void iniciarSesion(){
        System.out.println("Ingrese el correo registrado");
        String correoRegistrado= sc.next();
        System.out.println("Ingrese la contraseña registrada");
        String contraRegistrada= sc.next();

        if(password.equals(contraRegistrada) && correo.equals(correoRegistrado)){
            System.out.println("Bienvenido " + nombre);
        }else{
            System.out.println("Credencial no válida");
        }
    }
}
