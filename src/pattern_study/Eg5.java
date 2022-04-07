package pattern_study;

public class Eg5 {

	public static void main(String[] args) {
		// *****
		//  ****
		//   ***
		//    **
		//     *

		int space = 0;
		int star = 5;
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= space; j++) // 1st consider inner for loop for the Space
			{
				System.out.print(" ");// Use Single Space and on Print for Inner For Loop
			}
			for (int k = 1; k <= star; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
