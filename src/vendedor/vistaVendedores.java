
package vendedor;

import javax.swing.JOptionPane;

public class vistaVendedores {
    public static void main(String[] args) {
        
     listaVendedor lista = new listaVendedor();   
        
       int cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese la "
                + "cantidad de vendedores a insertar")); 
       
                lista.insertarInicio(cant);
                lista.insertarFinal(cant);
                JOptionPane.showMessageDialog(null, lista.mostrarLista());
                JOptionPane.showMessageDialog(null, lista.totalVentas());
    }
}

//        while (true) {
//
//            int option = Integer.parseInt(JOptionPane.showInputDialog(" "
//                    + "selecciona una opcion:\n"
//                    + "1. Registrar un Jugador\n"
//                    + "2. Listar todos los Jugadores\n"
//                    + "3. Mostrar los jugadores por Equipo\n"
//                    + "4. Salir\n"
//            ));
//            switch (option){
//                
//                case 1:oeste.registrarJugador();
//                break;
//                case 2:oeste.listaJugadores();
//                break;
//                case 3:oeste.mostrarJugadoresPorEquipo();
//                break;
//                case 4:System.exit(0);
//            }
//        }