package modelos;

import java.util.Date;

/**
 *
 * @author zeta9
 */
public class Prestamo {

    private int id;
    private Socio socio;
    private double monto;
    private double intereses;
    private Date fechaAprobacion;
    private Date fechaLiquidacion;
    private double saldoRestante;
    private String estatus;
    private Usuario usuario;
    
    public static String CAMPOS = "idSocio,monto,intereses,fechaAprobacion,fechaLiquidacion,saldoRestante,estatus,idUsuario";

    public Prestamo(int id, Socio socio, int monto, double intereses, Date fechaAprobacion, Date fechaLiquidacion, double saldoRestante, String estatus, Usuario usuario) {
        this.id = id;
        this.socio = socio;
        this.monto = monto;
        this.intereses = intereses;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaLiquidacion = fechaLiquidacion;
        this.saldoRestante = saldoRestante;
        this.estatus = estatus;
        this.usuario = usuario;
    }

    public Prestamo() {
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Date getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(Date fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public double getSaldoRestante() {
        return saldoRestante;
    }

    public void setSaldoRestante(double saldoRestante) {
        this.saldoRestante = saldoRestante;
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
