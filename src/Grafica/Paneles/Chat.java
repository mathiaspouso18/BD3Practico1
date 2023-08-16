package Grafica.Paneles;

import Grafica.Controladores.ControladorChat;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPanel;
    private JTextArea taMensaje;

    JTable table;
    Chat vista;

    public Chat() throws Exception{
        ControladorChat controlador = new ControladorChat(vista);
        contentPanel = new JPanel();
        contentPanel.setBorder(new TitledBorder(null, "Chat", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        setContentPane(contentPanel);

        taMensaje = new JTextArea();
        taMensaje.setLineWrap(true);
        taMensaje.setColumns(10);
        taMensaje.setBounds(140, 92, 150, 48);
        contentPanel.add(taMensaje);

        JButton btnAceptar = new JButton("Enviar");
        btnAceptar.setBounds(55, 324, 120, 20);
        contentPanel.add(btnAceptar);

        btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                controlador.ingresarMensaje(taMensaje.getText());
            }
        });

        btnAceptar.setBounds(278, 226, 117, 29);

        contentPanel.add(btnAceptar);
    }
}
