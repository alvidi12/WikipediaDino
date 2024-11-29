/*
Se crea una clase LogginController para dar paso al funcionamiento de la interfaz llamada Login
*/
package controlador;
import modelo.Usuario;  // Llamado a la clase usuario que contiene la información y acceso a la base de datos.
import modelo.UsuarioDAO;   //Clase encargada de llamar desde la base de datos la información que corresponda.
import vista.LoginView; //Clase a llamar para visualizar la inferza del login.
import vista.Inicio;    // Llamado a la interfaz del panel prinicipal luego del  inicio exitoso.
import javax.swing.*;   //Biblioteca de Java para crear interfaces gráficas.
import java.awt.event.ActionEvent; //Captar o manejar el evento por botón.
import java.awt.event.ActionListener; //Escucha el evento del botón.

//Atrinutos
public class LoginController {
    private LoginView view;
    private UsuarioDAO usuariodao;

//Constructor
    public LoginController(LoginView view, UsuarioDAO usuariodao){
        this.view = view;
        this.usuariodao = usuariodao;

        
        //Action Listener, para poder capturar el evento del botón login y acceder al metodo de verificarLogin..
        this.view.getBtnLogin().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                verificarLogin();
                
            }
        });
    }

//Métodos    
    private void verificarLogin(){
        String username =  view.getTxtUsername().getText();
        String password = new String(view.getTxtPassword().getPassword());
        Usuario usuario = new Usuario(username,password);   //Ingreso de información.
       
        boolean existe = usuariodao.validarUsuario(usuario);    //Verifica si el dato existe en la base de datos.
        if(existe){
            JOptionPane.showMessageDialog(view, "¡Haz iniciado sesión a la wikipedia de Dinosaurios!.");
            
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.dispose(); //Cerramos pestaña login, hace cambio de pestaña de inicio sesion
            
        }else{
            JOptionPane.showMessageDialog(view, "Usuario o contraseña incorrecta");
        }
    }
    private void dispose() {
        throw new UnsupportedOperationException(); //Cierra la ventana del login.
    }
}
