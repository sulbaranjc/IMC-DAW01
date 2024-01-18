/*
Autor : Ing. Juan Carlos Sulbaran
Fecha : 15/01/2024
Objetivo : Calcular el IMC de una persona
 */

/*
*
* */



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static <arraylist> void main(String[] args) {
// calcular  el IMC de una persona


// declaracion de variables
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Persona[] personas = new Persona[10];
        ArrayList<Persona> personas = new ArrayList<Persona>();
        int edad;
        String nombre;
        double altura;
        double peso;

//      formulario de persona
        System.out.println("Formulario de Persona");
        System.out.println("=====================");
        System.out.println();
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        System.out.print("Altura: ");
        altura = scanner.nextDouble();
        System.out.print("Peso: ");
        peso = scanner.nextDouble();
//      fin de formulario de persona

        // crear objeto persona1
        personas.add(new Persona(nombre, edad, altura, peso));

        personas.add(new Persona("Juan", 25, 1.75, 75));
        personas.add(new Persona("Maria", 30, 1.65, 60));
        personas.add(new Persona("Pedro", 35, 1.80, 80));
        personas.add(new Persona("Ana", 40, 1.60, 55));
        personas.add(new Persona("Luis", 45, 1.70, 70));
        personas.add(new Persona("Luisa", 50, 1.55, 50));
        personas.add(new Persona("Carlos", 55, 1.85, 85));
        personas.add(new Persona("Carla", 60, 1.50, 45));


        /* salida de datos */


//        for (Persona p : personas) {System.out.println(p.toSaludo());}


        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).toSaludo());
        }

    }
}