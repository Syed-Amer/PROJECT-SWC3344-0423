import java.util.LinkedList;

public class Queue {// open class

	private LinkedList<Object> q; // Declare the object of queue using LinkedList
	private int size;

	// Constructor without param
	public Queue() {
		q = new LinkedList<>();
		size = 0;
	}// end of constructor

	// Method to insert an object to the queue
	public void enqueue(Object item) {
		q.addLast(item);
		size++;
	}// end of enqueue

	// Method to remove an object from the queue
	public Object dequeue() {
		if (!empty()) {
			size--;
			return q.removeFirst(); // Remove the first element (front)
		} else {
			System.out.println("Queue is empty!");
			return null; // Return null or throw an exception to handle empty queue case
		}
	}// end of dequeue

	// Method to test whether the queue is empty or not
	public boolean empty() {
		return (size == 0);
	}// end of empty

	// Return the element at the front without removing it
	public Object front() {
		if (!empty())
			return q.getFirst();
		else {
			System.out.println("Queue is empty");
			return null; // Return null or throw an exception to handle empty queue case
		}
	}

	// Method to get the size of the queue
	public int size() {
		return size;
	}
}// close class