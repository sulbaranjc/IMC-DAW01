public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private double imc;

    public Persona(String nombre, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.imc = this.peso / (this.altura * this.altura);
        calcularIMC(); // Calcula el IMC con los datos proporcionados
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularIMC(); // Calcula el IMC con los datos proporcionados
    }

    public void setPeso(double peso) {
        this.peso = peso;
        calcularIMC(); // Calcula el IMC con los datos proporcionados
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getImc() {
        return imc;
    }

    private void calcularIMC() {
        this.imc = this.peso / (this.altura * this.altura);
    }

    public String toSaludo(){
        return "El indice de masa corporal de "+nombre+" es "+ String.format("%.2f", imc)+" y su edad es "+edad+" años"+" y su peso es "+peso+" kg"+" y su altura es "+altura+" m";
    }
}
