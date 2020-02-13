package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {

    public static void porTexto(WebDriver driver, By elemento, String texto) {

        try {

            Select cbo = new Select(driver.findElement(elemento));
            cbo.selectByVisibleText(texto);

        } catch (Exception e) {
            System.out.println("Actions.Selection.porTexto()" + e.getMessage());
        }

    }

}
