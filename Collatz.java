public class Collatz {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String charinput = args[1].toUpperCase();
        int Seed = N;

        for(int i=1;i<=N;i++)
		{
			int localSeed = i;
            String sequence = "";
            int count = 1;

            while(localSeed != 1 ||count ==1 ) {
                sequence = sequence + localSeed + " ";
                if(localSeed % 2 == 0)
				{
					localSeed = localSeed / 2;	
				}
                else 
				{localSeed = localSeed * 3 + 1;}
                count++;
            }
            sequence =sequence +  "1";
            if(charinput.equals("V")) 
			{
				System.out.println(sequence + " (" + count + ")");
			}
    	}
		System.out.println("Every one of the first " + Seed + " hailstone sequences reached 1.");
	}
}

