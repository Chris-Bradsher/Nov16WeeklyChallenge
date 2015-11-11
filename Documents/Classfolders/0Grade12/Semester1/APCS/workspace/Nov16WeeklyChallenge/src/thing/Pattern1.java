package thing;
public class Pattern1 {
	Pattern1(boolean forOrWhile){
		if (forOrWhile==true){ //for loop
			for (int i=1; i<6; i++){ //For the 6 lines
				for (int j=0; j<i; j++){ //Print the requisite # of stars
					System.out.print("*");
				}
				System.out.println(); //then newline
			}		
			System.out.println("\nPrinted using for loops");
		}
		if (forOrWhile==false){ //while loop
			int i=1;
			while (i<6){
				int j=0;
				while (j<i){
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}	
			System.out.println("\nPrinted using while loops");
		}
	}
}
