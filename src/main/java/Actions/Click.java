package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Click {
    
    public static void Clic(WebDriver driver,By elemento){
        
        driver.findElement(elemento).click();
    }
    
}
