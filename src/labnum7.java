//Import your Scanner
import java.util.Scanner;
public class labnum7 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String studentName;
		
		//Declare userInput
		int input;
		String choice;
		
		//Welcome Screen question
		System.out.println("Welcome! Which Student would you like to learn more about? (Enter a number between 1-5)");
		
		//Get userinput
		input = userInput.nextInt();	
		
		//Start switch here
		switch (input){
		case 1 :
			choice =userInput.nextLine();
			System.out.println("This student is Armani! " + "What would you like to know about Armani? (enter Hometown or Favorite food)");
				choice = userInput.nextLine();
				
				//userinput of choices for hometown or favorite food
			if(choice.equalsIgnoreCase("hometown")){
					System.out.println("Armani is from Detroit, MI! Would you like to know more or nah? Enter - Yes/No?");
					choice = userInput.nextLine();
					
					if (choice.equalsIgnoreCase("yes")){
						System.out.println( "Enter Hometown or Favorite food");
						choice = userInput.nextLine();
					break;
						}//end of While statement
					} //end of if statement
			else if(choice.equalsIgnoreCase("no")){
				System.out.println("Do you want to continue with another student?" + "Enter Yes/No");
				choice = userInput.nextLine();
				
		}
				if(choice.equalsIgnoreCase("no")) {
					System.out.println("Until next time");
					
				}
					while (choice.equalsIgnoreCase("Favorite Food")){
						System.out.println(" Armani's favorite food is Salmon! YUMMMYYY!!!" + "Would you like to know more about Armani?" + "Enter Yes/No");
						choice = userInput.nextLine();
						while (choice.equalsIgnoreCase("yes")){
							System.out.println( "Enter Hometown or Favorite food");
							choice = userInput.nextLine();
						break;
							}
						}//end of "Else If" statement
						
						while (choice.equalsIgnoreCase("yes")){
							System.out.println( "Enter Hometown or Favorite food");
							choice = userInput.nextLine();
							break;
							}//end of "If" statement
						

						
						 {
							if(choice.equalsIgnoreCase("no"))
							System.out.println("Do you want to continue with another student?");
							choice = userInput.nextLine();
							break;
						}//end of last "else" statement
							
						}//end of switch method
		
	
		}//Main method ends
}

