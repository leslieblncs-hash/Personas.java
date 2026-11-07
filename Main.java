// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Creamos objetos utilizando la clase padre Persona
        // y los constructores de las clases hijas

        Persona persona1 = new Estudiante(
                "Ana", 20, "ana@gmail.com", "Inteligencia Artificial");

        Persona persona2 = new Profesor(
                "Carlos", 40, "carlos@gmail.com", "Programacion");

        Persona persona3 = new Administrador(
                "Maria", 35, "maria@gmail.com", "Sistemas");

        // Creamos un arreglo de personas
        Persona[] personas = {persona1, persona2, persona3};

        // Ciclo for para recorrer los objetos
        for (Persona persona : personas) {

            // Ejecutamos el método de cada clase hija
            persona.mostrarActividad();
        }

        // Ejemplo de encapsulamiento
        persona1.setEdad(21);

        System.out.println("Nueva edad de Ana: " + persona1.getEdad());

        // Utilizamos ArrayList
        persona1.listaMaterias.add("Matematicas");
        persona1.listaMaterias.add("Programacion");

        System.out.println("Materias: " + persona1.listaMaterias);

        // Utilizamos LinkedList
        persona1.listaEdades.add(18);
        persona1.listaEdades.add(20);

        System.out.println("Edades: " + persona1.listaEdades);

        // Utilizamos HashSet
        persona1.conjuntoNombres.add("Ana");
        persona1.conjuntoNombres.add("Carlos");

        System.out.println("Nombres: " + persona1.conjuntoNombres);

        // Utilizamos HashMap
        persona1.mapaPersonas.put(1, "Ana");
        persona1.mapaPersonas.put(2, "Carlos");

        System.out.println("Personas registradas: " + persona1.mapaPersonas);
    }
}