// Clase hija que hereda de Persona
public class Profesor extends Persona {

    // Atributo privado
    private String especialidad;

    // Constructor de Profesor
    public Profesor(String nombre, int edad, String correo, String especialidad) {

        // Llamamos al constructor de la clase padre
        super(nombre, edad, correo);

        this.especialidad = especialidad;
    }

    // Getter para obtener la especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter para modificar la especialidad
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Sobrescribimos el método de Persona
    @Override
    public void mostrarActividad() {
        System.out.println(nombre + " es profesor de " + especialidad);
    }
}