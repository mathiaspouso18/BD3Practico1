package Logica;
import java.rmi.Remote;
import java.util.List;

public interface IFachada extends Remote {

    public void ingresarMensaje(String mensaje);

    public List<String> listarMensajes();

    public void recuperarMensajes();
}