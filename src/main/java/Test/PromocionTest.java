package Test;

import Tasks.*;
import com.google.gson.JsonObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PromocionTest {
    
    WebDriver driver = null;
    
    @BeforeTest
    public void crearDriver() {        
        driver = crearChromeDriver();
    }
    
    @Test
    public void crearPromocion() throws InterruptedException {
        
        driver.get("https://23.96.11.167:8888/promo/login/auth");
        Login.iniciarSesion(driver, "brian.ocampo", "Brian2020*", "exito");
        ElementoPresente.LoginExitoso(driver);
        
        JsonObject jObjeto = new JsonObject();
        jObjeto.addProperty("plantilla", "DCTO 2 x 1");
        jObjeto.addProperty("campaña", "General");
        jObjeto.addProperty("tipoPromocion", "Genérico");
        jObjeto.addProperty("subTipoPromocion", "Genérico");
        jObjeto.addProperty("formaAplicacionPromocion", "Genérico");
        
        Promocion.crearPromocion(driver, jObjeto);
        
    }
    
    @AfterTest
    public void cerrarDriver() {
        //driver.quit();
    }

    /**
     * Metodo para crear automatizacion con Chrome
     *
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
