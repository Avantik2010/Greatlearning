import java.util.Random;

public class CredentialService {
	public char [] generatedPassword() {
		
		String capitalLetters ="ABCDEFGHIJKLMNOP";
		String smallLetters ="abcdefghijklmnop";
		String numbers ="0123456789";
		String specialCharacters ="!@#$%";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters ;
	Random random = new Random();
	
	char[] password = new char[8];
	
	for(int i=0; i< 8; i++) {
		password[i]= values.charAt(random.nextInt(values.length()));
	}
	return password;

	}
 public String generateEmail(String firstName, String lastName, String department) {
	 return firstName+lastName+"@"+department+".bentley.com";
	 
    }
 public void showCredentials(Employee employee, String email ,char []generatedpassword) {
	 System.out.println("Dear"+ employee.getFirstName()+ "your generated ceredentials are as follows");
	 System.out.println("Email-->" + email);
	 System.out.print("password-->1"+"");
	 
	 System.out.print(generatedPassword());
	 
 }

}