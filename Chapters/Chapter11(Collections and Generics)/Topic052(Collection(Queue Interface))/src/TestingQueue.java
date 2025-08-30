import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(10); //add(E e): Inserts the specified element into the queue. Throws an exception if the element cannot be added.
        queue1.offer(30); //offer(E e): Inserts the specified element into the queue. Returns false if the element cannot be added.


        Utility.printCollection(queue1);

        System.out.println(queue1.peek()); //peek(): Retrieves, but does not remove, the head of the queue. Returns null if the queue is empty.
        System.out.println(queue1.element()); //element(): Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.

        queue1.remove(); //remove(): Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
        queue1.poll(); //poll(): Retrieves and removes the head of the queue. Returns null if the queue is empty.
    }
}
