package Logica;

import java.util.List;

public class Fachada implements IFachada{
    List<String> mensajes;

    public void ingresarMensaje(String mensaje){
        mensajes.add(mensaje);
    }

    public List<String> listarMensajes(){
        return mensajes;
    }

    public void recuperarMensajes(){

    }
}
