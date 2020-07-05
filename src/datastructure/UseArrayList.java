package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		getArrayList();

	}

	public static void getArrayList(){
		List<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for (int i = 0; i < list.size(); i++){
			System.out.println(i);
		}

	}

}
