package dtu.client.controller;

import com.google.gwt.user.client.ui.RootPanel;

import dtu.client.gui.ContentView;

public class MainView {
	
	private ContentView contentView;
	
	
	
	public MainView(){
		
		
	contentView= new ContentView();
	RootPanel.get().add(contentView);	
	
	}
	
	
	public void run(){
		contentView.openLoginView();
	}
	
	
	}
