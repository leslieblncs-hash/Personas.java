// Importamos las colecciones que utilizaremos
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

// Clase padre Persona
public class Persona {

    // Atributos públicos, protegidos y privados
    public String nombre;
    protected int edad;
    private String correo;

    // Variables primitivas y sus equivalentes objeto

    // Tipo int
    public int edad_primitiva;
    public Integer edad_objeto;

    // Tipo double
    public double salario_primitivo;
    public Double salario_objeto;

    // Tipo char
    public char inicial_primitiva;
    public Character inicial_objeto;

    // Tipo boolean
    public boolean activo_primitivo;
    public Boolean activo_objeto;

    // Tipo long
    public long numero_primitivo;
    public Long numero_objeto;

    // Tipo float
    public float promedio_primitivo;
    public Float promedio_objeto;

    // Tipo byte
    public byte nivel_primitivo;
    public Byte nivel_objeto;

    // Tipo short
    public short codigo_primitivo;
    public Short codigo_objeto;

    // Colección ArrayList
    public ArrayList<String> listaMaterias = new ArrayList<>();

    // Colección LinkedList
    public LinkedList<Integer> listaEdades = new LinkedList<>();

    // Colección HashSet
    public HashSet<String> conjuntoNombres = new HashSet<>();

    // Colección HashMap
    public HashMap<Integer, String> mapaPersonas = new HashMap<>();

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // Getter para obtener el correo
    public String getCorreo() {
        return correo;
    }

    // Setter para modificar el correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Setter para modificar la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que utilizarán las clases hijas
    public void mostrarActividad() {
        System.out.println("La persona realiza una actividad.");
    }
}
