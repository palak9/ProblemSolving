package problem;

public class IntegerPalindrome {

	public boolean isPalindrome(int x) {
		int originalNumber = x;
		int remainder = 0;
		int reversedNumber = 0;

		while (x > 0) {
			remainder = x % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			x = x / 10;
		}
		if (reversedNumber == originalNumber) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		IntegerPalindrome palindrome = new IntegerPalindrome();
		System.out.println("3553 : " + palindrome.isPalindrome(3553));
		System.out.println("-1441 : " + palindrome.isPalindrome(-1441));
	}

}
