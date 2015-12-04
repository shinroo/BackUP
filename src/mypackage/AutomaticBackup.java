package mypackage;

import net.rim.blackberry.api.blackberrymessenger.BlackBerryMessenger;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.blackberry.api.bbm.platform.service.MessagingService;



public final class AutomaticBackup extends MainScreen
{
    public AutomaticBackup()
    {            
        setTitle("Automatic Backup Screen");
        setStatus(new LabelField("This is where your files are automatically backed-up"));
        
        BlackBerryMessenger.getInstance();
        
        
        
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