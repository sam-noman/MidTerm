package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		queueExample();
	}

	public static void queueExample(){
		Queue<Integer> q = new LinkedList<>();
		q.add(6);
		q.add(1);
		q.add(8);
		q.add(4);
		q.add(7);
		System.out.println("The queue is: " + q);
		int num1 = q.remove();
		System.out.println("The element deleted from the head is: " + num1);
		System.out.println("The queue after deletion is: " + q);
		int head = q.peek();
		System.out.println("The head of the queue is: " + head);
		int size = q.size();
		System.out.println("The size of the queue is: " + size);
	}
}
