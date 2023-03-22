package org.example;

import javax.swing.*;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad){
        if(cantidad > 0){
            setCantidad(getCantidad() + cantidad);
            JOptionPane.showMessageDialog(null,"Usuario: " + getTitular() + " Cantidad en cuenta: " + getCantidad());
        }
        else
            JOptionPane.showMessageDialog(null,"Cantidad ingresada es incorrecta");
    }
    public void retirar(double cantidad){
        if(cantidad > 0){
            if(getCantidad()-cantidad < 0) {
                setCantidad(0);
                JOptionPane.showMessageDialog(null, "Usuario: " + getTitular() + " Cantidad en cuenta: " + getCantidad());
            }
            else {
                setCantidad(getCantidad() - cantidad);
                JOptionPane.showMessageDialog(null,"Usuario: " + getTitular() + " Cantidad en cuenta: " + getCantidad());
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Cantidad ingresada es incorrecta");
    }
}
