/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1ClaseObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class tienda {

    public static void main(String[] args) {
        lavadora lav1 = new lavadora();
        lavadora lav2 = new lavadora();
        lavadora lav3 = new lavadora();

        lav1.setMarca ("LG");
        lav1.setColor ("blanco");
        lav1.setCapacidad (18);
        lav1.setPrecio (2000);
        lav1.setNumeroSerie (1.1);

        lav2.setMarca ( JOptionPane.showInputDialog("ingrese la marca de la lavadora 2"));
        lav2.setColor (JOptionPane.showInputDialog("ingrese el color de la lavadora 2"));
        lav2.setCapacidad (Integer.parseInt(JOptionPane.showInputDialog("ingrese la capacidad lavadora 2")));
        lav2.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio")));
        lav2.setNumeroSerie (Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero de serie")));

        lav3.setMarca ( JOptionPane.showInputDialog("ingrese la marca de la lavadora 3"));
        lav3.setColor (JOptionPane.showInputDialog("ingrese el color de la lavadora 3"));
        lav3.setCapacidad (Integer.parseInt(JOptionPane.showInputDialog("ingrese la capacidad")));
        lav3.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio")));
        lav3.setNumeroSerie (Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero de serie")));

        JOptionPane.showMessageDialog(null, "la lavadora 1 de marca: " + lav1.getMarca()
                + ", su numero de serie es " + lav1.getNumeroSerie() + ", de color "
                + lav1.getColor() + ", su capacida es de: " + lav1.getCapacidad() + " lb, el precio es de: " + lav1.getPrecio());

        JOptionPane.showMessageDialog(null, "la lavadora 2 de marca: " + lav2.getMarca()
                + ", su numero de serie es " + lav2.getNumeroSerie()  + ", de color "
                + lav2.getColor() + ", su capacida es de: " + lav2.getCapacidad() + " lb, el precio es de: " + lav2.getPrecio());

        JOptionPane.showMessageDialog(null, "la lavadora 3 de marca: " + lav3.getMarca()
                + ", su numero de serie es " + lav3.getNumeroSerie() + ", de color "
                + lav3.getColor() + ", su capacida es de: " + lav3.getCapacidad() + " lb, el precio es de: " + lav3.getPrecio());

        lav1.masCaro();
        JOptionPane.showMessageDialog(null, "ahora lavadora 1 con numero de serie " + lav1.getNumeroSerie() + ", vale "
                + lav1.getPrecio() + " dolares");

        lav1.cambioColor();
        JOptionPane.showMessageDialog(null, "ahora lavadora 1 con numero de serie " + lav1.getNumeroSerie() + ", es de color "
                + lav1.getColor());

    }
}
