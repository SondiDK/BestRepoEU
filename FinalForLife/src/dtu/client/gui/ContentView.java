package dtu.client.gui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

//Hver view skal have sit eget interface der definere de enkelte funktioner
//de skal have adgang til, fx. skal loginview have adgang til hvad end du
//logger ind som. Basicly er det det samme som vi gjorde i CDIO3, bare
//med en begrænsning i hvilke metoder de forskellige view har adgang til



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




