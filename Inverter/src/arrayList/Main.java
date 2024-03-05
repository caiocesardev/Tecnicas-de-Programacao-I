package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		 ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);
	        arrayList.add(4);
	        arrayList.add(5);

	        System.out.println("ArrayList original:");
	        System.out.println(arrayList);

	        inverter(arrayList);

	        System.out.println("ArrayList invertido:");
	        System.out.println(arrayList);
	    }

	    public static void inverter(ArrayList<Integer> arr) {
	        Collections.reverse(arr);
	    }
}
