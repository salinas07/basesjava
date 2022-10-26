package tarea2ClaseArreglos;

import javax.swing.JOptionPane;

public class celulares {

    private String marca;
    private String color;
    private int ram;
    private int memoriaInterna;
    private int camara;
    private int precio;
    private double frecuenciaProcesador;
    

    public void pedirDatos() {
        marca = JOptionPane.showInputDialog("ingrese la Marca del Celular");
        color = JOptionPane.showInputDialog("ingrese el color del celular");
        ram = Integer.parseInt(JOptionPane.showInputDialog("ingrese la capacidad de la memoria ram en Gb"));
        memoriaInterna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la capacidad de la memoria interna en Gb"));
        camara = Integer.parseInt(JOptionPane.showInputDialog("ingrese los pixeles de la camara principal"));
        setPrecio(Integer.parseInt(JOptionPane.showInputDialog("ingrese lel precio del celular")));
        setFrecuenciaProcesador(Double.parseDouble(JOptionPane.showInputDialog("ingrese la frecuencia del procesador en GHz")));
    }

    public String toString() {
        String retorno = "";
        retorno = "marca:" + marca + ", color:" + color + ", memroria ram:" + ram + ", memoria interna:"
                + memoriaInterna+", camara principal en Pixeles:"+camara+", precio:"+getPrecio()
                +", frecuencia procesador:"+getFrecuenciaProcesador();
        return retorno;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the memoriaInterna
     */
    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    /**
     * @param memoriaInterna the memoriaInterna to set
     */
    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    /**
     * @return the resolucion
     */
    public int getCamara() {
        return camara;
    }

    /**
     * @param camara the resolucion to set
     */
    public void setCamara(int camara) {
        this.camara = camara;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the frecuenciaProcesador
     */
    public double getFrecuenciaProcesador() {
        return frecuenciaProcesador;
    }

    /**
     * @param frecuenciaProcesador the frecuenciaProcesador to set
     */
    public void setFrecuenciaProcesador(double frecuenciaProcesador) {
        this.frecuenciaProcesador = frecuenciaProcesador;
    }
}
