/*
Clase para representar un usuario y sus credenciales desde la BD.
*/
package modelo;

//Atributos
public class Usuario {
    private String username, password;

 //Constructor
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
//Método para nombre de usuario
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
//Método para nombre de usuario
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
