//package dtu.client.gui;
//
//import com.google.gwt.event.dom.client.ClickEvent;
//import com.google.gwt.event.dom.client.ClickHandler;
//import com.google.gwt.user.client.Window;
//import com.google.gwt.user.client.rpc.AsyncCallback;
//import com.google.gwt.user.client.ui.Anchor;
//import com.google.gwt.user.client.ui.Button;
//import com.google.gwt.user.client.ui.Composite;
//import com.google.gwt.user.client.ui.FlexTable;
//import com.google.gwt.user.client.ui.Label;
//import com.google.gwt.user.client.ui.TextBox;
//import com.google.gwt.user.client.ui.VerticalPanel;
//
//import dtu.client.service.OprServiceClientImpl;
//import dtu.shared.OprDTO;
//
//public class AddView extends Composite {
//
//	VerticalPanel vPanel;
//	private TextBox brugernavnTxtbox;
//	private TextBox cprTxtbox;
//	private TextBox iniTxtbox;
//	private TextBox passTxtbox;
//	private ContentView cont;
//	
//	public AddView(final OprServiceClientImpl clientImpl, ContentView cont) {
//		vPanel = new VerticalPanel();
//		initWidget(this.vPanel);
//		this.cont = cont;
//			
//		vPanel.setBorderWidth(1);
//			
//		Label brugernavnLabel = new Label("Brugernavn:");
//		Label alderLabel = new Label("CPR:");
//		Label iniLabel = new Label("Initialer:");
//		Label passLabel = new Label("Password:");
//		this.brugernavnTxtbox = new TextBox();
//		this.cprTxtbox = new TextBox();
//		this.iniTxtbox = new TextBox();
//		this.passTxtbox = new TextBox();
//		
//			
//		Button tilfojKnap = new Button("Tilføj person");
//		
//		
//		tilfojKnap.addClickHandler(new ClickHandler(){
//			@Override
//			public void onClick(ClickEvent event) {
//				
//				OprDTO opr = new OprDTO(0, brugernavnTxtbox.getText(), iniTxtbox.getText(), cprTxtbox.getText(), passTxtbox.getText());
//				
//				clientImpl.service.saveOperator(opr, new AsyncCallback<Void>() {
//
//					@Override
//					public void onFailure(Throwable caught) {
//						Window.alert("Der skete en fejl ved oprettelse af person. Følgende fejl fundet:\n "+caught.getMessage());
//						
//					}
//
//					@Override
//					public void onSuccess(Void result) {
//						Window.alert("Personen blev oprettet i systemet");
//						
//					}
//				});
//			}
//		});
//		
//
//	
//		
//		Anchor goBackLabel = new Anchor("Gå tilbage");
//		goBackLabel.addClickHandler(new goBack());
//			
//		FlexTable addTable = new FlexTable();
//		
//		addTable.setWidget(0, 0, brugernavnLabel);
//		addTable.setWidget(0, 1, brugernavnTxtbox);
//		
//		addTable.setWidget(1, 0, alderLabel);
//		addTable.setWidget(1, 1, cprTxtbox);
//		
//		addTable.setWidget(2, 0, iniLabel);
//		addTable.setWidget(2, 1, iniTxtbox);
//		
//		addTable.setWidget(3, 0, passLabel);
//		addTable.setWidget(3, 1, passTxtbox);
//		
//		addTable.setWidget(4, 0, tilfojKnap);
//		addTable.setWidget(5, 1, goBackLabel);
//		vPanel.add(addTable);
//			
//		
//		
//			
//		
//		
//		
//	}
//	
//	private class goBack implements ClickHandler {
//		@Override
//		public void onClick(ClickEvent event) {
//			cont.openMenuView();
//		}
//	}
//	
//	
//}
