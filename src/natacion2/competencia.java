package natacion2;

import javax.swing.JOptionPane;

public class competencia {

    double[][] puntaje;
    int numFilas, numColumnas;
    String [] nombres ;
    String [] dias = {"lunes","martes","miercoles","jueves"};
    
    public competencia(int canJug) {
        nombres = new String [canJug];
        puntaje = new double[canJug][4];
        numFilas = canJug;
        numColumnas = 4;
    }

    public void registrarPuntajes() {

        for (int i = 0; i < numFilas; i++) {
            nombres [i]= JOptionPane.showInputDialog("ingrese el nombre del jugador");
            for (int j = 0; j < numColumnas; j++) {
                puntaje[i][j] = Double.parseDouble(JOptionPane.showInputDialog("ingrese el puntaje " + i + "," + j));
            }
        }
    }
    
    

//    public String mostrarPuntajes() {
//        String mensaje = ""; 
//        for (int i = 0; i < numFilas; i++) {
//            mensaje= mensaje + nombres[i];
//            for (int j = 0; j < numColumnas; j++) {
//                mensaje =mensaje + "\n "+dias[j]+"  "+ i + "," + j + " es "+ puntaje[i][j];
//            }
//            mensaje = mensaje +"\n";
//        }
//        return mensaje;
//    }
    
    public String mostrarNombrePuntajeAlto() {
        String mensaje="";
        double menor = puntaje[0][0];
        for (int i = 0; i < numFilas; i++) {
            mensaje= mensaje + nombres[i];
            for (int j = 0; j < numColumnas; j++) {
                if (puntaje[i][j] < menor) {
                    menor = puntaje[i][j];
                }
            }
        }
        return mensaje;
    }
    public double calcularPormedio() {
        double promedio = 0;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                promedio = promedio + puntaje[i][j];
            }
        }
        promedio = promedio / (numFilas * numColumnas);
        return promedio;
    }

//    public double calcularMenor() {
//        double menor = puntaje[0][0];
//        for (int i = 0; i < numFilas; i++) {
//            for (int j = 0; j < numColumnas; j++) {
//                if (puntaje[i][j] < menor) {
//                    menor = puntaje[i][j];
//                }
//            }
//        }
//        return menor;
//    }
}
