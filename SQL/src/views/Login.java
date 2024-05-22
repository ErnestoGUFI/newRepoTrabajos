package views;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public Login() {
        // Configuración del JFrame
        setTitle("Login");
        setSize(800, 600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creación de componentes
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(64, 0, 128)); 

        // Componentes visuales del primer código
        JLabel loginTag = new JLabel("Inicio De Sesion", JLabel.CENTER);
        loginTag.setSize(500, 80);
        loginTag.setLocation(150, 40);
        loginTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        loginTag.setForeground(Color.white);
        panel.add(loginTag);

        // Texto de usuario
        JLabel usuario = new JLabel("INGRESA TU USUARIO");
        usuario.setSize(400, 20);
        usuario.setLocation(200, 150);
        usuario.setFont(new Font("Arial Black", Font.ITALIC, 16));
        usuario.setForeground(Color.WHITE);
        panel.add(usuario);

        // Ingresar usuario
        usernameField = new JTextField();
        usernameField.setSize(401, 50);
        usernameField.setLocation(199, 181);
        usernameField.setBorder(new LineBorder(Color.black, 2, true));
        panel.add(usernameField);

        // Texto de contraseña
        JLabel contrasena = new JLabel("INGRESA TU CONTRASEÑA");
        contrasena.setSize(400, 20);
        contrasena.setLocation(200, 287);
        contrasena.setFont(new Font("Arial Black", Font.ITALIC, 16));
        contrasena.setForeground(Color.WHITE);
        panel.add(contrasena);

        // Ingresar contraseña
        passwordField = new JPasswordField();
        passwordField.setSize(400, 50);
        passwordField.setLocation(200, 318);
        panel.add(passwordField);

        // Botón de Acceder
        loginButton = new JButton("Acceder");
        loginButton.setSize(150, 40);
        loginButton.setLocation(315, 379); 
        loginButton.setBackground(new Color(255, 255, 0));
        loginButton.setFont(new Font("Arial Black", Font.ITALIC, 24));
        panel.add(loginButton);

        // Etiqueta de mensaje
        messageLabel = new JLabel();
        messageLabel.setSize(500, 20); 
        messageLabel.setLocation(250, 430); 
        messageLabel.setFont(new Font("Arial Black", Font.ITALIC, 16));
        messageLabel.setForeground(Color.WHITE);
        panel.add(messageLabel);

        getContentPane().add(panel);
    }

    
    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void setMessage(String message) {
        messageLabel.setText(message);
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }
}

