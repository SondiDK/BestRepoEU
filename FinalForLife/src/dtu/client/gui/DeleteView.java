//package dtu.client.gui;
//
//import java.util.List;
//
//import com.google.gwt.event.dom.client.ClickEvent;
//import com.google.gwt.event.dom.client.ClickHandler;
//import com.google.gwt.user.client.Window;
//import com.google.gwt.user.client.rpc.AsyncCallback;
//import com.google.gwt.user.client.ui.Anchor;
//import com.google.gwt.user.client.ui.Button;
//import com.google.gwt.user.client.ui.Composite;
//import com.google.gwt.user.client.ui.FlexTable;
//import com.google.gwt.user.client.ui.HorizontalPanel;
//import com.google.gwt.user.client.ui.Label;
//import com.google.gwt.user.client.ui.TextBox;
//import com.google.gwt.user.client.ui.VerticalPanel;
//import dtu.client.service.OprServiceClientImpl;
//import dtu.shared.OprDTO;
//
//public class DeleteView extends Composite {
//	private VerticalPanel vPanel;
//	private HorizontalPanel hPanel;
//	private Label Lbl1;
//	private TextBox txt1;
//	private int input;
//	
//	private ContentView cont;
//	private FlexTable addTable;
//	
//	
//	public DeleteView(final OprServiceClientImpl clientImpl, final ContentView cont){
//		vPanel = new VerticalPanel();
//		hPanel = new HorizontalPanel();
//
//		initWidget(this.vPanel);
//		Lbl1 = new Label("Skriv id du vil slette:");
//		this.cont = cont;
//				
//		vPanel.setBorderWidth(1);
//
//		Anchor goBackLabel = new Anchor("Gå tilbage");
//		goBackLabel.addClickHandler(new goBack());
//			
//		Button deleteOpr = new Button("Slet Opr");
//		deleteOpr.addClickHandler(new ClickHandler() {
//
//			@Override
//			public void onClick(ClickEvent event) {
//				input = Integer.parseInt(txt1.getText());
//				clientImpl.service.deleteOperator(input, new AsyncCallback<Void>() 
//				{
//					@Override
//					public void onFailure(Throwable caught) {
//						Window.alert("Der skete en fejl."+caught.getMessage());
//					}
//
//					@Override
//					public void onSuccess(Void result) {
//						Window.alert("Person slettet");
//						cont.sletPerson();
//						
//					}
//				});
//				
//			}
//			
//		});
//		
//		txt1 = new TextBox();
//		
//		
//		addTable = new FlexTable();
//		addTable.setBorderWidth(1);
//		
//		addTable.setText(0, 0, "ID");
//		addTable.setText(0, 1, "Navn");
//		addTable.setText(0, 2, "Initialer");
//		addTable.setText(0, 3, "CPR");
//		addTable.setText(0, 4, "Password");
//		addTable.setWidget(0, 5, goBackLabel);
//		
//		
//		
//		clientImpl.service.getOperators(new AsyncCallback<List<OprDTO>>() {
//		
//			@Override
//			public void onFailure(Throwable caught) {
//				Window.alert("Der er sket en fejl: " + caught.getMessage());
//			}
//			
//			@Override
//			public void onSuccess(List<OprDTO> result) {
//				
//				for (int i = 0; i < result.size(); i++) {
//					addTable.setText(i+1, 0, ""+result.get(i).getOprId());
//					addTable.setText(i+1, 1, ""+result.get(i).getOprNavn());
//					addTable.setText(i+1, 2, ""+result.get(i).getIni());
//					addTable.setText(i+1, 3, ""+result.get(i).getCpr());
//					addTable.setText(i+1, 4, ""+result.get(i).getPassword());
//				}
//			}
//		});
//		
//	
//		vPanel.add(addTable);
//		vPanel.add(Lbl1);
//		hPanel.add(txt1);
//		hPanel.add(deleteOpr);	
//		vPanel.add(hPanel);
//		
//		
//		
//	}
//
//
//	
//	private class goBack implements ClickHandler {
//		@Override
//		public void onClick(ClickEvent event) {
//			cont.openMenuView();
//		}
//	}
//		
//}
