import java.util.*;

public class Queues {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<Integer>();
		for (int i = 5; i < 10; i++) {
			myQueue.add(i);
		}
		System.out.println("Elements of Queue " + myQueue);
		
		int removedHead = myQueue.remove();
		System.out.println("Removed element " + removedHead);
		System.out.println(myQueue);
		
		int head = myQueue.peek();
		System.out.println("Head of Queue is " + head);
		System.out.println(myQueue);
		
		int size = myQueue.size();
		System.out.println("Size of Queue is " + size);
		System.out.println(myQueue);
		}
}
