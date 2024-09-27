package modelos;

/**
 *
 * @author daxsa
 */
public class Empresa {

    private String razonSocial;
    private String rfc;
    private String contacto;
    private String direccion;
    private String colonia;
    private String estado;
    private String municipio;
    private String cp;
    private String correo;
    private String tel;
    private String cel;

    public Empresa() {
    }

    public Empresa(String razonSocial, String rfc, String contacto, String direccion, String colonia, String estado, String municipio, String cp, String correo, String tel, String cel) {
        this.razonSocial = razonSocial;
        this.rfc = rfc;
        this.contacto = contacto;
        this.direccion = direccion;
        this.colonia = colonia;
        this.estado = estado;
        this.municipio = municipio;
        this.cp = cp;
        this.correo = correo;
        this.tel = tel;
        this.cel = cel;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
}
