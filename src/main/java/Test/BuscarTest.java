
package Test;

import Tasks.RealizarBusqueda;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuscarTest {
    
    WebDriver driver = null;
    

    
    @BeforeTest
    public void crearDriver(){   
        driver = crearChromeDriver();
    }
    
    
    
    @Test
    public void buscar(){
    
        driver.get("https://www.google.com/");
        RealizarBusqueda.BuscarEnGoogle(driver, "hola mundo");
    
    }
    
    @AfterTest
    public void cerrarDriver(){
        driver.quit();
    }
    
    
    /**
     * Metodo para crear automatizacion con Chrome
     * @return 
     */
    public WebDriver crearChromeDriver() {

        try {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            //options.addArguments("--headless");
            //options.addArguments("--disable-gpu");
            ChromeDriver driver = new ChromeDriver(options);
            return driver;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
}
