package UsuarioCesde2;



public class Curso {

    private int idCurso;
    private String nombreCurso;
    private String horario;
    private Profesor profesor = new Profesor();
    private Programa programa = new Programa();

    public Curso(){

    }

    public Curso(int idCurso, String nombreCurso, String horario, Profesor profesor, Programa programa) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.horario = horario;
        this.profesor = profesor;
        this.programa = programa;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
}
