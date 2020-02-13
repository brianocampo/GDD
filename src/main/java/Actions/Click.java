package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Click {
    
    public static void Clic(WebDriver driver,By elemento){
        
        try {
            
            driver.findElement(elemento).click();
            
        } catch (Exception e) {
            System.out.println("Actions.Click.Clic()" + e.getMessage());
        }
        
    }
    
}
