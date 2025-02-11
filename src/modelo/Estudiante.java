package modelo;

public class Estudiante extends Persona{

    //Atributos
    private String carrera;

    //Constructor vacío
    public Estudiante() {

    }

    //Constructor de todos los atributos
    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    //Método To String que muestra todos los datos
    @Override
    public String toString() {
        return "Estudiante [carrera=" + carrera + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
    }

    public void estudiar() {
        System.out.println(getNombre() + " esta estudiando " + carrera);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + ". Edad: " + getEdad() + ". Carrera: " + carrera);
    }
    

}
