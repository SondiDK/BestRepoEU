package dtu.client.gui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginView extends Composite {

	private static LoginViewUiBinder uiBinder = GWT.create(LoginViewUiBinder.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	@UiField TextBox usernameTxtBox;
	
	
	
	public LoginView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		
		usernameTxtBox.getElement().setPropertyString("placeholder",  "Brugernavn");
	}
	
	
	
	

}
