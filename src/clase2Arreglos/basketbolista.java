/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class basketbolista {
    private String nombre;
    private String equipo;
    private int puntos;
    private double estatura;
    
    public void pedirDatos(){ //4. aqui se crea un metodo para que inicialice ingresando los datos
        nombre = JOptionPane.showInputDialog("ingrese el nombre del jugador");
        equipo = JOptionPane.showInputDialog("ingrese el nombre del equipo");
        puntos = Integer.parseInt(JOptionPane.showInputDialog("ingrese los puntos"));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la estatura del jugador"));
    
    }


    public String toString(){
        String retorno = "";
        retorno = "nombre:"+nombre+", equipo:"+equipo+", puntos:"+puntos+", estatura:"+estatura;
        return retorno;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
}
