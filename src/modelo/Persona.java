package modelo;

public class Persona implements Comparable {

    //Inicializamos variables
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona() { //Constructor vaciío

    }

    //Constructor que inicializa ambos atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor con Direccion
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    //Métodos Gets and Sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //To String
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }

    //Método para mostrar Info
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + ". Edad: " + getEdad());
    }
    
    //Método para mostrar Direccion
    public void mostrarDireccion() {
        System.out.println(this.direccion);
    }

    @Override
    public int comparar(Object obj) {
        if (!(obj instanceof Persona)) {
            throw new IllegalArgumentException("El objeto no es una instancia de Persona");
        }
        Persona otraPersona = (Persona) obj;
        return Integer.compare(this.edad, otraPersona.edad);
    }
    
    

}
