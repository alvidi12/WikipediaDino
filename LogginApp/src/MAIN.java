import modelo.UsuarioDAO;
import vista.LoginView;
import controlador.LoginController;

public class MAIN {
    public static void main (String[] args){
        LoginView view = new LoginView();
        UsuarioDAO usuariodao = new UsuarioDAO();
        LoginController controller = new LoginController(view, usuariodao);
        
        view.setVisible(true);
    }
    
}
