package ProjectsBABY;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String input = "I AM VERY MAD AND I CANT SPELL THE WORD AMBROSIA";
		System.out.println("The last word is \"" + lastWord(input) + "\" with length " + lengthOfLastWord(input));
	}
	
	public static int lengthOfLastWord(String s) {
		String[] tokens = s.split(" ");
		return tokens[tokens.length - 1].length();
	}
	
	public static String lastWord(String s) {
		String[] tokens = s.split(" ");
		return tokens[tokens.length - 1];
	}
}
