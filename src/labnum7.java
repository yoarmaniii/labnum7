//Import your Scanner
import java.util.Scanner;
public class labnum7 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String userCont = "yes";
		boolean cont = true;
		
		
		//Declare userInput
		int input;
		String choice;
		
		//Welcome Screen question
		
		//Get userinput		
		//Start switch here
		//insert a While loop 
		while(userCont.equals("yes"))	
		{	
			System.out.println("Welcome! Which Student would you like to learn more about?"+ "(Enter a number between 1-5)");

			input = userInput.nextInt();
			switch (input){
		case 1 :
			choice =userInput.nextLine();
			System.out.println("This student is Armani! " + "What would you like to know where Armani is from? (enter Yes or No)");
				choice = userInput.nextLine();
		
				//user Input is yes
			if(choice.equalsIgnoreCase("yes")){
					System.out.println("Armani is from Detroit, MI! Would you like to know more? Enter - Yes/No?");
					choice = userInput.nextLine();
					
					if(choice.equalsIgnoreCase("yes")){
						System.out.println("Armani's favorite food is Salmon!");
						System.out.println("Continue with another student? Enter Yes/No");
						userCont = userInput.nextLine();
					}
					//user Input is no
			else if (choice.equalsIgnoreCase("no")){
						System.out.println("Continue with another student?" + "Yes/No");
						userCont = userInput.nextLine();
						
						
					}
			
			}
				
					break;
			}//s
			

		}//w
		System.out.println("goodbye");
		}

	
	}
	
