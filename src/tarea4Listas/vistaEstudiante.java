
package tarea4Listas;

import javax.swing.JOptionPane;

public class vistaEstudiante{
    public static void main(String[] args) {
        
     listaEstudiante lista = new listaEstudiante();   
       int cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese la "
                + "cantidad de estudiantes a insertar")); 

        while (true) {

            int option = Integer.parseInt(JOptionPane.showInputDialog(" "
                    + "selecciona una opcion:\n"
                    + "1. Insertar al inicio\n"
                    + "2. Mostrar la lista de estudiantes\n"
                    + "3. Mostrar el promedio del curso\n"
                    + "4. Nota final del estudiante por codigo\n"
                    + "5. datos del estudiante por codigo\n"
                    + "6. Eliminar estudiante por codigo\n"              
                    + "7. Salir\n"
            ));
            switch (option){
                
                case 1: lista.insertarInicio(cant);
                break;
                case 2:JOptionPane.showMessageDialog(null, lista.mostrarLista());
                break;
                case 3:JOptionPane.showMessageDialog(null,"el promedio es:\n\n"+lista.promedio()/cant);
                break;
                case 4: String cod= JOptionPane.showInputDialog(null,"ingrese el codigo del estudiante para saber su nota");
                lista.mostrarDefinitivaCodigo(cod);
                break;
                case 5: String datos= JOptionPane.showInputDialog(null,"ingrese el codigo del estudiante a buscar");
                lista.datosEstudiante(datos);
                break;
                case 6: String elim= JOptionPane.showInputDialog(null,"ingrese el codigo del estudiantea eliminar");
                lista.eliminar(elim);
                break;
                case 7:System.exit(0);
                break;
                default:JOptionPane.showMessageDialog(null, "esta opcion es invalida");
            }
        }

    }
}