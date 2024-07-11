public class Persona {
   //Se inicializan los atributos de la clase
   private String nombre = "";
   private short altura = 0;
   private short edad = 0;

   //Se define el constructor Persona con sus atributos principales al momento de instanciar
   public Persona(String nombre, short altura, short edad){
      this.nombre = nombre;
      this.altura = altura;
      this.edad = edad;
   }
   /* Se definen los get y set
   para la clase "Persona"
    */
   public String getNombre() {
      nombre = "Sr." + nombre;
      return nombre;
   }
   public void mostrarNombre(){
      System.out.println(this.nombre);
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }


}
