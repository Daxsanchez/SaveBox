package modelos;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class Ahorro {

    int id;
    Socio socio;
    double montoMensual;
    Date fechaApertura;
    String estatus;
    Usuario usuario;
    double ahorrado;

    public Ahorro(int id, Socio socio, double montoMensual, Date fechaApertura, String estatus, Usuario usuario, double ahorrado) {
        this.id = id;
        this.socio = socio;
        this.montoMensual = montoMensual;
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

    public double getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(double montoMensual) {
        this.montoMensual = montoMensual;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
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
