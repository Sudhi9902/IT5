package Basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMappingMethod {

	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		h1.put(1, "Sudarshan");
		h1.put(2, "Bru");
		h1.put(3, "Tea");
		h1.put(1, "Nescafe");
		h1.put(4, "Sharron");
		h1.put(5, "Rakshith");
		System.out.println(h1);
		System.out.println("==========================");
		Set Obj = h1.keySet();
		for (Object o : Obj) {
			System.out.println(o);
		}
		System.out.println("==========================");
		Collection name = h1.values();
		for (Object o1 : name) {
			System.out.println(o1);
		}
		System.out.println("==========================");
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		h1.clear();
		System.out.println("==========================");
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		System.out.println("==========================");
		HashMap<String, Integer> h2=new HashMap<>();
		h2.put("Shankar", 1);
		h2.put("Guru",2);
		h2.put("Ameen",3);
		h2.put("Shaik", 4);
		Set<Entry<String, Integer>> s1 = h2.entrySet();
		System.out.println(h2);
		for(Object o3:s1) {
			System.out.println(o3);
		}
	}

}
