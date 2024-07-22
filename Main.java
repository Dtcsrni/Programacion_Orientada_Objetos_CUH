
public class Main {
    public static void main(String[] args) {
        String nombre = "";
        //Se instancia un objeto de la clase persona con nomre persona1 y sus atributos iniciales
        Persona persona1 = new Persona("Julio", (short)182,(short) 23);
        Persona comerciante = new Comerciante("Luis Fernandez", (short) 170, (short) 20);
        Persona constructor = new Constructor("Luis Perez", (short) 160, (short) 29);
        Persona jardinero = new Jardinero("Marco Perez", (short) 184, (short) 25);

        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
        persona1.trabajar();
        comerciante.trabajar();
        constructor.trabajar();
        jardinero.trabajar();

        //Llamar el metodo mostrarNombre de la clase padre
        persona1.mostrarNombre();
        comerciante.mostrarNombre();
        constructor.mostrarNombre();
        jardinero.mostrarNombre();


    }
}
