package ProjectsBABY;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println("121 - " + isPalindrome(121) + " - should be true.");
		System.out.println("-121 - " + isPalindrome(-121) + " - should be false.");
		System.out.println("124 - " + isPalindrome(124) + " - should be false.");
	}
	
	public static boolean isPalindrome(int x) {
		String string = String.valueOf(x);
		String reversedString = stringReverse(string);
		
		if (string.equals(reversedString)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static String stringReverse(String s) {
		String rStr = "";
		char ch;
		
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			rStr = ch + rStr;
		}
		
		return rStr;
	}
}
