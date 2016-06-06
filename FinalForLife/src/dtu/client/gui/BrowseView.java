//package dtu.client.gui;
//
//import java.util.List;
//
//import com.google.gwt.event.dom.client.ClickEvent;
//import com.google.gwt.event.dom.client.ClickHandler;
//import com.google.gwt.user.client.Window;
//import com.google.gwt.user.client.rpc.AsyncCallback;
//import com.google.gwt.user.client.ui.Anchor;
//import com.google.gwt.user.client.ui.Composite;
//import com.google.gwt.user.client.ui.FlexTable;
//import com.google.gwt.user.client.ui.VerticalPanel;
//import dtu.client.service.OprServiceClientImpl;
//import dtu.shared.OprDTO;
//
//public class BrowseView extends Composite {
//	VerticalPanel vPanel;
//	private ContentView cont;
//	private final FlexTable addTable;
//	
//
//	public BrowseView(OprServiceClientImpl clientImpl, ContentView cont){
//		vPanel = new VerticalPanel();
//		initWidget(this.vPanel);
//		this.cont = cont;
//			
//		vPanel.setBorderWidth(1);
//
//		Anchor goBackLabel = new Anchor("Gå tilbage");
//		goBackLabel.addClickHandler(new goBack());
//		
//		
//		
//			
//		addTable = new FlexTable();
//		
//		addTable.addStyleName("BrowseTable");
//
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
//		clientImpl.service.getOperators(new AsyncCallback<List<OprDTO>>() {
//
//			@Override
//			public void onFailure(Throwable caught) {
//				Window.alert("Der skete en fejl! : "+caught.getMessage());
//				
//			}
//
//			@Override
//			public void onSuccess(List<OprDTO> result) {
//				for (int i=0; i<result.size(); i++) {
//					addTable.setText(i+1, 0, ""+result.get(i).getOprId());
//					addTable.setText(i+1, 1, ""+result.get(i).getOprNavn());
//					addTable.setText(i+1, 2, ""+result.get(i).getIni());
//					addTable.setText(i+1, 3, ""+result.get(i).getCpr());
//					addTable.setText(i+1, 4, ""+result.get(i).getPassword());
//				}
//			}
//		});
//		
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
//	
//	private class goBack implements ClickHandler {
//		@Override
//		public void onClick(ClickEvent event) {
//			cont.openMenuView();
//		}
//	}
//}
//
