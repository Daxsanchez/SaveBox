package modelos;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class Retiro {

    int id;
    Ahorro ahorro;
    double monto;
    Date fecha;
    String estatus;
    Usuario usuario;

    public Retiro(int id, Ahorro ahorro, double monto, Date fecha, String estatus, Usuario usuario) {
        this.id = id;
        this.ahorro = ahorro;
        this.monto = monto;
        this.fecha = fecha;
        this.estatus = estatus;
        this.usuario = usuario;
    }

    public Retiro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ahorro getAhorro() {
        return ahorro;
    }

    public void setAhorro(Ahorro ahorro) {
        this.ahorro = ahorro;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

}
