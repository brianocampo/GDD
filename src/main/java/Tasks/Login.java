
package Tasks;

import Actions.*;
import UI.*;
import org.openqa.selenium.WebDriver;


public class Login {
    
    public static void iniciarSesion(WebDriver driver,String usuario,String contrasena,String compania){
    
        SendKey.Text(driver, LoginUI.usuario, usuario);
        SendKey.Text(driver, LoginUI.contrasena, contrasena);
        SendKey.Text(driver, LoginUI.compania, compania);
        Click.Clic(driver, LoginUI.inicio);
    }
    
}
