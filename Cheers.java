//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String word = args[0].toUpperCase();
            int Ytimes = Integer.parseInt(args[1]); 
            String vowels = "AEFHILMNORSX";
            for ( int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (vowels.indexOf(letter) != -1) {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
    
                       } else {
                        System.out.println("Give me a " + letter + ": " + letter + "!");
                       }
            }
            System.out.println("What does that spell?");
            int j = 0;
            while (j < Ytimes) {
                System.out.println(word + "!!!");
                j ++; 
            }
        }
}
