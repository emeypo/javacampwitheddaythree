package javacampwitheddaythree;

public class StudentManager extends UserManager{
	
	public void listCoursesEnrolled(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" is currently studying "+student.getLastCourseEnrolled()+".");
	}
}
