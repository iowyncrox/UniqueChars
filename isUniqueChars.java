import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class isUniqueChars {

	public static boolean isUniqueChars(String str) {
		Objects.requireNonNull(str);
		
		boolean bool = false;
		Map<Character, Boolean> map = new HashMap<>();
		for (char i = 97; i <= 122; ++i) {
			map.put(i, bool);
		}
		
		String value = str.trim().toLowerCase();
		for (int i = 0; i < value.length(); ++i) {
			if(map.get(value.charAt(i)) == true) {
				return false;
			}
			map.put(value.charAt(i), true);
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = { "abcde", "hello", "apple", "kite", "padle" };
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}