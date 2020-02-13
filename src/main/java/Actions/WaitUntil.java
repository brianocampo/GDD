
package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitUntil {
    
    
    public static boolean Existe(WebDriver driver, By elemento){
    
        try {
            
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
            return true;
            
        } catch (Exception e) {
            System.out.println("Actions.WaitUntil.Existe()" + e.getMessage());
            return false;
        }
    }
    
     public static void displayNone(WebDriver driver, By elemento){
    
        try {
            
            WebElement wElement = driver.findElement(elemento);
            
            if (wElement.isDisplayed()){
                Thread.sleep(1000);
                displayNone(driver, elemento);
            }
            
        } catch (Exception e) {
            System.out.println("Actions.WaitUntil.displayNone()" + e);
        }
    }
    
}
