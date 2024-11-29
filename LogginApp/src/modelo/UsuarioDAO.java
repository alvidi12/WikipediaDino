/*
Clase encargada de intereactuar con la base de datos y realizar las operaciones dadas por el usuario.
*/
package modelo;
import java.sql.Connection; //Para obtener una conexión a la BD.
import java.sql.PreparedStatement;  //Encargado de generar  SQL con parámetros.
import java.sql.ResultSet;  //Ejecuta las consultas SQL.
import java.sql.SQLException;   //Corrigue y da un diagnosico si ocurre un error en la consulta.

//Validar los datos de user y pass dentro de la DB
public class UsuarioDAO {
    private Conexion conexion;  //Instancia para conectar a la DB

//Constructor    
    public UsuarioDAO(){
        this.conexion = new Conexion();
    }
        
    //Método para validar los datos
    public boolean validarUsuario(Usuario usuario){
        boolean existe = false; //El valor por defecto es true.
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try(Connection conn = conexion.getConnection(); // Se obtiene una conexión a la BD utilizando el método getConnection de la clase Conexion.
                PreparedStatement ps = conn.prepareStatement(sql)){ //Preparando la consulta
            ps.setString(1, usuario.getUsername());//Establece el valor del username en la consulta
            ps.setString(2, usuario.getPassword());
            ResultSet rs = ps.executeQuery();   //Encargado de ejecutar la consulta y entregar el resultado.
            if(rs.next()){
                existe = true;
            }  
        }catch(SQLException e){ //Maneja si hay alguna excepción.
            e.printStackTrace();
        }
        return existe;   
    }
}
