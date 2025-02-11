package vista;

import java.util.ArrayList;
import java.util.List;

import modelo.Curso;
import modelo.Direccion;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class Main {

    public static void main(String[] args) {

        // Métdodo Persona con nombre y edad
        Persona p1 = new Persona("Daniel", 25);
        System.out.println(p1);

        // Comparar con método equals p1 y p2
        Persona p2 = new Persona("Daniel", 25);
        System.out.println(p2);
        System.out.println("¿Son iguales las dos personas introducidas? " + p1.equals(p2));

        // Mostrar método Estudiante
        Estudiante est1 = new Estudiante("Daniel", 25, "Ciencias Ambientales");
        System.out.println(est1);
        est1.estudiar();

        // Mostrar Profesor
        Profesor prof1 = new Profesor("Jesús", 40, "Programación");
        prof1.trabajar();

        // Polimorfismo. Ejercicio 6
        List<Persona> lista = null;
        lista = new ArrayList<Persona>();
        lista.add(p1);
        lista.add(est1);
        lista.add(prof1);

        java.util.Iterator<Persona> iter = lista.iterator();
        while (iter.hasNext()) {
            iter.next().mostrarInformacion();
        }

        //Mostrar Dirección. Ejercicio 7
        Direccion d1 = new Direccion("Vino Fino", "Jerez", "11404");
        Persona p3 = new Persona("Marypaz", 24, d1);
        p3.mostrarDireccion();

        //Comparar edades. Ejercicio 8
        int resultado = p1.comparar(p3);
        
        if (resultado == 0) {
            System.out.println(p1.getNombre() + " y " + p3.getNombre() + " tienen la misma edad.");
        } else if (resultado > 0) {
            System.out.println(p1.getNombre() + " es mayor que " + p3.getNombre() + ".");
        } else {
            System.out.println(p1.getNombre() + " es menor que " + p3.getNombre() + ".");
        }

        //Ejercicio 9 y Final
        Profesor profe1 = new Profesor("Chema", 45, "Base de Datos");
        Curso curso = new Curso("DAW", profe1);

        Estudiante e1 = new Estudiante("Carlos", 20, "E001");
        Estudiante e2 = new Estudiante("Ana", 22, "E002");

        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);

        curso.listarEstudiantes();
        profe1.trabajar(); 
    }

    

}
