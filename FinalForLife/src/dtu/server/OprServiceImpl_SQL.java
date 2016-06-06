package dtu.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import dtu.client.service.IOprService;
import dtu.shared.OprDTO;

public class OprServiceImpl_SQL extends RemoteServiceServlet implements IOprService {
	
//	private static final String URL = "jdbc:mysql://localhost/CDIO3";
//	private static final String USERNAME = "root";
//	private static final String PASSWORD = "";
	private static final String URL = "ec2-52-30-89-247.eu-west-1.compute.amazonaws.com";
	private static final String USERNAME = "grp28";
	private static final String PASSWORD = "CBk4@64-";
	
	
	private static Connection connection = null;
	
	
	
	
	public OprServiceImpl_SQL() throws Exception {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);			
		} catch (SQLException e){
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
	private static void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void saveOperator(OprDTO opr) throws Exception {
		PreparedStatement gemOperatoerStmt = 
			connection.prepareStatement( "INSERT INTO operatoer " + 
					"(navn, ini, cpr, pword)" + 
					"VALUES ( ?, ?, ?, ? )" );
		try {
			gemOperatoerStmt.setString(1, opr.getOprNavn());
			gemOperatoerStmt.setString(2, opr.getIni());
			gemOperatoerStmt.setString(3, opr.getCpr());
			gemOperatoerStmt.setString(4, opr.getPassword());
			gemOperatoerStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public void updateOperator(OprDTO opr) throws Exception {
		PreparedStatement opdaterOperatoerStmt =
				connection.prepareStatement("UPDATE operatoer SET navn = ?, ini = ?, cpr = ?, pword = ? WHERE id = ?");
		try {
			opdaterOperatoerStmt.setString(1, opr.getOprNavn());
			opdaterOperatoerStmt.setString(2, opr.getIni());
			opdaterOperatoerStmt.setString(3, opr.getCpr());
			opdaterOperatoerStmt.setString(4, opr.getPassword());
			opdaterOperatoerStmt.setInt(5, opr.getOprId());
			opdaterOperatoerStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<OprDTO> getOperators() throws Exception {
		List<OprDTO> liste = new ArrayList<OprDTO>();
		ResultSet resultSet = null;
		
		PreparedStatement hentOperatoerStmt =
				connection.prepareStatement("SELECT * FROM operatoer"); 
		
		try {
			resultSet = hentOperatoerStmt.executeQuery();
				while (resultSet.next()) {
					liste.add(new OprDTO (
						resultSet.getInt("id"),
						resultSet.getString("navn"),
						resultSet.getString("ini"),
						resultSet.getString("cpr"),
						resultSet.getString("pword"),
						resultSet.getInt("status")
						));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resultSet.close();
		
		return liste;
	}
	
	@Override
	public void deleteOperator(int id) throws Exception {
		PreparedStatement sletOperatoerStmt =
				connection.prepareStatement("DELETE FROM operatoer WHERE id = ?");
		try {
			sletOperatoerStmt.setInt(1, id);
			sletOperatoerStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
