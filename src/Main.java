/*
Autor : Ing. Juan Carlos Sulbaran
Fecha : 15/01/2024
Objetivo : Calcular el IMC de una persona
 */

/*
*
* */



import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
// calcular  el IMC de una persona


// declaracion de variables
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Persona persona1;
        Persona persona2;
        Persona persona3;
        Persona persona4;
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
        persona1 = new Persona(nombre, edad, altura, peso);
        persona2 = new Persona("Juan", 25, 1.75, 80);
        persona3 = new Persona("Maria", 30, 1.65, 60);
        persona4 = new Persona("Pedro", 40, 1.80, 90);


        /* salida de datos */

        System.out.println(persona1.toSaludo());
        System.out.println(persona2.toSaludo());
        System.out.println(persona3.toSaludo());
        System.out.println(persona4.toSaludo());
    }
}