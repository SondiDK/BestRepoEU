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
//public class EditView extends Composite {
//	private VerticalPanel vPanel;
//	private HorizontalPanel hPanel;
//	private ContentView cont;
//	private Label Lbl1;
//	private TextBox txt1;
//	private FlexTable addTable;
//	private FlexTable editTable;
//	private int input;
//	private TextBox navnBox;
//	private TextBox iniBox;
//	private TextBox cprBox;
//	private TextBox passBox;
//	private Button redigerNuBtn;
//	
//	public EditView(final OprServiceClientImpl clientImpl, final ContentView cont){
//		vPanel = new VerticalPanel();
//		hPanel = new HorizontalPanel();
//		initWidget(this.vPanel);
//		this.cont = cont;
//			
//		vPanel.setBorderWidth(1);
//		
//		Lbl1 = new Label("Indtast id på personen du vil rette:");
//		txt1 = new TextBox();
//
//		Anchor goBackLabel = new Anchor("Gå tilbage");
//		goBackLabel.addClickHandler(new goBack());
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
//		navnBox = new TextBox();
//		iniBox = new TextBox();
//		cprBox = new TextBox();
//		passBox = new TextBox();
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
//		Button gemRedigeringBtn = new Button("Gem ændringer");
//		gemRedigeringBtn.addClickHandler(new ClickHandler() {
//		
//
//			@Override
//			public void onClick(ClickEvent event) {
//				//Næste linje gør at man kan ændre hvilken operatør man vil ændre, uden at skulle reloade. Uden denne vil det "input" der står i tekstboksen når der trykkes "Rediger" være låst 
//				input = Integer.parseInt(txt1.getText());
//				OprDTO opr = new OprDTO(input, navnBox.getText(), iniBox.getText(), cprBox.getText(), passBox.getText());
//				
//				clientImpl.service.updateOperator(opr, new AsyncCallback<Void>()
//				{
//					@Override
//					public void onFailure(Throwable caught) {
//						Window.alert("Der skete en fejl."+caught.getMessage());
//					}
//
//					@Override
//					public void onSuccess(Void result) {
//						Window.alert("Person rettet");
//						cont.retPerson();
//						
//					}
//				});
//				
//			}
//			
//		});
//		
//		
//		redigerNuBtn = new Button("Rediger");
//		redigerNuBtn.addClickHandler(new redigerNu());
//		
//		editTable = new FlexTable();
//		editTable.setBorderWidth(1);
//		
//		editTable.setText(0, 0, "Navn");
//		editTable.setText(0, 1, "Initialer");
//		editTable.setText(0, 2, "CPR");
//		editTable.setText(0, 3, "Password");
//		editTable.setWidget(1, 0, navnBox);
//		editTable.setWidget(1, 1, iniBox);
//		editTable.setWidget(1, 2, cprBox);
//		editTable.setWidget(1, 3, passBox);
//		editTable.setWidget(1, 4, gemRedigeringBtn);
//		editTable.setVisible(false);
//		
//		vPanel.add(addTable);
//		vPanel.add(Lbl1);
//		hPanel.add(txt1);
//		hPanel.add(redigerNuBtn);	
//		vPanel.add(hPanel);
//		vPanel.add(editTable);
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
//	private class redigerNu implements ClickHandler {
//		@Override
//		public void onClick(ClickEvent event) {
//			input = Integer.parseInt(txt1.getText());
//			editTable.setVisible(true);
//			Lbl1.setText("Du har valgt at ændre brugeren med følgende ID: "+input);
//				
//		}
//	}
//}
