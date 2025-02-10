package vista;

import modelo.Estudiante;
import modelo.Persona;

public class Main {

    public static void main(String[] args) {

        // Métdodo Persona con nombre y edad
        Persona p1 = new Persona("Daniel", 25);
        System.out.println(p1);

        //Comparar con método equals p1 y p2
        Persona p2 = new Persona("Daniel", 25);
        System.out.println(p2);
        System.out.println("¿Son iguales las dos personas introducidas? " + p1.equals(p2));

        //Mostrar método Estudiante
        Estudiante est1 = new Estudiante("Daniel", 25, "Ciencias Ambientales");
        System.out.println(est1);
        est1.estudiar();
    }

}
