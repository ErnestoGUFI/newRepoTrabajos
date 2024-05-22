package models;

import java.sql.*;

public class UsersModel {
    private String usuario;
    private String contraseña;

    // Constructor
    public UsersModel(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Getters
    public String getUsername() {
        return usuario;
    }

    public String getPassword() {
        return contraseña;
    }

    
    public boolean authenticate() {
        boolean isAuthenticated = false;
        String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_UsuariosErnestoGF";
        String dbUser = "freedb_adminGF";
        String dbPassword = "hXThQuq*K?9RG89";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, dbUser, dbPassword)) {
                String query = "SELECT * FROM users WHERE username = ? AND password = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, this.usuario);
                    stmt.setString(2, this.contraseña);
                    ResultSet rs = stmt.executeQuery();
                    isAuthenticated = rs.next();
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return isAuthenticated;
    }
}
