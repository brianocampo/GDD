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


public class LoginUI {
    
    public static final By TXT_USUARIO = By.id("username");
    public static final By TXT_CONTRASENA = By.id("password");
    public static final By TXT_COMPANIA = By.id("company");
    public static final By BTN_INICIO = By.id("submit");
    
}
