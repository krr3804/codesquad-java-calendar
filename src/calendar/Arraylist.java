package calendar;

import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(null);
		list.add(1,10);
		System.out.println(list.get(1));
	}

}
