// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double sum =1;
		int j=1;
		for(int divided = 3 ; j< N  ; divided = divided+ 2)
		{
			if(j%2==0)
			{
				sum = sum + (1.0 / divided );
			}
			else
			{
				sum = sum -  (1.0 / divided);
			}
				j++;
		}
		System.out.println("pi according to Java: " +  Math.PI );
		System.out.println("pi aapproximated: " + sum*4);
	}
}
