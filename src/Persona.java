
import java.util.Date;


public class Persona {
    private int codigo;
    String nombre;
    int dni;
    String fecha;
    String direccion;
    String genero;

    public Persona(int codigo, String nombre, int dni, String fecha, String direccion, String genero) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.dni = dni;
    this.fecha = fecha;
    this.direccion = direccion;
    this.genero = genero;
}


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
      
}
