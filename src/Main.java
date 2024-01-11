import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
// calcular  el IMC de una persona
//
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int edad;
        String nombre;
        double altura;
        double peso;
        double imc;

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
        imc = peso / (altura * altura);
        System.out.println("El indice de masa corporal de "+nombre+" es "+ String.format("%.2f", imc)+" y su edad es "+edad+" años");







    }
}