package string;

public class StringPalindrome {

	public boolean isPalindrome(String testString) {

		String reversedString = "";
		testString = testString.toLowerCase();
		for (int i = testString.length() - 1; i >= 0; i--) {
			reversedString += testString.charAt(i);
		}

		if (reversedString.equals(testString)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		StringPalindrome palindrome = new StringPalindrome();
		System.out.println("Test : " + palindrome.isPalindrome("Test"));
		System.out.println("Swims : " + palindrome.isPalindrome("Swims"));
		System.out.println("Racecar : " + palindrome.isPalindrome("Racecar"));
	}
}
