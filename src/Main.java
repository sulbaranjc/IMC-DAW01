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
        Persona[] personas = new Persona[10];
        int edad;
        String nombre;
        double altura;
        double peso;

//      formulario de persona
/*
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
*/
//      fin de formulario de persona

        // crear objeto persona1
//        personas[0] = new Persona(nombre, edad, altura, peso);
        personas[0] = new Persona("Juan", 25, 1.75, 80);
        personas[1] = new Persona("Juan", 25, 1.75, 80);
        personas[2] = new Persona("Maria", 30, 1.65, 60);
        personas[3] = new Persona("Pedro", 40, 1.80, 90);
        personas[4] = new Persona("Luis", 35, 1.70, 70);
        personas[5] = new Persona("Luis", 35, 1.70, 70);
        personas[6] = new Persona("Luis", 35, 1.70, 70);
        personas[7] = new Persona("Luis", 35, 1.70, 70);
        personas[8] = new Persona("Luis", 35, 1.70, 70);
        personas[9] = new Persona("Luis", 35, 1.70, 70);



        /* salida de datos */
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toSaludo());
        }

    }
}