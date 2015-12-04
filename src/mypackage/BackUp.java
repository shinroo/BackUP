package mypackage;


import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.FlowFieldManager;
import net.rim.device.api.ui.container.MainScreen;

public final class BackUp extends MainScreen
{
    public BackUp()
    {            
        setTitle("BackUp Page");
        setStatus(new LabelField("This is the BackUp page"));
        
       
        FlowFieldManager flowFieldManager = new FlowFieldManager();
        
        ButtonField Automatic = new ButtonField("Automatic backup system") {
            protected void fieldChangeNotify(int context) {
            	super.fieldChangeNotify(context);
            	Dialog.alert("You have selected an Automatic backup method");
            	UiApplication.getUiApplication().pushScreen(new AutomaticBackup());
             }
         };
         
         ButtonField Manual = new ButtonField("Manual backup system") {
             protected void fieldChangeNotify(int context) {
             	super.fieldChangeNotify(context);
             	Dialog.alert("You have selected an Manual backup method");
            	UiApplication.getUiApplication().pushScreen(new ManualBackup());
              }
          };
         
          flowFieldManager.add(Automatic);
          flowFieldManager.add(Manual);
          add(flowFieldManager);
        
        
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