package string;

public class AnagramsWithSpecialCharacters {

	public static boolean isPalindrome(String s) {
		String replaceWhiteSpacesfromString = s.replace(" ", "").replaceAll("[^0-9a-zA-Z]", "");
		replaceWhiteSpacesfromString = replaceWhiteSpacesfromString.toLowerCase();
		String resultString = "";
		for (int i = replaceWhiteSpacesfromString.length() - 1; i >= 0; i--) {
			resultString += replaceWhiteSpacesfromString.charAt(i);
		}

		if (resultString.equals(replaceWhiteSpacesfromString)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("A man, a plan, a canal: Panama = "
				+ AnagramsWithSpecialCharacters.isPalindrome("A man, a plan, a canal: Panama"));
	}

}
