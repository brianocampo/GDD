
package Tasks;

import UI.*;
import Actions.WaitUntil;
import org.openqa.selenium.WebDriver;


public class ElementoPresente  {
    
    public static boolean LoginExitoso(WebDriver driver){
    
        return WaitUntil.Existe(driver, IndexUI.BTN_CERRAR_SESION);
    }
    
}
