
package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SendKey {
    
    public static void Text(WebDriver driver,By elemento, String texto){
        
        driver.findElement(elemento).sendKeys(texto);
    }
}
