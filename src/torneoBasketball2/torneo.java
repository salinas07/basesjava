package torneoBasketball2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class torneo {

    ArrayList<basketbolista>  jugadores;//creo el arraylist como determinado

    public torneo() {   
        jugadores = new ArrayList();//el metodo constructor no tendra paramentros
    }

    public void registrarJugador() {
            basketbolista objJugador = new basketbolista();
            objJugador.pedirDatos();                     
            jugadores.add(objJugador);
    }

    public void listaJugadores() {
        String salida = "los jugadores son: \n\n";
        for (int i = 0; i < jugadores.size(); i++) {//incluyo el .size() 
            salida = salida + jugadores.get(i).toString() + "\n";//incluyo el .get
        }

        System.out.println(salida);
    }

    public void mostrarJugadoresPorEquipo() {
        String equi = JOptionPane.showInputDialog("ingrese el equipo a listar");
        String salida = "los jugadores del equipo " + equi + " son:\n\n";
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getEquipo().equalsIgnoreCase(equi)) {
                salida = salida + jugadores.get(i).toString() + "\n";
            }
        }
        
        System.out.println(salida);
    }
}
