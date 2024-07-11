
public class Main {
    public static void main(String[] args) {
        String nombre = "";
        //Se instancia un objeto de la clase persona con nomre persona1 y sus atributos iniciales
        Persona persona1 = new Persona("Julio", (short)182,(short) 23);
        //Almacenar el nombre instanciado en variable nombre local
        nombre = persona1.getNombre();
        //Establecer el nombre de la Persona para esta instancia
        persona1.setNombre("Carlos");
        //Mandar llamar el método para publicar el nombre de la instancia
        persona1.mostrarNombre();

        System.out.println(nombre);


    }
}
