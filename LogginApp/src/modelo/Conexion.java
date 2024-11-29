/*
Se crea una clase encargada de establecer la conexión con nuestra base de datos e interactuar con ella.
*/
package modelo;
import java.sql.Connection; //Para obtener una conexión a la BD.
import java.sql.DriverManager;  //Para establecer una conexión con la base de datos utilizando la URL, el usuario y la contraseña específico.
import java.sql.SQLException;   //Captura cualquier excepción que ocurra durante la conexión.

public class Conexion { //Nos conectamos a una base de datos
    private static final String  URL = "jdbc:mysql://localhost:3306/loginDB"; //ponemos el numero del puerto 3306
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    //Metodo para hacer la conexion a la base de dato
    public Connection getConnection(){
        Connection connection = null;
        try{    //Aqui se agregaran las extenciones necesarias para interactuar con la base de datos.
            connection = DriverManager.getConnection(URL, USER, PASSWORD);  //Inicia el intento para establecer una conexión.
            System.out.println("Conexion exitosa con la base de datos");
        }catch(SQLException e){//aqui utilizamos libreria "SQLException" y hacemos instancia en el caso de que de error con la base de datos
            e.printStackTrace(); //Nos devuelve el tipo de error gracias a la extensión SQLExeption.
        }
        return connection;
    } 
}
