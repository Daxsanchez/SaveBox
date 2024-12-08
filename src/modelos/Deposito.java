package modelos;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class Deposito {

    private int id;
    private Ahorro ahorro;
    private double monto;
    private Date fecha;
    private String metodo;
    private Usuario usuario;

    public static String CAMPOS = "idAhorro,monto,fecha,metodo,idUsuario";
    
    public Deposito(int id, Ahorro ahorro, double monto, Date fecha, String metodo, Usuario usuario) {
        this.id = id;
        this.ahorro = ahorro;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
        this.usuario = usuario;
    }

    public Deposito() {
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

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
