// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	     int seed = Integer.parseInt(args[0]);
		 String charinput =args[1] ;
		 charinput = charinput.toUpperCase();
		 String sequence = "";
		 int counter = 1;
		 while(seed!=1 || counter==1)
			{
				sequence = sequence + seed + " ";
				if(seed%2==0)
				{
					seed = seed/2;	
				}
				else seed = seed *3 +1;
				counter ++;
			}
	 	if(charinput.equals("S"))
		 {
			System.out.println(sequence + "1");
		 }
			System.out.println("Every one of the first " + counter + " hailstone sequences reached 1.");
		 
	}
}