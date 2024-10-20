/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author zeta9
 */
public class Socios extends Persona{
    private double saldo;
    private double interes;

    public Socios(double saldo, double interes, String nombre, String apellidos, int edad, String correo, String direccion, String cuenta, String contrasena, int id) {
        super(nombre, apellidos, edad, correo, direccion, cuenta, contrasena, id);
        this.saldo = saldo;
        this.interes = interes;
    }

    public Socios() {
        super();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }


}
