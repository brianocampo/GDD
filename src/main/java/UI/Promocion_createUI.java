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


public class Promocion_createUI {
    
     public static final By LST_PLANTILLA = By.id("baseTemplate");
     public static final By LST_CAMPAÑA = By.id("campaign");
     public static final By LST_TIPO_PROMOCION = By.id("promotionType");
     public static final By LST_SUB_TIPO_PROMOCION = By.id("promotionSubType");
     public static final By LST_FORMA_APLICACION_PROMOCION = By.id("promotionApplicationForm");
     public static final By BTN_GUARDAR = By.id("create");
    
}
