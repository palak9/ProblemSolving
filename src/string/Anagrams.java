package string;

import java.util.Arrays;

public class Anagrams {

	public boolean isAnagram(String s, String t) {

		if (s.length() == t.length()) {
			char[] string1 = s.toCharArray();
			char[] string2 = t.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);

			boolean result = Arrays.equals(string1, string2);
			return result;

		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Anagrams anagramsObject = new Anagrams();
		System.out.println("\"anagram\", \"anagarm\" : " + anagramsObject.isAnagram("anagram", "anagarm"));
	}
}
