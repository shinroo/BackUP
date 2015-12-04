package mypackage;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;
import java.util.Vector;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.TextField;

public final class ManualBackup extends MainScreen
{
	Vector pins = new Vector();
	
    int Counter1;
    int Counter2;
    int Length;
    String Pin;
    String copy;
    
    public ManualBackup()
    {            
        setTitle("Manual Backup Screen");
        setStatus(new LabelField("This is where you manual backup your files"));
        
        LabelField heading = new LabelField("Enter the pin to be saved:"); 
    		add(heading);
    	final TextField enter = new TextField();
    		add(enter);
    	ButtonField backup = new ButtonField("Backup");
    		add(backup);
    	final LabelField PinsToBeAdded = new LabelField();
    		add(PinsToBeAdded);
    	
    		Counter1 = 0;
    
    		FieldChangeListener backup_listener = new FieldChangeListener(){

    			public void fieldChanged(Field arg0, int arg1) {
    					Pin = enter.getText();
    					enter.setText("");
    					pins.addElement(Pin);
    					Pin = "";
    					Counter1 = Counter1 +1;
    					Length = pins.size();
    					for (Counter2 = 1; Counter2 < Length; Counter2++) {
    						copy = pins.elementAt(Counter2).toString();
    						PinsToBeAdded.setText(copy, 0, copy.length());
    					}
    					Dialog.alert("pin added");
    			}
    	
    		};
    		backup.setChangeListener(backup_listener);
    
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
