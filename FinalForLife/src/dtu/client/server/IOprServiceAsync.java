package dtu.client.server;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import dtu.shared.OprDTO;

public interface IOprServiceAsync {

	void saveOperator(OprDTO opr, AsyncCallback<Void> callback);

	void updateOperator(OprDTO opr, AsyncCallback<Void> callback);

	void getOperators(AsyncCallback<List<OprDTO>> callback);

	void deleteOperator(int id, AsyncCallback<Void> callback);

	
	//husk alt er void og husk callback
}
