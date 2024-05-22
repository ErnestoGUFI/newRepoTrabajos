package controllers;

// LoginController.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.UsersModel;
import views.Login;

public class Controlador {
    private UsersModel usuario;
    private Login login;

    public Controlador(UsersModel usuario, Login login) {
        this.usuario = usuario;
        this.login = login;

        
        this.login.addLoginListener(new LoginListener());
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = login.getUsername();
            String password = login.getPassword();
            usuario = new UsersModel(username, password);
            boolean isAuthenticated = usuario.authenticate();
            if (isAuthenticated) {
            	login.setMessage("Sesion iniciada");
            } else {
            	login.setMessage("Sesion fallida intenta denuevo.");
            }
        }
    }


}
