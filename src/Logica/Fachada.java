package Logica;

import java.util.List;

public class Fachada {
    List<String> mensajes;
    public void ingresarMensaje(String mensaje){
        mensajes.add(mensaje);
        //TODO(llamada a persistencia?)
    }

    public List<String> listarMensajes(){
        return mensajes;
    }
}
