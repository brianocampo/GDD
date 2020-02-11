
package Tasks;

import Actions.*;
import UI.*;
import org.openqa.selenium.WebDriver;


public class RealizarBusqueda {
    
    public static void BuscarEnGoogle(WebDriver driver,String texto){
    
        SendKey.Text(driver, Login.usuario, texto);
    }
    
}
