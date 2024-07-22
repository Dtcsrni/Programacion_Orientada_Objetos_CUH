public class Comerciante extends Persona{
    public Comerciante(String nombre, short altura, short edad) {
        super(nombre, altura, edad);
        nombre = "Eleuterio Martinez";
    }

    @Override
    public void trabajar(){
        System.out.println("Comerciar");
    }
}
