
public class PrintingtheNumber {

	public static void main(String[] args) {
		String s = "[1,2,3,71,89,4]";
		String[] s2  ;
		int sum = 0;
	s = s.replace("[", "");
		s = s.replace("]", "");
		s=s.replace(",", "");
		s2=s.split(s);
		
		System.out.println(s);
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(s2);
		System.out.println(sum);
	}
}
