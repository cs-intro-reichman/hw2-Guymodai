
public  class  TestRandom {
	public static void main(String[]  args) {
 	int N = Integer.parseInt(args[0]);
 	double r = Math.random();
	int greater_than = 0, less_than = 0;
	    for (int i = 0; i < N; i++) {
   			r = Math.random();
			 if(r>0.5)
			 {
				greater_than++;
			 }
			 else
			 {
				less_than++;
			 }
		}
		System.out.println("> 0.5: " + greater_than + " times");
		System.out.println("<= 0.5: " + less_than + " times");
		if (greater_than != 0 && less_than != 0) {
			double ratio = greater_than / (double) less_than;
			System.out.println("Ratio: " + ratio);
		}
	}
}
