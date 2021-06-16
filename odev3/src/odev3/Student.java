package odev3;

public class Student extends User {

	private String userId;
	private String firstName;
	private String lastName;
	private String course;
	private String completedCourse;
	
	public Student(int id, String email, String userId, String firstName, String lastName, String course,
			String completedCourse) {
		super(id, email);
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.completedCourse = completedCourse;
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

	public String getCompletedCourse() {
		return completedCourse;
	}

	public void setCompletedCourse(String completedCourse) {
		this.completedCourse = completedCourse;
	}
	

	
}
