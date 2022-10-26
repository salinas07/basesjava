package clase32Matrices;

import javax.swing.JOptionPane;

public class competencia {

    double[][] puntaje;
    int numFilas, numColumnas;

    public competencia(int canJug) {
        puntaje = new double[canJug][4];
        numFilas = canJug;
        numColumnas = 4;
    }

    public void registrarPuntajes() {

        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                puntaje[i][j] = Double.parseDouble(JOptionPane.showInputDialog("ingrese el puntaje " + i + "," + j));
            }
        }
    }

    public String mostrarPuntajes() {
        String mensaje = "";
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                mensaje = mensaje + "\n " + i + "," + j + " es " + puntaje[i][j];
            }
            mensaje = mensaje + "\n";
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

    public double calcularMenor() {
        double menor = puntaje[0][0];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (puntaje[i][j] < menor) {
                    menor = puntaje[i][j];
                }
            }
        }
        return menor;
    }
}
