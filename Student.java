package javacampwitheddaythree;

public class Student extends User{
	//fields. constrcutors. methods.
	private String lastCourseEnrolled;

	public Student(int id, String firstName, String lastName, String emailAddress, String lastCourseEnrolled) {
		super(id, firstName, lastName, emailAddress);
		this.lastCourseEnrolled = lastCourseEnrolled;
	}

	public String getLastCourseEnrolled() {
		return this.lastCourseEnrolled;
	}

	public void setLastCourseEnrolled(String lastCourseEnrolled) {
		this.lastCourseEnrolled = lastCourseEnrolled;
	}
}
