package javacampwitheddaythree;

public class UserManager {
	public void SignUp(User user) { //polymorphosim
		System.out.println(user.getFirstName() + user.getLastName() +" successfully signed up.");	
	}
	public void SignIn(User user) {
		System.out.println("Successfully signed in... Welcome back "+ user.getFirstName() +"!");	
	}
}
