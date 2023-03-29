import java.util.HashMap;

public class DuplicateRemovalUsingHashMap {

	public static void main(String[] args) {
		String s = "SSUUDDARSHHAAN";
		HashMap<String, String> h1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			String a = "" + s.charAt(i);
			h1.put(a, "1");
		}
		System.out.println(h1);

	}
}
