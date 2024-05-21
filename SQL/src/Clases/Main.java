package Clases;

public class Main {
    public static void main(String[] args) {
        User usuario = new User("", ""); 
        Login login = new Login();
        Controlador controlador = new Controlador(usuario, login);

        login.setVisible(true);
    }
}