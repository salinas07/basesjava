package clase4;

public class listaVendedor {

    vendedor primero;

    public void insertarInicio(int cant) {
        for (int i = 0; i < cant; i++) {
            vendedor nuevo = new vendedor();
            nuevo.pedirDatos();
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
    }

    public String mostrarLista() {
        String mensaje = "";
        vendedor aux = primero;

        while (aux != null) {

            mensaje = mensaje + aux.toString();
            aux = aux.getEnlace();
        }
        return mensaje;
    }

    
    public void insertarFinal(int cant) {
        
        for (int i = 0; i < cant; i++) {
            vendedor ultimo, nuevo;
            ultimo=primero;
            nuevo=new vendedor();
            nuevo.pedirDatos();
            
            if (primero != null){
                while(ultimo.getEnlace() != null){
                    ultimo=ultimo.getEnlace();
                }   
            }else{ 
                primero =nuevo;
            }  
        }
    }
    
    public double totalVentas(){
        
        vendedor aux=primero;
        double suma=0;
        
        while(aux!=null){
            suma=suma+aux.getValorVenta();
            aux=aux.getEnlace();
        }
        return suma;
    }
}
