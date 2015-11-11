package thing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInputScanner = new Scanner(System.in);
		String userInput="";
		int userSelection=0;
		boolean forOrWhile=false; //false=while true=for
		boolean validUserInput=false;
		boolean repeat=true;
		
		while (repeat==true){ //Controls whether the program executes again
		validUserInput=false; //reset this
		while (validUserInput==false){
			System.out.println("Enter the pattern you would like to produce:");
			userInput=userInputScanner.nextLine();
			if (userInput.equals("Pattern 1") || userInput.equals("pattern 1") || userInput.equals("1") || userInput.equals("Pattern 2") || userInput.equals("pattern 2") || userInput.equals("2") || userInput.equals("Pattern 3") || userInput.equals("pattern 3") || userInput.equals("3")){
				validUserInput=true;
			} else {
				System.out.println("Format is'Pattern #', 'pattern #', or '#' without quotes.");
			}
		}
		//Convert the 9 valid inputs to the 3 things they correspond to
		userSelection = (userInput.length()>1)   ?   Integer.parseInt(userInput.substring(userInput.length()-1))   :   Integer.parseInt(userInput);
		//Choose whether to execute for or while
		while (validUserInput==true){//this is somewhat counterintuitive but whatever
			System.out.println("Enter 'for' or 'while' to choose whether the code executes with a for loop or a while loop");
			userInput=userInputScanner.nextLine();
			if (userInput.equals("for")){
				forOrWhile=true;
				validUserInput=false;
			} else if (userInput.equals("while")){
				validUserInput=false;
			} else {
				System.out.println("Invalid input");
			}
		} 

		
		switch (userSelection){
		case 1:
			new Pattern1(forOrWhile);
			break;
		case 2:
			new Pattern2(forOrWhile);
			break;
		case 3:
			new Pattern3(forOrWhile);
			break;
		}

		System.out.println("Do you want to run again? Y/N");
		while (validUserInput==false){
			userInput=userInputScanner.nextLine();
			if (userInput.equals("Y") || userInput.equals("y") || userInput.equals("N") || userInput.equals("n")){
				validUserInput=true;
			} else {
				System.out.println("Enter Y, y, N or n");
			}
		}
		//repeat is already true, so we only need to check if it must be made false
		repeat = (userInput.equals("N") || userInput.equals("n"))? false : true;
		
		}
		userInputScanner.close(); //CLOSE YOUR SCANNERS
	}

}
