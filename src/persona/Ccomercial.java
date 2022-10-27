package persona;

import javax.swing.JOptionPane;

public class Ccomercial {

    public static void main(String[] args) {
        persona per1 = new persona();
        persona per2 = new persona();

        per1.nombre = "juan";
        per1.edad = 25;
        per1.estatura = 1.78;

        per2.nombre = JOptionPane.showInputDialog("ingrese el nombre");
        per2.edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        per2.estatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la estatura"));

        JOptionPane.showMessageDialog(null, "la persona es: " + per1.nombre + " su "
                + "edad es: " + per1.edad + " y mide: " + per1.estatura);
        
        JOptionPane.showMessageDialog(null, "la persona es: " + per2.nombre + " su "
                + "edad es: " + per2.edad + " y mide: " + per2.estatura);
        
        per1.cumplirAños();
         JOptionPane.showMessageDialog(null, "ahora " + per1.nombre + " tiene "
               + per1.edad+ " años"); 
    }
}
