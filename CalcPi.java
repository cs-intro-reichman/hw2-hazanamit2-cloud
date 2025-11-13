// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int NumTerms = Integer.parseInt(args[0]);
		int Divider = 3;
		double Sum = 1;
		for (int i = 0; i < (NumTerms - 1); i++) {
			if (i % 2 ==0){
			Sum = (Sum - (1.0 / Divider));
			Divider = Divider + 2; 	
			}
			else {
				Sum = (Sum + (1.0 / Divider));
				Divider = Divider + 2;
			}
		}
		Sum = Sum * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + Sum);
	}
}
