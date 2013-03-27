
public class IntegralCalculator1
{
	public static void main (String[] args)
	{
		double deltaX1 = 10;
		double deltaX2 = 30;
		double deltaX3 = 50;
		double deltaX4 = 100;
		double deltaX5 = 1000;
		
		double total = 0;
		double answer;
		
		System.out.println("\nthe math expression ƒ°(k=1 to n)((1/n)*(K/n)^4 )");
		
		System.out.println("\nn = 10 ");
		for(int k = 1;k <= deltaX1; k++)
		{
			answer = 1/deltaX1 * Math.pow(k/deltaX1,4);
			total = answer + total;
			System.out.printf("\n%.8f",total);
		}
		
		System.out.printf("\n when n is 10, the sum is %.8f",total);
		
		total = 0;
	
		System.out.println("\nn = 30 ");
		for(int k = 1;k <= deltaX2; k++)
		{
			answer = 1/deltaX2 * Math.pow(k/deltaX2,4);
			total = answer + total;
			System.out.printf("\n%.8f",total);
		}
		
		System.out.printf("\n when n is 30, the sum is %.8f",total);
	
	
		total = 0;
		System.out.println("\nn = 50 ");
		for(int k = 1;k <= deltaX3; k++)
		{
			answer = 1/deltaX3 * Math.pow(k/deltaX3,4);
			total = answer + total;
			System.out.printf("\n%.8f",total);
		}
		System.out.printf("\n when n is 50, the sum is %.8f",total);
		
		total = 0;
		System.out.println("\nn = 100 ");
		for(int k = 1;k <= deltaX4; k++)
		{
			answer = 1/deltaX4 * Math.pow(k/deltaX4,4);
			total = answer + total;
			System.out.printf("\n%.8f",total);
		}
		System.out.printf("\n when n is 100, the sum is %.8f",total);
		
		/*total = 0;
		System.out.println("\nn = 1000 ");
		for(int k = 1;k <= deltaX5; k++)
		{
			answer = 1/deltaX5 * Math.pow(k/deltaX5,4);
			total = answer + total;
			System.out.printf("\n%.8f",total);
		}
		System.out.printf("\n when n is 1000, the sum is %.8f",total);
		*/
	}//main
}//class







