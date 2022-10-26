package tarea2ClaseArreglos;

import javax.swing.JOptionPane;

public class salinasCelSedeCali {

    public static void main(String[] args) {
        int max = Integer.parseInt(JOptionPane.showInputDialog("ingrese el "
                + "maximo de celulares a almacenar"));

        salinasCel salinasCelulares = new salinasCel(max);
        while (true) {

            int option = Integer.parseInt(JOptionPane.showInputDialog(" "
                    + "selecciona una opcion:\n"
                    + "1. Registrar un celular\n"
                    + "2. Listar todos los celulares\n"
                    + "3. Mostrar los celulares por marca\n"
                    + "4. Mostrar el celulares de mejor camara\n"
                    + "5. Mostrar el celular mas caro\n"
                    + "6. Mostrar el celular mas barato\n"
                    + "7. Salir\n"
            ));
            switch (option) {

                case 1: salinasCelulares.registrarCelulares();
                    break;
                case 2: salinasCelulares.listaCelulares();
                    break;
                case 3: salinasCelulares.mostrarCelularesPorMarca();
                    break;
                case 4: salinasCelulares.mostrarCelularMejorCamara();
                    break;
                case 5: salinasCelulares.mostrarCelularMasCaro();
                    break;
                case 6: salinasCelulares.mostrarCelularMasBarato();
                    break;
                case 7: System.exit(0);
            }
        }
    }

}
