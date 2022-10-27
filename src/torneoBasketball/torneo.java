package torneoBasketball;

import javax.swing.JOptionPane;

public class torneo {
    //basketbolista[] jugadores = new basketbolista[10]

    int posUltimo=0, tam;
    //1. arreglo de numbre jugadores  
    basketbolista[] jugadores;

    public torneo(int tam) {    //2. metodo constructor

        // 3.tamaño del arreglo
        jugadores = new basketbolista[tam];
        this.tam = tam;
    }

    public void registrarJugador() {
        if (posUltimo < tam) {
            basketbolista objJugador = new basketbolista();// creo el objeto objJugador para pedir el metodo de pedirDatos
            objJugador.pedirDatos();                      //y luego peter ese objeto en cada arreglo
            jugadores[posUltimo] = objJugador;// aqui el posUltimo me indica la posicion del ultimo
            posUltimo++;//aqui la incremento
        } else {
            JOptionPane.showMessageDialog(null, "no caben mas jugadores");

        }
    }

    public void listaJugadores() {
        String salida = "los jugadores son: \n\n";
        for (int i = 0; i < posUltimo; i++) {
            salida = salida + jugadores[i].toString() + "\n";
        }

        System.out.println(salida);
    }

    public void mostrarJugadoresPorEquipo() {
        String equi = JOptionPane.showInputDialog("ingrese el equipo a listar");
        String salida = "los jugadores del equipo " + equi + " son:\n\n";
        for (int i = 0; i < posUltimo; i++) {
            if (jugadores[i].getEquipo().equalsIgnoreCase(equi)) {
                salida = salida + jugadores[i].toString() + "\n";
            }
        }
        
        System.out.println(salida);
    }
}
