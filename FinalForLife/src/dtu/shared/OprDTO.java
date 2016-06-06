package dtu.shared;

import java.io.Serializable;

public class OprDTO implements Serializable {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;

	/** Operat�r id i omr�det 1�99999999. V�lges af brugerne */
	int oprId;

	/** Operat�r navn min. 2 max. 20 karakterer */
	String oprNavn;
	
	/** Operat�r initialer min. 2 max. 3 karakterer */
	String ini;

	/** Operat�r cpr�nr 10 karakterer */
	String cpr;

	/** Operat�r password min. 7 max. 8 karakterer */
	String password;
	
	int status;

	public OprDTO(){
		
	}
	
	public OprDTO(int oprId, String oprNavn, String ini, String cpr, String password, int status) {

		super();
		this.oprId = oprId;
		this.oprNavn = oprNavn;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
		this.status = status;
	}

	public int getOprId() {
		return oprId;
	}

	public void setOprId(int oprId) {
		this.oprId = oprId;
	}

	public String getOprNavn() {
		return oprNavn;
	}

	public void setOprNavn(String oprNavn) {
		this.oprNavn = oprNavn;
	}

	public String getIni() {
		return ini;
	}

	public void setIni(String ini) {
		this.ini = ini;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getOprStatus() {
		return status;
	}

	public void setOprStatus(int status) {
		this.status = status;
	}

}