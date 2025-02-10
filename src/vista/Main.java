package vista;

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
    }

}
