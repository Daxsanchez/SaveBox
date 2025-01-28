package modelos;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class Externo {

    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private Date fechaCreacion;
    private int estatus;

    public static String CAMPOS = "nombre,apellidos,correo,telefono,fechaCreacion,estatus";
    public static String CAMPOS_ACT = "nombre,apellidos,correo,telefono";

    public Externo(int id, String nombre, String apellidos, String correo, String telefono, Date fechaCreacion, int estatus) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;
        this.estatus = estatus;
    }

    public Externo() {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public static String getCAMPOS() {
        return CAMPOS;
    }

    public static void setCAMPOS(String CAMPOS) {
        Externo.CAMPOS = CAMPOS;
    }

    public static String getCAMPOS_ACT() {
        return CAMPOS_ACT;
    }

    public static void setCAMPOS_ACT(String CAMPOS_ACT) {
        Externo.CAMPOS_ACT = CAMPOS_ACT;
    }

}
