// Clase hija que hereda de Persona
public class Estudiante extends Persona {

    // Atributo privado de la clase
    private String carrera;

    // Constructor de Estudiante
    public Estudiante(String nombre, int edad, String correo, String carrera) {

        // Llamamos al constructor de la clase padre
        super(nombre, edad, correo);

        this.carrera = carrera;
    }

    // Getter para obtener la carrera
    public String getCarrera() {
        return carrera;
    }

    // Setter para modificar la carrera
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Sobrescribimos el método de la clase padre
    @Override
    public void mostrarActividad() {
        System.out.println(nombre + " es estudiante de " + carrera);
    }
}
