
package Tasks;

import Actions.*;
import UI.*;
import org.openqa.selenium.WebDriver;


public class Login {
    
    public static void iniciarSesion(WebDriver driver,String usuario,String contrasena,String compania){
    
        SendKey.Text(driver, LoginUI.TXT_USUARIO, usuario);
        SendKey.Text(driver, LoginUI.TXT_CONTRASENA, contrasena);
        SendKey.Text(driver, LoginUI.TXT_COMPANIA, compania);
        Click.Clic(driver, LoginUI.BTN_INICIO);
    }
    
}
