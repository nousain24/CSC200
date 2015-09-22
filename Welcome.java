import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		String correctUsername = "CSC200";
		String correctPassword = "Password";
		String username="",password="";
		System.out.println("Enter Username and Password");
		// Read Input
		Scanner keyboard = new Scanner(System.in);
		username = keyboard.next();
		password = keyboard.next();
		//Prompt for username and password

		if(username.equals(correctUsername)&& password.equals(correctPassword)){
		System.out.print("Welcome " + username);
		//True
		}else{
		System.out.print("Wrong Username or Password!");
		//False
		}
																						}
																						}
																										
																																																							
																																
																																	

																																
