package dtu.client.gui;

import com.google.gwt.user.client.ui.RootPanel;

public class MainView {
	
	private ContentView contentView = new ContentView();
	private MenuView menu = new MenuView();
	
	
	public MainView(){
		
		


	

	//RootPanel.get().add(new AdminView());	
	//RootPanel.get().add(new LoginView(contentView));
	RootPanel.get().add(contentView);
	RootPanel.get().add(menu);
		
	}
	
	
	public void run(){
		contentView.openLoginView();
	}
	
	
	}
