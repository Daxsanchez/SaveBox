/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author zeta9
 */
public class Usuarios extends Persona{
    private String tipoUsuario;
    private double salario;

    public Usuarios(String tipoUsuario, double salario, String nombre, String apellidos, int edad, String correo, String direccion, String cuenta, String contrasena) {
        super(nombre, apellidos, edad, correo, direccion, cuenta, contrasena);
        this.tipoUsuario = tipoUsuario;
        this.salario = salario;
    }

    public Usuarios() {
        super();
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
}
