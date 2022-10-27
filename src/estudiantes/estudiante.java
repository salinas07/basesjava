package estudiantes;

import javax.swing.JOptionPane;

public class estudiante {

    private String nombre;
    private String codigo;
    private double notaParcial1;
    private double notaParcial2;
    private double notaParcial3;
    private double defTalleres;
    private double proyecto;
    
    private estudiante enlace;// crea un objeto de tipo vendedor

    public void pedirDatos() {
        setNombre(JOptionPane.showInputDialog("ingrese el nombre del estusiante"));
        setCodigo(JOptionPane.showInputDialog("ingrese el codigo del estudiante"));
        setNotaParcial1(Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del primer parcial")));
        setNotaParcial2(Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del segundo parcial")));
        setNotaParcial3(Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del tercer parcial")));
        setDefTalleres(Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota de talleres")));
        setProyecto(Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del proyecto")));
    }

    @Override
    public String toString() {
        return "Nombres: " + getNombre() +
                "\n codigo: " + getCodigo() + 
                "\n nota parcial 1: " + getNotaParcial1() +
                "\n nota parcial 2: " + getNotaParcial2() +
                "\n nota parcial 3: " + getNotaParcial3() +
                "\n Talleres: " + getDefTalleres() +
                "\n proyecto final: " + getProyecto() +"\n\n";
    }
    
    public double notaTotal(){
        double notaFinal= (notaParcial1*0.2)+(notaParcial2*0.2)+
        (notaParcial3*0.2)+(defTalleres*0.2)+(proyecto*0.2);
        return notaFinal;
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the notaParcial1
     */
    public double getNotaParcial1() {
        return notaParcial1;
    }

    /**
     * @param notaParcial1 the notaParcial1 to set
     */
    public void setNotaParcial1(double notaParcial1) {
        this.notaParcial1 = notaParcial1;
    }

    /**
     * @return the notaParcial2
     */
    public double getNotaParcial2() {
        return notaParcial2;
    }

    /**
     * @param notaParcial2 the notaParcial2 to set
     */
    public void setNotaParcial2(double notaParcial2) {
        this.notaParcial2 = notaParcial2;
    }

    /**
     * @return the notaParcial3
     */
    public double getNotaParcial3() {
        return notaParcial3;
    }

    /**
     * @param notaParcial3 the notaParcial3 to set
     */
    public void setNotaParcial3(double notaParcial3) {
        this.notaParcial3 = notaParcial3;
    }

    /**
     * @return the defTalleres
     */
    public double getDefTalleres() {
        return defTalleres;
    }

    /**
     * @param defTalleres the defTalleres to set
     */
    public void setDefTalleres(double defTalleres) {
        this.defTalleres = defTalleres;
    }

    /**
     * @return the proyecto
     */
    public double getProyecto() {
        return proyecto;
    }

    /**
     * @param proyecto the proyecto to set
     */
    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }

    /**
     * @return the enlace
     */
    public estudiante getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(estudiante enlace) {
        this.enlace = enlace;
    }

    /**
     * @return the nombre
     */
}