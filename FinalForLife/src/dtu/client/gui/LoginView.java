package dtu.client.gui;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckLayoutPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import dtu.shared.OprDTO;

public class LoginView extends Composite {

	private static LoginViewUiBinder uiBinder = GWT.create(LoginViewUiBinder.class);
	
	public interface ILoginViewCallback {
		public void openAdminView();
	}
	
	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	@UiField TextBox usernameTxtBox;
	@UiField PasswordTextBox passwordTxtBox;
	@UiField Button loginBtn;

	
	
	
	public LoginView(ILoginViewCallback callback) {


		initWidget(uiBinder.createAndBindUi(this));

		usernameTxtBox.getElement().setPropertyString("placeholder",  "Brugernavn");
		passwordTxtBox.getElement().setPropertyString("placeholder", "Kodeord");
		
		String a = usernameTxtBox.getText();
		String b = usernameTxtBox.getText();
		
//		loginBtn.addClickHandler(new ClickHandler() {
//				@Override
//				public void onClick(ClickEvent event) {
//						
//						callback.openAdminView();
//						}
//					}
//					);

					
		
		
		
	}
	
	
	
	

}
