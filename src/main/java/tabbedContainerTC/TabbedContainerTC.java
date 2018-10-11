package tabbedContainerTC;

import totalcross.sys.Settings;
import totalcross.ui.MainWindow;

public class TabbedContainerTC extends MainWindow{
	
	public TabbedContainerTC(){

		setUIStyle(Settings.Material);
	
	}
	
	public void initUI(){
	new TabbedContainerTCSample().swapToTopmostWindow();
	}
}
