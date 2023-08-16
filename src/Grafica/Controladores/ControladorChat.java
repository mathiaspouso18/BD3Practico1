package Grafica.Controladores;

import Grafica.Paneles.Chat;
import Logica.IFachada;

import java.rmi.Naming;

public class ControladorChat {
    private IFachada fachada;

    public ControladorChat(Chat pnv) throws Exception {
        String ruta = "//localhost:8080/fachada";
        fachada = (IFachada) Naming.lookup(ruta);
    }

    public void ingresarMensaje(String mensaje){
        fachada.ingresarMensaje(mensaje);
    }
}
