import java.util.ArrayList;

public class GestorPersona {
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    public void agregarPersona(Persona persona) {

        personas.add(persona);
    }
    public ArrayList<Persona> listarPersonas() {

        return personas;
    }
    public Persona getPersonaMayorIMC() {
        Persona personaMayorIMC;
        personaMayorIMC = personas.get(0);
        for (Persona p : personas) {
                if (p.getImc() > personaMayorIMC.getImc()) personaMayorIMC = p;
            }
        return personaMayorIMC;
    }
}