package thing;
public class Pattern3 {
	Pattern3(boolean forOrWhile){
		//View this problem as printing a certain # of spaces, then *, then a certain # of 'A*'
		if (forOrWhile==true){ //for loop
			char space=' ';
			char star='*';
			String A = "A*";
			int spaces=3;//# of spaces is 3 then 2 then 1 then 0
			int Astars = 0; //# of times we print A* on each line is 0 then 1 then 2 then 3
			for (int i=0; i<4;i++){ //For the four lines
				for (int j=0;j<spaces;j++){
					System.out.print(space);
				}
				System.out.print(star);
				for (int j=0;j<Astars;j++){
					System.out.print(A);
				}
				
				System.out.println(); //newline
				spaces--; //1 less space
				Astars++; //one more A*
			}
			System.out.println("\nPrinted using for loops");
		}
		if (forOrWhile==false){ //while loop
			char space=' ';
			char star='*';
			String A = "A*";
			int spaces=3;//# of spaces is 3 then 2 then 1 then 0
			int Astars = 0; //# of times we print A* on each line is 0 then 1 then 2 then 3
			int i=0;
			int j=0;
			while (i<4){
				while (j<spaces){
					System.out.print(space);
					j++;
				}
				j=0;
				System.out.print(star);
				while (j<Astars){
					System.out.print(A);
					j++;
				}
				j=0;
				System.out.println(); //newline
				spaces--; //1 less space
				Astars++; //one more A*
				i++;
			}
			System.out.println("\nPrinted using while loops");
		}
	}
}
