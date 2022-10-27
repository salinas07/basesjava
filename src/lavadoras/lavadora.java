/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadoras;

/**
 *
 * @author JOSE
 */
public class lavadora {

    private String marca;
    private String color;
    private int capacidad;
    private int precio;
    private double numeroSerie;
    
//marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    
//color
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
//capacidad
    public void setCapacidad(int capacidad) {
        this.capacidad=capacidad;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    //precio
    public void setPrecio(int precio) {
        this.precio=precio;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    //numero de serie
    public void setNumeroSerie(double numeroSerie) {
        this.numeroSerie=numeroSerie;
    }
    
    public double getNumeroSerie(){
        return numeroSerie;
    }
    
    
   // metodos  
    
    public void masCaro() {
        precio = precio + 2;
    }

    public void cambioColor() {
        color = "rojo";

    }

}
