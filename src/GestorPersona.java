import java.util.ArrayList;

public class GestorPersona {
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    public void agregarPersona(Persona persona) {

        personas.add(persona);
    }
    public ArrayList<Persona> listarPersonas() {

        return personas;
    }
}