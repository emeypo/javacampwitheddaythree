package javacampwitheddaythree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor = new Instructor(1, "Engin", "Demiroð", "engindemorog@gmail.com", "Microsoft certified trainer");
		/*instructor.firstName="Engin";
		instructor.lastName="Demiroð";
		instructor.certificate="";*/
		
		Student student = new Student(2, "Eylül" , "Lastname" , "eylul@gmail.com", "Java + React");
		/*student.firstName="Eylül";
		student.lastName="Test";
		student.lastCourseEnrolled="Java + React";*/
		
		//polymorphosim
		UserManager userManager = new UserManager();
		userManager.SignIn(instructor);
		userManager.SignIn(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.listCoursesEnrolled(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.InstructorMethod(instructor);
	}

}
