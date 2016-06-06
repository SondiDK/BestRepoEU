package dtu.client.gui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import dtu.client.gui.AdminView.IAdminViewCallback;
import dtu.client.gui.LoginView.ILoginViewCallback;

//Hver view skal have sit eget interface der definere de enkelte funktioner
//de skal have adgang til, fx. skal loginview have adgang til hvad end du
//logger ind som. Basicly er det det samme som vi gjorde i CDIO3, bare
//med en begrænsning i hvilke metoder de forskellige view har adgang til



public class ContentView extends Composite implements ILoginViewCallback, IAdminViewCallback {
	
	FlowPanel contentPanel;
	
	
	public ContentView(){
		this.contentPanel = new FlowPanel();
		contentPanel.setStylePrimaryName("yep");
		initWidget(this.contentPanel);
	
		
		
	}
	
	
	public void openLoginView(){
		LoginView login = new LoginView(this);
		contentPanel.add(login);
	}

	@Override
	public void openAdminView(){
		this.contentPanel.clear();
		AdminView ad = new AdminView(this);
		contentPanel.add(ad);
	}
	
}




