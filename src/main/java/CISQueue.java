public class CISQueue<T> {

    // A property of our Queue class is a Linked List.
    // Use your Linked List class that you created in Lab 1!
    // Thought 1: is aggregation or composition going to be used here?
    // Thought 2: meditate on the word 'abstraction'.
    CISLinkedList<T> a;

    // Our CISQueue class will have a constructor.
    // Our CISQueue constructor will instantiate a Queue of size 1.
    public CISQueue(T value) {
        a = new CISLinkedList<>(value);
    }

    // isEmpty
    // Returns a boolean.
    // Indicates whether the Queue is empty.
    public boolean isEmpty() {
        return a.isEmpty();
    }

    // size
    // Returns an integer.
    // Indicates how many elements are currently in our Queue.
    public int size() {
        return a.size();
    }

    // dequeue
    // Returns the data stored in the node that will be polled.
    public T dequeue() {
        return a.removeFirst();
    }

    // enqueue
    // Adds a node to the end of our Queue.
    public void enqueue(T value) {
        a.addLast(value);
    }

    // toString
    // Returns a String representation of our Queue.
    public String toString() {
        return a.toString();
    }
}
