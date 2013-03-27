public class IntegralCalculator3
{
	public static void main( String [] args)
	{
		double cos;
		int n = 10;
		double ans = 0;
		
		
		for(int k = 1; k <= n; k++)
		{
			cos = Math.cos(Math.PI * k/2 * n);
			ans = cos + ans;
			System.out.printf("\n%.8f for cos",cos);
			System.out.printf("\n%.8f for sum",ans);
		}
	}

}
