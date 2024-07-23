# Prácticas de Programación Orientada a Objetos

Este repositorio contiene ejemplos y prácticas relacionadas con la programación orientada a objetos (POO). A continuación, se describen algunos conceptos clave:

## Instancia
- Representa una implementación en tiempo real de una clase abstracta.
- Implica la asignación de memoria para un objeto específico.

## Clase
- Es una plantilla que generaliza la abstracción de un objeto común.
- Contiene características esenciales comunes a todos los objetos de esa clase.

## Constructor
- Es un método especial que se llama automáticamente cuando se crea una instancia de la clase.
- Tiene el mismo nombre que la clase.

## camelCase
- Es una convención para nombrar variables, clases, métodos, etc.
- Las palabras se escriben juntas sin espacios, y cada palabra después de la primera comienza con mayúscula.

## Contexto de ejecución
- Puede ser estático o dinámico.
- Se refiere al momento en que se evalúan las expresiones: en tiempo de ejecución o en tiempo de compilación.

## Parámetros
- Son configuraciones o variables específicas para el contexto local de una entidad (como una función o método).

## Acoplamiento
- Representa la interdependencia entre módulos o clases.
- Menos acoplamiento es preferible para facilitar el mantenimiento y la reutilización del código.

## Cohesión
- Se refiere a la especialización de una clase.
- Una clase debe incluir solo atributos y métodos relevantes para su tipo, sin mezclar funcionalidades no relacionadas.

## Get / Set
- Son "interfaces" para modificar el estado interno de una clase o acceder a él desde fuera.
- Permiten controlar el acceso a los atributos.

## Nulo vs. Vacío
- Nulo: No hay referencia a memoria.
- Vacío: Existe una referencia a un espacio vacío en memoria.

Casteo
El casteo es la acción de convertir directamente el tipo de un valor en otro tipo. Por ejemplo, cuando transformamos un número entero en un número decimal.

Objeto, Clase e Instancia
Objeto: Es una instancia de una clase. Representa un elemento específico y concreto en un programa.
Clase: Define la estructura y el comportamiento que comparten los objetos. Es como un plano o una plantilla.
Instancia: Es un objeto específico creado a partir de una clase. Cada instancia tiene sus propios valores y estado.
Polimorfismo
El polimorfismo permite que una clase represente múltiples tipos de objetos al instanciarse. Algunas notas sobre polimorfismo:

Cada implementación puede “sobrecargar” los métodos o atributos de la clase original.
Tipos de herencia:
Herencia múltiple: Una subclase hereda de varias superclases.
Herencia simple: Una subclase hereda de una única superclase.
Herencia jerárquica: Varias subclases heredan de una misma superclase.
Herencia híbrida: Combinación de múltiple y simple.
Herencia multinivel: Una subclase hereda de otra subclase.
Sobrecarga: Distintas implementaciones pueden aplicarse al mismo método. Por ejemplo:
Java

public void trabajar(int horas) { /* ... */ }
public void trabajar(String horas) { /* ... */ }
public String trabajar(String horas) { /* ... */ }
public int trabajar(String horas) { /* ... */ }
Código generado por IA. Revisar y usar cuidadosamente. Más información sobre preguntas frecuentes.
Implementación y Extensión
Implementación: Se refiere a la implementación de interfaces. Las interfaces son plantillas que definen las características de una clase y sus métodos de forma abstracta.
Herencia simple: Una clase puede heredar de una única superclase.
