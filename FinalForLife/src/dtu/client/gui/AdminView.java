package dtu.client.gui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

import dtu.client.gui.LoginView.ILoginViewCallback;

public class AdminView extends Composite{

	private static AdminViewUiBinder uiBinder = GWT.create(AdminViewUiBinder.class);
	
	public interface IAdminViewCallback {
//		public void openAdminView();
	}
	
	interface AdminViewUiBinder extends UiBinder<Widget, AdminView> {
	}

	public AdminView(final IAdminViewCallback callback) {
		initWidget(uiBinder.createAndBindUi(this));
	}


	

	

}
