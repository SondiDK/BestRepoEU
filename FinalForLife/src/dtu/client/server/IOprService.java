package dtu.client.server;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import dtu.shared.OprDTO;


@RemoteServiceRelativePath("oprservice")
public interface IOprService extends RemoteService {

	
	public void saveOperator(OprDTO opr) throws Exception;
	public void updateOperator(OprDTO opr) throws Exception;
	public List<OprDTO> getOperators() throws Exception;
	public void deleteOperator(int id) throws Exception; 


	
}
