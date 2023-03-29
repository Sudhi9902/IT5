package Basic;

import java.util.ArrayList;

public class RemoveMiddleOneFromlist {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(50);
		a1.add(40);
		a1.add(60);
		a1.add(70);
		System.out.println(a1);
		a1.remove(a1.size()/2);
		System.out.println(a1);
	}

}
