package Clases;

import controllers.Controlador;
import models.UsersModel;
import views.Login;

public class Main {
    public static void main(String[] args) {
    	UsersModel usuario = new UsersModel("", ""); 
        Login login = new Login();
        Controlador controlador = new Controlador(usuario, login);

        login.setVisible(true);
    }
}