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
        Persona personaMayorIMC = null;
        for (Persona p : personas) {
            if (personaMayorIMC == null) {
                personaMayorIMC = p;
            } else {
                if (p.getImc() > personaMayorIMC.getImc()) {
                    personaMayorIMC = p;
                }
            }
        }
        return personaMayorIMC;
    }
}