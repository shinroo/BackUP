package mypackage;


import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.BasicEditField;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;

public final class Create extends MainScreen
{
    public Create()
    {            
        setTitle("Creating a new account");
        setStatus(new LabelField("This is where you create your account"));
        
        this.add(new RichTextField("Please enter a user name"));
        BasicEditField Name = new BasicEditField();
        this.add(Name);
        
        this.add(new RichTextField("Please enter a password"));
        BasicEditField Password = new BasicEditField();
        this.add(Password);
        
        this.add(new RichTextField("Please re-enter a password"));
        BasicEditField Password2 = new BasicEditField();
        this.add(Password2);      
        

        ButtonField Create = new ButtonField("Create Account");
        this.add(Create);
        
        ButtonField Login = new ButtonField("Return to login page");
        FieldChangeListener Login_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new LoginPage());
        		
        	}
        };
        
        
        Login.setChangeListener(Login_listener);
        this.add(Login);
        this.add(new RichTextField("(you will be asked to renter your credentials)"));
        
        
        
    }
}