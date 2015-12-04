package mypackage;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.BasicEditField;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;

public final class LoginPage extends MainScreen
{
    public LoginPage()
    {            
        setTitle("Login Page");
        setStatus(new LabelField("Please login or create a new account to access home screen"));
        
        this.add(new RichTextField("Please enter your user name:"));
        BasicEditField Name = new BasicEditField();
        this.add(Name);
        this.add(new RichTextField("Please enter your password:"));
        BasicEditField Password = new BasicEditField();
        this.add(Password);       
        
        
        ButtonField Login = new ButtonField("Login");
        FieldChangeListener Login_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new HomeScreen());
        		
        	}
        };
        Login.setChangeListener(Login_listener);
        this.add(Login);
        
        
        this.add(new RichTextField("To create a new account press the button below"));
        ButtonField Create = new ButtonField("Create New Account");
        FieldChangeListener Create_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new Create());
        		
        	}
        };
        Create.setChangeListener(Create_listener);
        this.add(Create);
        
        
        
        
    }
}