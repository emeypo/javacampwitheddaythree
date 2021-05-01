package javacampwitheddaythree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor = new Instructor(1, "Engin", "Demiro�", "engindemorog@gmail.com", "Microsoft certified trainer");
		/*instructor.firstName="Engin";
		instructor.lastName="Demiro�";
		instructor.certificate="";*/
		
		Student student = new Student(2, "Eyl�l" , "Lastname" , "eylul@gmail.com", "Java + React");
		/*student.firstName="Eyl�l";
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
