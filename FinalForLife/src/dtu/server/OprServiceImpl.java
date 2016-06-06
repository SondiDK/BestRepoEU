package dtu.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import dtu.client.service.IOprService;
import dtu.shared.OprDTO;

public class OprServiceImpl extends RemoteServiceServlet implements IOprService {
	
	private List<OprDTO> oprList;
	int oprID = 0;
	
	
	public OprServiceImpl() throws Exception {
		oprList = new ArrayList<OprDTO>();
		saveOperator(new OprDTO(0, "Magnus Enevoldsen", "MEE", "200595", "123", 1));
		saveOperator(new OprDTO(0, "Magnus", "M", "2005", "456", 1));
		saveOperator(new OprDTO(0, "Enevoldsen", "E", "20", "789", 1));
		
	}
	
	
	@Override
	public void saveOperator(OprDTO opr) throws Exception {
		opr.setOprId(oprID);
		oprID++;
		oprList.add(opr);
		System.out.println("Oprettet!");
		
		
		
	}
	
	@Override
	public void updateOperator(OprDTO opr) throws Exception {
//		Virker ikke som det skal :(
//		int id = opr.getOprId();
//		deleteOperator(id);
//		oprList.add(opr);
		
		int opdaterID = opr.getOprId();
		for (int i=0; i<oprList.size(); i++) {
			if (oprList.get(i).getOprId() == opdaterID)
				oprList.set(i, opr);
		}
		
			
		
	}
	
	@Override
	public List<OprDTO> getOperators() throws Exception {
		return oprList;
	}
	
	@Override
	public void deleteOperator(int id) throws Exception {
		oprList.remove(id);
		
	}
	
	
}
