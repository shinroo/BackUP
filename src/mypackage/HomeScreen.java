package mypackage;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.component.LabelField;


public final class HomeScreen extends MainScreen
{
  
    public HomeScreen()
    {        
    	
        setTitle("Welcome to Robert and Kuda's Backup App");
        this.add(new RichTextField("Home Screen"));
        this.add(new RichTextField(" "));
        this.add(new RichTextField("This is for exsisting account"));
        ButtonField BackUp = new ButtonField("Backup");
        ButtonField Restore = new ButtonField("Restore");
        ButtonField Cloud = new ButtonField("Cloud");

        
        FieldChangeListener BackUp_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new BackUp());
        		
        	}
        };
        BackUp.setChangeListener(BackUp_listener);
        this.add(BackUp);
        
        FieldChangeListener Restore_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new Restore());
        		
        	}
        };
        Restore.setChangeListener(Restore_listener);
        this.add(Restore);
        
        FieldChangeListener Cloud_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new Cloud());
        		
        	}
        };

        Cloud.setChangeListener(Cloud_listener);
        this.add(Cloud);
        
        ButtonField Login = new ButtonField("Return to login page");
        LabelField Warning = new LabelField("(you will be asked to relogin to return to this page)");
        this.add(Warning);
        FieldChangeListener Login_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new LoginPage());
        		
        	}
        };

        Login.setChangeListener(Login_listener);
        this.add(Login);
        
        
        

        
        
    }
}