package thing;
public class Pattern2 {
	Pattern2(boolean forOrWhile){
		if (forOrWhile==true){ //for loop
			int spaces=4;
			int stars=1;
			char space = ' ';
			char star = '*';
			for (int k=0; k<2; k++){ //all this does is make you print it twice
				for (int j=0; j<5; j++){ //do everything
					for (int i=0; i<spaces; i++){ //print the spaces
						System.out.print(space);
					}
					for (int i=0; i<stars; i++){ //then print the stars
						System.out.print(star); 
					}
					for (int i=0; i<spaces; i++){ //then print the spaces
						System.out.print(space);
					}
					System.out.println(); //newline
					//Then adjust the number that will be printed next iteration
					spaces--;
					stars+=2;
				}
				System.out.println(); //seperate the two star trees by one line
				spaces=4; //reset them
				stars=1;
			}
			System.out.println("\nPrinted using for loops");
		}
		if (forOrWhile==false){ //while loop
			int spaces=4;
			int stars=1;
			char space = ' ';
			char star = '*';
			int k=0;
			int j=0;
			int i=0;
			while (k<2){
				while (j<5){
					while (i<spaces){
						System.out.print(space);
						i++;
					}
					i=0;
					while (i<stars){
						System.out.print(star);
						i++;
					}
					i=0;
					while (i<spaces){
						System.out.print(space);
						i++;
					}
					i=0;
					j++;
					System.out.println();
					spaces--;
					stars+=2;
				}
				System.out.println();
				j=0;
				spaces=4;
				stars=1;
				k++;
			}
			System.out.println("\nPrinted using while loops");
		}
	}
}