package Clases;

// LoginController.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private User usuario;
    private Login login;

    public Controlador(User usuario, Login login) {
        this.usuario = usuario;
        this.login = login;

        
        this.login.addLoginListener(new LoginListener());
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = login.getUsername();
            String password = login.getPassword();
            usuario = new User(username, password);
            boolean isAuthenticated = usuario.authenticate();
            if (isAuthenticated) {
            	login.setMessage("Sesion iniciada");
            } else {
            	login.setMessage("Sesion fallida intenta denuevo.");
            }
        }
    }


}
