package modelo;

public class Profesor extends Persona implements Trabajador {

    //Atributos
    private String especialidad;

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está enseñando " + especialidad);
    }

    //Constructor vacío
    public Profesor() {

    }

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    



}
