import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args){
		
        Employee employee = new Employee("Avanti","Khandalkar");
        CredentialService cs =new CredentialService();
      
        String generateEmail;
        char[] generatedPassword;
        
        System.out.println("Please enter the department from the following ");
        System.out.println("1 Technical");
        System.out.println("2 Admin");
        System.out.println("3 Human Resource");
        System.out.println("4 Legal");
        
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        if (option == 1) {
        	generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "tech");
        	generatedPassword = cs.generatedPassword();
        	cs.showCredentials(employee,generateEmail,generatedPassword);
        }
        else if (option == 2) {
        	generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "adm");
        	generatedPassword = cs.generatedPassword();
        	cs.showCredentials(employee,generateEmail,generatedPassword);
        }
        else if (option == 3) {
        	generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "hr");
        	generatedPassword = cs.generatedPassword();
        	cs.showCredentials(employee,generateEmail,generatedPassword);
        } 
        else if (option == 4) {
        	generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "lg");
        	generatedPassword = cs.generatedPassword();
        	cs.showCredentials(employee,generateEmail,generatedPassword); 
	}
        else
        	System.out.println("Enter a valid option");
        sc.close();
}
}
