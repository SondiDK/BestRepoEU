package dtu.client.gui;

import com.google.gwt.user.client.ui.RootPanel;

public class MainView {
	
	private ContentView contentView;
	
	
	
	public MainView(){
		
		
//	contentView= new ContentView();

	

	//RootPanel.get().add(contentView);	
	RootPanel.get().add(new LoginView());
	
	}
	
	
//	public void run(){
//		contentView.openLoginView();
//	}
//	
	
	}
