package vendedor;

import javax.swing.JOptionPane;

public class vendedor {

    private String nombre;
    private double cedula;
    private double valorVenta;
    private vendedor enlace;// crea un objeto de tipo vendedor

    public void pedirDatos() {
        nombre = JOptionPane.showInputDialog("ingrese el nombre del vendedor");
        valorVenta = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la venta"));
        cedula = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cedula"));

    }

    @Override
    public String toString (){
       return  "Nombres: "+nombre+", valorVenta: "+valorVenta+", cedula: "+cedula+"\n";
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
     * @return the cedula
     */
    public double getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the valorVenta
     */
    public double getValorVenta() {
        return valorVenta;
    }

    /**
     * @param valorVenta the valorVenta to set
     */
    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    /**
     * @return the enlace
     */
    public vendedor getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(vendedor enlace) {
        this.enlace = enlace;
    }
}
