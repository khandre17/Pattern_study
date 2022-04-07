package pattern_study;

public class E8_Equilateral_Downward {
	public static void main(String []args) {
		//*******
		// *****
		//  ***
		//   *
		
		int star=7;
		int space=0;
		for(int i=1;i<=4;i++)// Outer For Loop; Rows= 4
		{
			for(int j=1;j<=space;j++)// Inner for Loop
			{
			System.out.print(" ");	
			}			
				for(int k=1;k<=star;k++)// Inner for Loop
				{					
				System.out.print("*");
			    }
				System.out.println();
				space++;// Increment of Space by 1
				star=star-2;// Decrement of Star by 2
		}
	}

}
