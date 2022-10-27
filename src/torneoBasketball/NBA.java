package torneoBasketball;

import javax.swing.JOptionPane;

public class NBA {

    public static void main(String[] args) {

        int max = Integer.parseInt(JOptionPane.showInputDialog("ingrese el "
                + "maximo de jugadores a inscribir en el torneo"));

        torneo oeste = new torneo(max);//en este objeto ingreso como parametro el max para que me lo reconozca en el controlador

        while (true) {

            int option = Integer.parseInt(JOptionPane.showInputDialog(" "
                    + "selecciona una opcion:\n"
                    + "1. Registrar un Jugador\n"
                    + "2. Listar todos los Jugadores\n"
                    + "3. Mostrar los jugadores por Equipo\n"
                    + "4. Salir\n"
            ));
            switch (option){
                
                case 1:oeste.registrarJugador();
                break;
                case 2:oeste.listaJugadores();
                break;
                case 3:oeste.mostrarJugadoresPorEquipo();
                break;
                case 4:System.exit(0);
            }
        }
    }
}
