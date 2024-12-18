package modelos;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class Configuracion {

    private int id;
    private Date fechaCierre;
    private Double precioAccion;
    private Double interesSocio;
    private Double interesExterno;
    public static String CAMPOS_ACT = "fechaCierre,precioAccion,interesSocio,interesExterno";

    public Configuracion(int id, Date fechaCierre, Double precioAccion, Double interesSocio, Double interesExterno) {
        this.id = id;
        this.fechaCierre = fechaCierre;
        this.precioAccion = precioAccion;
        this.interesSocio = interesSocio;
        this.interesExterno = interesExterno;
    }

    public Configuracion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Double getPrecioAccion() {
        return precioAccion;
    }

    public void setPrecioAccion(Double precioAccion) {
        this.precioAccion = precioAccion;
    }

    public Double getInteresSocio() {
        return interesSocio;
    }

    public void setInteresSocio(Double interesSocio) {
        this.interesSocio = interesSocio;
    }

    public Double getInteresExterno() {
        return interesExterno;
    }

    public void setInteresExterno(Double interesExterno) {
        this.interesExterno = interesExterno;
    }

}
