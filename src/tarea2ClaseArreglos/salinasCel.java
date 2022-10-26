package tarea2ClaseArreglos;

import javax.swing.JOptionPane;

public class salinasCel {

    int posUltimo = 0, tam, mayor = 0;
    celulares[] dispositivos;

    public salinasCel(int tam) {

        dispositivos = new celulares[tam];
        this.tam = tam;
    }

    public void registrarCelulares() {
        if (posUltimo < tam) {
            celulares objCelular = new celulares();
            objCelular.pedirDatos();
            dispositivos[posUltimo] = objCelular;
            posUltimo++;
        } else {
            JOptionPane.showMessageDialog(null, "no caben mas dispositivos");

        }
    }

    public void listaCelulares() {
        String salida = "los dispositivos son: \n\n";
        for (int i = 0; i < posUltimo; i++) {
            salida = salida + dispositivos[i].toString() + "\n";
        }
        System.out.println(salida);
    }

    public void mostrarCelularesPorMarca() {
        String marcas = JOptionPane.showInputDialog("ingrese la marca a listar");
        String salida = "los celulares de marca " + marcas + " son:\n\n";
        for (int i = 0; i < posUltimo; i++) {
            if (dispositivos[i].getMarca().equalsIgnoreCase(marcas)) {
                salida = salida + dispositivos[i].toString() + "\n";
            }
        }

        System.out.println(salida);
    }

    public void mostrarCelularMejorCamara() {
        String salida = "el celular de mejor camara es:\n\n";
        for (int i = 0; i < posUltimo; i++) {
            if (dispositivos[i].getCamara() > mayor) {
                mayor = dispositivos[i].getCamara();
            }
        }
        for (int i = 0; i < posUltimo; i++) {
            if (dispositivos[i].getCamara() == mayor) {
                salida = salida + dispositivos[i].toString() + "\n";
            }
        }
           System.out.println(salida);
    }
    
        public void mostrarCelularMasCaro() {
        String salida = "el celular mas caro es:\n\n";
        for (int i = 0; i < posUltimo; i++) {
            if (dispositivos[i].getPrecio() > mayor) {
                mayor = dispositivos[i].getPrecio();
            }
        }
        for (int i = 0; i < posUltimo; i++) {
            if (dispositivos[i].getPrecio() == mayor) {
                salida = salida + dispositivos[i].toString() + "\n";
            }
        }
           System.out.println(salida);
    }
        
        public void mostrarCelularMasBarato() {
        //String coloor = JOptionPane.showInputDialog("ingrese la marca a listar");
        String salida = "el celular mas barato es:\n\n";
        for (int i = 0; i < posUltimo; i++) {
            if ((dispositivos[i].getPrecio() < mayor)) {
                mayor = dispositivos[i].getPrecio();
            }
        }
        for (int i = 0; i < posUltimo; i++) {
            if (dispositivos[i].getPrecio() == mayor) {
                salida = salida + dispositivos[i].toString() + "\n";
            }
        }
           System.out.println(salida);
    }
}
