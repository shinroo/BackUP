package mypackage;


import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;

public final class Cloud extends MainScreen
{
    public Cloud()
    {            
        setTitle("Cloud Page");
        setStatus(new LabelField("This is the cloud page"));
        
        ButtonField Home = new ButtonField("Return to home page");
        FieldChangeListener Home_listener = new FieldChangeListener() {
        	public void fieldChanged(Field field, int context){
        		UiApplication.getUiApplication().pushScreen(new HomeScreen());
        		
        	}
        };
        Home.setChangeListener(Home_listener);
        this.add(Home);
              
        
    }
}