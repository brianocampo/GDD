
package Tasks;

import Actions.*;
import UI.*;
import com.google.gson.JsonObject;
import org.openqa.selenium.WebDriver;


public class Promocion {
    
    public static void crearPromocion(WebDriver driver,JsonObject JDatos) throws InterruptedException{
        
        Click.Clic(driver, IndexUI.LLB_PROMOCIONES);
        Click.Clic(driver, IndexUI.BTN_CREAR_PROMOCION);
        
        Selection.porTexto(driver, Promocion_createUI.LST_PLANTILLA, JDatos.get("plantilla").getAsString());
        WaitUntil.displayNone(driver, IndexUI.PRG_PROCESANDO);
        
        Selection.porTexto(driver, Promocion_createUI.LST_CAMPAÑA, JDatos.get("campaña").getAsString());
        WaitUntil.displayNone(driver, IndexUI.PRG_PROCESANDO);
        
        Selection.porTexto(driver, Promocion_createUI.LST_TIPO_PROMOCION, JDatos.get("tipoPromocion").getAsString());
        WaitUntil.displayNone(driver, IndexUI.PRG_PROCESANDO);
        
        Selection.porTexto(driver, Promocion_createUI.LST_SUB_TIPO_PROMOCION, JDatos.get("subTipoPromocion").getAsString());
        WaitUntil.displayNone(driver, IndexUI.PRG_PROCESANDO);
        
        Selection.porTexto(driver, Promocion_createUI.LST_FORMA_APLICACION_PROMOCION, JDatos.get("formaAplicacionPromocion").getAsString());
        WaitUntil.displayNone(driver, IndexUI.PRG_PROCESANDO);
        
        Click.Clic(driver, Promocion_createUI.BTN_GUARDAR);
        WaitUntil.displayNone(driver, IndexUI.PRG_PROCESANDO);
        
    }
    
    
    
}
