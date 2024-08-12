import java.util.*;

/*
* * * * *
* * # * #
* # * # #
* * # * #
* # # # *
*/

class Pattern5	
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
	
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i%j==0)||(j%i==0))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("# ");
				}
				
			}
		
			System.out.println();
		}
	}
	
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0;
	
		System.out.println("Enter Number of Rows");
		iValue1=sobj.nextInt();
	
		System.out.println("Enter Number of Coloms");
		iValue2=sobj.nextInt();
	
		Display(iValue1,iValue2);
		
	}
	
}

