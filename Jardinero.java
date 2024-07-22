import java.util.Optional;

public class Jardinero extends Persona{
    public Jardinero(String nombre, short altura, short edad) {
        super(nombre, altura, edad);
        nombre="Francisco Perez";
    }


    @Override
    public void trabajar(){
        System.out.println("Cortando pasto");
    }
}
