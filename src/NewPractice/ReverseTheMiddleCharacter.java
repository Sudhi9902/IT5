package NewPractice;

public class ReverseTheMiddleCharacter {

	public static void main(String[] args) {
		String s1 = "NISARGA";
		String s3 = "";
		s3 = reverse(s1);
		//System.out.println(s3);
	}

	public static String reverse(String s) {
		String a = s.substring(0, 2);
		String b = s.substring(5, 7);
		String r = s.substring(2, 5);
		String v="";
		String rev = "";
		for (int i = r.length() - 1; i >= 0; i--) {
			rev = rev+r.charAt(i) ;
		}
		System.out.println(rev);
		v=a+rev+b;
		System.out.println(v);
		return v.toString();
	}

//	public static String reverse1(String s) {
//		String r = s;
//		String rev = "";
//		for (int i = r.length() - 1; i >= 0; i--) {
//			rev = r.charAt(i)+rev;
//			System.out.print(rev);
//		}
//		return rev.trim();
//	}

}
