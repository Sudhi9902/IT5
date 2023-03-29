package StarPatterns;

/***
 * This method is used to make string mutable(changing the values) nature
 * 
 * @author sudarshan
 *
 */
public class Bufferexample {
	// String buffer methods

	/***
	 * 
	 * @param A mutable sequence of characters. This class provides an API
	 *          compatiblewith StringBuffer, but with no guarantee of
	 *          synchronization
	 */
	public static void main(String[] args) {
		StringBuilder sdb = new StringBuilder("Nis");
		System.out.println("Original String :" + sdb);
		sdb.append("arga");
		System.out.println("Builder String :" + sdb);
		System.out.println();

		System.out.println();
		StringBuffer sfb = new StringBuffer("Java");
		System.out.println("Original String :" + sfb);
		sfb.append("-Fullstack");
		System.out.println("Buffer String :" + sfb);
	}
}
