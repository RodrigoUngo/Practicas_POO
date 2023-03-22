package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }
    static void ejercicio1(){
        int suma;
        suma = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo"));
        if(suma  > 0){
            for (int i = suma - 1; i > 1; i--){
                suma = suma * i;
            }
            JOptionPane.showMessageDialog(null,suma);

        }
        else{
            JOptionPane.showMessageDialog(null, "El número debe ser positivo");
        }
    }
    static void ejercicio2(){
        Cuenta cuenta1 = new Cuenta("Rodrigo");
        Cuenta cuenta2 = new Cuenta("Ungo",500.06);
        cuenta1.ingresar(300);
        cuenta2.retirar(250.28);
        cuenta1.retirar(99.99);
        cuenta2.ingresar(365);
        cuenta1.ingresar(-50);
        cuenta2.retirar(-450);
    }

    static void ejercicio3(){
        String nombre;
        Double presio, suma = 0.0;
        int productosCant = 0;
        productosCant = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos desea agregar?: "));
        Productos productos[] = new Productos[productosCant];
        for(int i = 0; i < productosCant; i++){
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            presio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
            productos[i] = new Productos(nombre, presio);
        }
        for(int i = 0; i < productosCant; i++){
            suma += productos[i].getPresio();
        }
        JOptionPane.showMessageDialog(null,"La suma de precios es: " + suma);
    }
}