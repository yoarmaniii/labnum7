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
		//Start switch somewhere
		switch (input){
		case 1 :
			choice =userInput.nextLine();
			System.out.println("This student is Armani " + "Would you like to know about Armani? (enter Hometown or Favorite food");
				if(choice.equals("hometown")){
					System.out.println("Armani is from Detroit, MI! Would you like to know more or nah? Yes/No?");
					}
						if(choice.equalsIgnoreCase("yes")){
							System.out.println( "Enter Hometown or Favorite food");
						}
						else {
							System.out.println("Do you want to continue with another?");
							break;
						}
		}
	}

}
