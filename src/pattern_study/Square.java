package pattern_study;

public class Square {
	public static void main(String[] args) {
		// *****
		// *****
		// *****
		// *****
		// *****

		for (int i = 1; i <= 5; i++)//outer loop for row
		{
			for (int j = 1; j <= 5; j++)//inner loop for column
			{
				System.out.print("* ");//use print only
			}
			System.out.println();//on next line use println
		}
	}

}
