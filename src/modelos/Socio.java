package modelos;

import java.util.Date;

/**
 *
 * @author zeta9
 */
public class Socio {
    
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String correo;
    private String direccion;
    private Date fechaCreacion;
    private int estatus;
    
    public static String CAMPOS = "nombre,apellidos,edad,correo,direccion,fechaCreacion,estatus";

    public Socio(int id, String nombre, String apellidos, int edad, String correo, String direccion, Date fechaCreacion, int estatus) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
        this.estatus = estatus;
    }

    public Socio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    
    
}
