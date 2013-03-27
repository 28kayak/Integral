
public class IntegralCalculator2
{
	public static void main( String[]args)
	{
		double deltaX1 = 10;
		double deltaX2 = 30;
		double deltaX3 = 50;
		double deltaX4 = 100;
		double deltaX5 = 1000;
		
		double total = 0;
		double answer= 0;
		int k = 2;
		
		answer = (Math.PI / 2 * deltaX1 ) * (Math.cos(k * Math.PI / 2 * deltaX1));
			//total = answer + total;
			System.out.printf("\n%.8f",answer);
		
		
		
		
		
		
		/*System.out.println("\nn = 10 ");
		for(int k = 1; k <= deltaX1; k++)
		{
			answer = (Math.PI / 2 * 10) * (Math.cos(k * Math.PI / 2 * 10));
			//total = answer + total;
			System.out.printf("\n%.8f",answer);
		}
		System.out.printf("\nwhen n = 10, the sum is %.8f",answer);*/
	}//main
}//class







