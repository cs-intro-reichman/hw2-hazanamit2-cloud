// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
        String mode = args[1];
		for (int seed = 1; seed <= N; seed++) {
			int num = seed;
			int steps = 1;
			if (mode.equals("v")) {
                System.out.print(seed + " ");  
            }

			while (num != 1) { 
				if (num % 2 == 0) {
                    num = num / 2;
                   } else {
                   num = 3 * num + 1;
                   }
                   steps++;
				   if (mode.equals("v")) {
                    System.out.print(num + " ");
                }
				 
            }
			 if (mode.equals("v")) {
                System.out.println("(" + steps + ")");
			}
			
}
System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
				
			}

