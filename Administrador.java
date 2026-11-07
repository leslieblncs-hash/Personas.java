// Clase hija que hereda de Persona
public class Administrador extends Persona {

    // Atributo privado
    private String departamento;

    // Constructor de Administrador
    public Administrador(String nombre, int edad, String correo, String departamento) {

        // Llamamos al constructor de la clase padre
        super(nombre, edad, correo);

        this.departamento = departamento;
    }

    // Getter para obtener el departamento
    public String getDepartamento() {
        return departamento;
    }

    // Setter para modificar el departamento
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Sobrescribimos el método de Persona
    @Override
    public void mostrarActividad() {
        System.out.println(nombre + " trabaja en el departamento de " + departamento);
    }
}