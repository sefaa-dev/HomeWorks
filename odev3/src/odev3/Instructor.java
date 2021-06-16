package odev3;

public class Instructor extends User {
	
	private String userId;
	private String firstName;
	private String lastName;
	private String course;
	private String certificate;
	

	public Instructor(int id, String email, String userId, String firstName, String lastName, String course,
			String certificate) {
		super(id, email);
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.certificate = certificate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}


	public String getCertificate() {
		return certificate;
	}


	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
}