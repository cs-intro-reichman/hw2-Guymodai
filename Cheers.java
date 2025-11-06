//feedback
/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        char[] CheersArray = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
        String cheersString = new String(CheersArray);
        String word = args[0].toUpperCase(); 
        int repeated = Integer.parseInt(args[1]);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cheersString.indexOf(c) != -1) {
                System.out.println("Give me an " + c + ": " + c + "!");
            } else {
                System.out.println("Give me a " + c + ": " + c + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int z = 0; z < repeated; z++) {
            System.out.println(word + "!!!");
        }
    }
}
