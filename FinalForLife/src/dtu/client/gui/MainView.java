package dtu.client.gui;

import com.google.gwt.user.client.ui.RootPanel;

public class MainView {
	
	private ContentView contentView = new ContentView();
	
	
	
	public MainView(){
		
		
//	contentView= new ContentView();

	

	//RootPanel.get().add(new AdminView());	
	RootPanel.get().add(new LoginView(contentView));
	
	}
	
	
//	public void run(){
//		contentView.openLoginView();
//	}
//	
	
	}
