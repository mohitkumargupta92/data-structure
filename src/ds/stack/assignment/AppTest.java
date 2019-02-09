package ds.stack.assignment;

public class AppTest {

	public static void main(String[] args) {
		System.out.println(reverseString("Mohit Gupta"));
		System.out.println(reverseString("Hello"));

	}

	public static String reverseString(String word) {
		int wordLength = word.length();
		ReverseWord reverseWord = new ReverseWord(wordLength);

		for (int i = 0; i < wordLength; i++) {
			reverseWord.push(word.charAt(i));
		}

		char[] result = new char[wordLength];
		int i = 0;

		while (!reverseWord.isEmpty()) {
			result[i++] = reverseWord.pop();
			// System.out.print(value);

		}

		return new String(result);

	}

}
