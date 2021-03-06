/*
 *
 * ESTANDAR PARA NOMBRAMIENTO DE CAMPOS
 *
 * btn Button           chk CheckBox                ckl CheckedListBox 
 * cmb ComboBox         dtp DateTimePicker          lbl Label 
 * llb LinkLabel        lst ListBox                 lvw ListView 
 * mtx MaskedTextBox    cdr MonthCalendar           icn NotifyIcon 
 * nud NumeircUpDown    pic PictureBox              prg ProgressBar 
 * rdo RadioButton      rtx RichTextBox             txt TextBox 
 * tip ToolTip          tvw TreeView                wbs WebBrowser
*/


package UI;

import org.openqa.selenium.By;


public class IndexUI {
    
     public static final By BTN_CERRAR_SESION = By.xpath("//a[.='Cerrar sesi�n']");
     public static final By LLB_PLANTILLAS_PROMOCION = By.xpath("//a[.='Plantillas de promoci�n']");
     public static final By LLB_PROMOCIONES = By.xpath("//a[contains(@href,'/promo/promotion/index') and .='Promociones']");
     public static final By BTN_CREAR_PROMOCION = By.xpath("//*[@id='mainwrapper']/div[3]/div[2]/div[2]/a");
     public static final By PRG_PROCESANDO = By.xpath("//div[@class='overlay']");
     
    
}
