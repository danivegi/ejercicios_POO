package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombreCurso;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    //Constructor vacío
    public Curso() {

    }

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
        System.out.println("Estudiantes en el curso " + nombreCurso + ":");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre());
        }
    }

}
