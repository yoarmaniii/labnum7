//Import your Scanner
import java.util.InputMismatchException;
import java.util.Scanner;
public class labnum7 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String userCont = "yes";
		boolean cont = true;
		
		
		//Declare userInput
		int input=0;
		String choice;
		
		//Welcome Screen question
		System.out.println("Welcome!");
		
		//Get userinput		
		//Start switch here
		//insert a While loop 
		while(userCont.equals("yes"))	
		{	
			System.out.println("Which student would you like to learn more about?"+ "(Enter a number between 1-5)");
			
			//Input Exception statement
			
			
			
			try{
			input = userInput.nextInt();
				}
			catch(InputMismatchException e){
				System.out.println("Thats an invalid prompt, please enter a valid answer! Continue? Yes/No?");
				userInput.nextLine();
				userCont =userInput.nextLine();	

				}

			
			//input Exception statement
			
			switch (input){
		case 1 :
			choice =userInput.nextLine();
			System.out.println("This student is Armani! " + "What would you like to know where Armani is from? (enter Yes or No)");
				userCont = userInput.nextLine();
		
				//user Input is yes
			if(userCont.equalsIgnoreCase("yes")){
					System.out.println("Armani is from Detroit, MI! Would you like to know more? Enter - Yes/No?");
					userCont = userInput.nextLine();
					
					if(userCont.equalsIgnoreCase("yes")){
						System.out.println("Armani's favorite food is Salmon!");
						System.out.println("Continue with another student? Enter Yes/No");
						userCont = userInput.nextLine();
					}
					//user Input is no
			else if (userCont.equalsIgnoreCase("no")){
						System.out.println("Continue with another student?" + "Yes/No");
						userCont = userInput.nextLine();
						
						
					}
			
			}
				
					break;
		case 2 :
			choice =userInput.nextLine();
			System.out.println("This student is Jeseekia! " + "Would you like to know where Jeseekia is from? (enter Yes or No)");
				userCont = userInput.nextLine();
		
				//user Input is yes
			if(userCont.equalsIgnoreCase("yes")){
					System.out.println("Jessekia is from Detroit, MI! Would you like to know more? Enter - Yes/No?");
					userCont = userInput.nextLine();
					
					if(userCont.equalsIgnoreCase("yes")){
						System.out.println("Jeseekia favorite food is lasagna!");
						System.out.println("Continue with another student? Enter Yes/No");
						userCont = userInput.nextLine();
					}
					//user Input is no
			else if (userCont.equalsIgnoreCase("no")){
						System.out.println("Continue with another student?" + "Yes/No");
						userCont = userInput.nextLine();
						}//End of Else if statement
			
					
		}//End of if statement
			break;
			
		case 3 :
			choice =userInput.nextLine();
			System.out.println("This student is Escoe! " + "Would you like to know where Escoe is from? (enter Yes or No)");
				userCont = userInput.nextLine();
		
				//user Input is yes
			if(userCont.equalsIgnoreCase("yes")){
					System.out.println("Escoe is from Detroit, MI! Would you like to know more? Enter - Yes/No?");
					userCont = userInput.nextLine();
					
					if(userCont.equalsIgnoreCase("yes")){
						System.out.println("Escoe favorite food is Shrimp!");
						System.out.println("Continue with another student? Enter Yes/No");
						userCont = userInput.nextLine();
					}
					//user Input is no
			else if (userCont.equalsIgnoreCase("no")){
						System.out.println("Continue with another student?" + "Yes/No");
						userCont = userInput.nextLine();
						}//End of Else if statement
			
					
		}//End of if statement
			break;
		
		case 4 :
			choice =userInput.nextLine();
			System.out.println("This student is Clark! " + "Would you like to know where Clark is from? (enter Yes or No)");
				userCont = userInput.nextLine();
		
				//user Input is yes
			if(userCont.equalsIgnoreCase("yes")){
					System.out.println("Clark is from Detroit, MI! Would you like to know more? Enter - Yes/No?");
					userCont = userInput.nextLine();
					
					if(userCont.equalsIgnoreCase("yes")){
						System.out.println("Clark favorite food is pizza!");
						System.out.println("Continue with another student? Enter Yes/No");
						userCont = userInput.nextLine();
					}
					//user Input is no
			else if (userCont.equalsIgnoreCase("no")){
						System.out.println("Continue with another student?" + "Yes/No");
						userCont = userInput.nextLine();
						}//End of Else if statement
			
		}//End of if Statements	
			break;
		case 5 :
			choice =userInput.nextLine();
			System.out.println("This student is Tyler! " + "Would you like to know where Tyler is from? (enter Yes or No)");
				userCont = userInput.nextLine();
		
				//user Input is yes
			if(userCont.equalsIgnoreCase("yes")){
					System.out.println("Tyler is from Monroe, MI! Would you like to know more? Enter - Yes/No?");
					userCont = userInput.nextLine();
					
					if(userCont.equalsIgnoreCase("yes")){
						System.out.println("Tyler favorite food is pizza!");
						System.out.println("Continue with another student? Enter Yes/No");
						userCont = userInput.nextLine();
					}
					//user Input is no
			else if (userCont.equalsIgnoreCase("no")){
						System.out.println("Continue with another student?" + "Yes/No");
						userCont = userInput.nextLine();
						}//End of Else if statement
			
		}//End of if Statements	
			break;	
		}//End of Switch statements
				if (userCont.equalsIgnoreCase("no")){
				System.out.println("Continue with another student?" + "Yes/No");
				userCont = userInput.nextLine();}
			
		}//End of While Loop	
		System.out.println("goodbye");

		}//End of Main
		}//End of ClassBody
	
