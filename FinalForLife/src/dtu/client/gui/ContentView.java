package dtu.client.gui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ContentView extends Composite {
	
	FlowPanel contentPanel;
	
	
	public ContentView(){
		this.contentPanel = new FlowPanel();
	contentPanel.setStylePrimaryName("yep");
		initWidget(this.contentPanel);
	
		
		
	}
	
	
	public void openLoginView(){
		LoginView login = new LoginView();
		contentPanel.add(login);
	}

	public void openAdminView(){
		AdminView ad = new AdminView();
		contentPanel.add(ad);
	}
	
}


