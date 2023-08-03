package Entidades;

import java.util.Arrays;

public class Curso {
    
    private String nombreCurso;
    private int cantHorasPorDia;
    private int cantDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private int dimension;
    private String [] nombresAlumnos;   //la dimension la toma solo cuando le copio el vector aux en CursoServicios

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasPorDia, int cantHorasPorSemana, String turno, int precioPorHora, int dimension) {
        this.nombreCurso = nombreCurso;
        this.cantHorasPorDia = cantHorasPorDia;
        this.cantDiasPorSemana = cantHorasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.dimension = dimension;
    }
    

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasPorDia() {
        return cantHorasPorDia;
    }

    public void setCantHorasPorDia(int cantHorasPorDia) {
        this.cantHorasPorDia = cantHorasPorDia;
    }

    public int getCantDiasPorSemana() {
        return cantDiasPorSemana;
    }

    public void setCantDiasPorSemana(int cantHorasPorSemana) {
        this.cantDiasPorSemana = cantHorasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getNombresAlumnos() {
        return nombresAlumnos;
    }

    public void setNombresAlumnos(String[] nombresAlumnos) {
        this.nombresAlumnos = nombresAlumnos;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantHorasPorDia=" + cantHorasPorDia + ", cantDiasPorSemana=" + cantDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", dimension=" + dimension + ", nombresAlumnos=" + Arrays.toString(nombresAlumnos) + '}';
    }

    
    
    
}
