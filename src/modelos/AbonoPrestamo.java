package modelos;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class AbonoPrestamo {

    int id;
    Prestamo prestamo;
    double monto;
    Date fecha;
    String metodo;

    public AbonoPrestamo(int id, Prestamo prestamo, double monto, Date fecha, String metodo) {
        this.id = id;
        this.prestamo = prestamo;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
    }

    public AbonoPrestamo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
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

}
