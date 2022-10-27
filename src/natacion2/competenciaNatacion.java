
package natacion2;

import javax.swing.JOptionPane;


public class competenciaNatacion {
    public static void main(String[] args) {
        
        int cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de nadadores"));
        
        competencia objComp = new competencia(cant);  
    
        objComp.registrarPuntajes();
        
        JOptionPane.showMessageDialog(null,"el promedio es:\n\n"+objComp.calcularPormedio());
        JOptionPane.showMessageDialog(null,"nombre  es:\n\n"+objComp.mostrarNombrePuntajeAlto());
//        JOptionPane.showMessageDialog(null,"el menor puntaje es:\n\n"+objComp.calcularMenor());
    }
    
}
