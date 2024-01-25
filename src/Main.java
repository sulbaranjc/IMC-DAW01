/*
Autor : Ing. Juan Carlos Sulbaran
Fecha : 15/01/2024
Objetivo : Calcular el IMC de una persona
 */

/*
* la persistencia de datos la maneja la interfaz, debe gstionarla lotra clase que se encargue de la persistencia
* */



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
// calcular  el IMC de una persona

        // gestor de personas
        GestorPersona gp = new GestorPersona();



// declaracion de variables
        Scanner scannerNum = new Scanner(System.in).useLocale(Locale.US);
        Scanner scannerStr = new Scanner(System.in);

        // Persona[] personas = new Persona[10];

        int edad;
        String nombre;
        double altura;
        double peso;
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        do{
            menu();
            System.out.print("Ingrese una opcion: ");
            opcion = scannerNum.nextInt();
            switch (opcion){
                case 1:
                    ingresarPersona(scannerStr, scannerNum, gp);
                    break;
                case 2:
                    mostrarPersonas(gp);
                    break;
                case 3:
                    imcMayor(gp);
                    break;
                case 9:
                    mocearPersonas(gp);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (!salir);
        System.out.println("Fin del programa");
    }
    private static void menu() {
        System.out.println("Menu de Opciones");
        System.out.println("================");
        System.out.println("1. Ingresar Persona");
        System.out.println("2. Listar Personas");
        System.out.println("3. Persona con mayor IMC");
        System.out.println("9. Agredar Data Ejemplo");
        System.out.println("0. Salir");
        System.out.println();
        System.out.print("Ingrese una opcion: ");
    }
    private static void ingresarPersona(Scanner scannerStr, Scanner scannerNum, GestorPersona gp) {
        // Ingreso de datos
        System.out.println("Formulario de Persona");
        System.out.println("=====================");
        System.out.println();
        System.out.print("Nombre: ");
        String nombre = scannerStr.nextLine();
        System.out.print("Edad: ");
        int edad = scannerNum.nextInt();
        System.out.print("Altura: ");
        double altura = scannerNum.nextDouble();
        System.out.print("Peso: ");
        double peso = scannerNum.nextDouble();
        System.out.println();

        // agregar a persona a la lista de personas
        gp.agregarPersona(new Persona(nombre, edad, altura, peso));
    }
    private static void mostrarPersonas(GestorPersona gp) {
        // Salida de datos con variable local
        System.out.println("\n\n          Datos de las Personas");
        System.out.println("========================================");
        System.out.println("nombre edad altura     peso      imc");
        System.out.println("========================================");

        for (Persona p : gp.listarPersonas()) {
            System.out.println(p.toString());
        }
    }
    private static void mocearPersonas(GestorPersona gp){
        // mas personas
        gp.agregarPersona(new Persona("Juan", 25, 1.75, 75));
        gp.agregarPersona(new Persona("Maria", 30, 1.65, 60));
        gp.agregarPersona(new Persona("Pedro", 35, 1.80, 80));
        gp.agregarPersona(new Persona("Anita", 40, 1.60, 55));
        gp.agregarPersona(new Persona("Luis", 45, 1.70, 70));
        gp.agregarPersona(new Persona("Luisa", 50, 1.55, 50));
        gp.agregarPersona(new Persona("Carlos", 55, 1.85, 85));
        gp.agregarPersona(new Persona("Carla", 60, 1.50, 45));
        gp.agregarPersona(new Persona("Jose", 65, 1.90, 90));
        gp.agregarPersona(new Persona("Josefa", 70, 1.45, 40));
    }
    private static void imcMayor(GestorPersona gp){
        // Salida de datos con variable local
        System.out.println("\n\n          Datos de la Persona con mayor IMC");
        System.out.println("========================================");
        System.out.println("nombre edad altura     peso      imc");
        System.out.println("========================================");
        System.out.println(gp.getPersonaMayorIMC().toString());
    }
}