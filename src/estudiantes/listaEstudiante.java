package estudiantes;

import javax.swing.JOptionPane;

public class listaEstudiante {

    estudiante primero;

    public void insertarInicio(int cant) {
        for (int i = 0; i < cant; i++) {
            estudiante nuevo = new estudiante();
            nuevo.pedirDatos();
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
    }

    public String mostrarLista() {
        String mensaje = "";
        estudiante aux = primero;

        while (aux != null) {

            mensaje = mensaje + aux.toString();
            aux = aux.getEnlace();
        }
        return mensaje;
    }
//

    public double promedio() {

        estudiante aux = primero;
        double prome = 0;
        while (aux != null) {
            prome = prome+ aux.notaTotal();
            aux = aux.getEnlace();
        }
        return prome;
    }

    public void mostrarDefinitivaCodigo(String cod) {
        estudiante aux = primero;

        while (aux != null) {
            if(aux.getCodigo().equalsIgnoreCase(cod)){
              JOptionPane.showMessageDialog(null, aux.notaTotal()); 
            }
            aux = aux.getEnlace();
        }
   
    }

        public void datosEstudiante(String datos) {
        estudiante aux = primero;

        while (aux != null) {
            if(aux.getCodigo().equalsIgnoreCase(datos)){
           JOptionPane.showMessageDialog(null, aux.toString());
            }
            aux = aux.getEnlace();
        }
            
    }
        
           public void eliminar(String elim) {
        estudiante aux = primero;

        while (!aux.getEnlace().getCodigo().equalsIgnoreCase(elim)) {
            aux = aux.getEnlace();
            }
            aux.setEnlace(aux.getEnlace().getEnlace());
        }
            
    }


