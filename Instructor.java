package javacampwitheddaythree;

public class Instructor extends User{
	//fields. constrcutors. methods.
	private String certificate;
	
	public Instructor(int id, String firstName, String lastName, String emailAddress, String certificate) {
		super(id, firstName, lastName, emailAddress);
		this.certificate = certificate;
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
}
