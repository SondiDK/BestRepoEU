package dtu.client.gui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ContentView extends Composite {
	
	VerticalPanel contentPanel;
	
	
	public ContentView(){
		this.contentPanel = new VerticalPanel();
		initWidget(this.contentPanel);
	}
	
	
	public void openLoginView(){
		LoginView login = new LoginView();
		contentPanel.add(login);
	}

}


