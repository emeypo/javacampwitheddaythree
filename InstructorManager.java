package javacampwitheddaythree;

public class InstructorManager extends UserManager{
	public void InstructorMethod(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" is the instructor. He is a "+instructor.getCertificate()+".");
	}
}
