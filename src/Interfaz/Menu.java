package Interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener{
    JButton login,noticias,causas,salir;
    JLabel aqua;
    String ruta = "/imagenes/";
    ImageIcon iconFondo = new ImageIcon(getClass().getResource(ruta + "fondo.jpg"));
    ImageIcon iconusu = new ImageIcon(getClass().getResource(ruta + "icono-login.png"));
    Font Aqua = new Font("Arial",3,70);
    public Menu(){
        setTitle("Aqua");
        setLayout(null);
        setSize(910,607);     
        setLocationRelativeTo(this);

        ((JPanel) getContentPane()).setOpaque(false);
        JLabel lblfondo = new JLabel(iconFondo);
        getLayeredPane().add(lblfondo, JLayeredPane.FRAME_CONTENT_LAYER);
        lblfondo.setBounds(-1, -1, iconFondo.getIconWidth(), iconFondo.getIconHeight());

        login = new JButton(iconusu);
        login.setBounds(0, 0, 30, 30);
        add(login);

        salir = new JButton();
        salir.setBounds(864, 0, 30, 30);
        salir.addActionListener(this);
        add(salir);

        aqua = new JLabel("Aqua");
        aqua.setBounds(370, 150, 200, 200);
        aqua.setFont(Aqua);
        add(aqua);

        setVisible(true);
    }//fin del constructor
    public void actionPerformed(ActionEvent boton) {
        if(boton.getSource() == salir){
            dispose();
        }
    }
}
