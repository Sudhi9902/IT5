package NewPractice;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CountingTheDuplicateString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String");
		int count = 0;
		//Printing only the Duplicate value inside the String
		String s1 = sc.nextLine();
		
		s1=s1.replace(" ","");
		TreeMap<Character,Integer> h=new TreeMap();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			count=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			h.put(c[i],count);
		}
		System.out.println(h);
		for(Entry<Character,Integer> m:h.entrySet()) {
		 if(m.getValue()>1) {
			 System.out.println(m.getKey());
		 }
		}
		
	}

}
