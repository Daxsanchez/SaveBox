package modelos;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class Ahorro {

    private int id;
    private Socio socio;
    private double montoQuincenal;
    private Date fechaApertura;
    private int estatus;
    private Usuario usuario;
    private double ahorrado;

    public static String CAMPOS = "idSocio,montoMensual,fechaApertura,estatus,idUsuario,ahorrado";

    public Ahorro(int id, Socio socio, double montoMensual, Date fechaApertura, int estatus, Usuario usuario, double ahorrado) {
        this.id = id;
        this.socio = socio;
        this.montoQuincenal = montoMensual;
        this.fechaApertura = fechaApertura;
        this.estatus = estatus;
        this.usuario = usuario;
        this.ahorrado = ahorrado;
    }

    public Ahorro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public double getMontoQuincenal() {
        return montoQuincenal;
    }

    public void setMontoQuincenal(double montoQuincenal) {
        this.montoQuincenal = montoQuincenal;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getAhorrado() {
        return ahorrado;
    }

    public void setAhorrado(double ahorrado) {
        this.ahorrado = ahorrado;
    }

}
