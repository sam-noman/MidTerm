package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		myMapExample();
	}


	public static void myMapExample(){

		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");

		List<String> list1 = new ArrayList<>();
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");

		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}

		Map<String, List<String>> map = new HashMap<>();
		map.put("One", list);
		map.put("Two", list1);

		System.out.println(map.get("One"));
		System.out.println(map.get("Two"));

		Iterator<Map.Entry<String, List<String>>> itr = map.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry<String, List<String>> entry = itr.next();
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());
		}

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
