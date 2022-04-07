package pattern_study;

public class Eg6 {
	public static void main(String[]args) {
		
//		 *
//		**
//	   ***
//	  ****
//   *****
		int star=1;// star on first row, star = 1
		int space=4;// Space in first row, space = 4
		for(int i=1;i<=5;i++)// Outer loop for No of Rows = 5
		{
			for(int j=1;j<=space;j++)// 1st inner loop : Space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
		
		
	}

}
