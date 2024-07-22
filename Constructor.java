public class Constructor extends Persona{
    public Constructor(String nombre, short altura, short edad) {
        super(nombre, altura, edad);
        nombre="Carlos Suarez";
    }

    @Override
    public void trabajar(){
        System.out.println("Construir");
    }
}
