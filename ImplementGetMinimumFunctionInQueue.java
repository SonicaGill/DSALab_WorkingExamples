import java.util.LinkedList;
import java.util.Queue;

class QueueWithMin {
    private Queue<Integer> mainQueue;
    private Queue<Integer> minQueue;
    public QueueWithMin() {
        mainQueue = new LinkedList<>();
        minQueue = new LinkedList<>();
    }
    public void enqueue(int element) {
        mainQueue.offer(element);
        while (!minQueue.isEmpty() && minQueue.peek() > element) {
            minQueue.poll(); 
        }
        
        minQueue.offer(element);
    }
    public Integer dequeue() {
        if (mainQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        int dequeuedElement = mainQueue.poll();
        if (dequeuedElement == minQueue.peek()) {
            minQueue.poll();
        }
        return dequeuedElement;
    }
    public Integer getMinimum() {
        if (minQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return minQueue.peek();
    }
    public void displayQueue() {
        System.out.println("Main Queue: " + mainQueue);
        System.out.println("Min Queue: " + minQueue);
    }
    public static void main(String[] args) {
        QueueWithMin queue = new QueueWithMin();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(8);
        queue.enqueue(1);
        queue.displayQueue();
        System.out.println("Current Minimum: " + queue.getMinimum());
        queue.dequeue();
        queue.displayQueue();
        System.out.println("Current Minimum: " + queue.getMinimum());
        queue.dequeue();
        queue.displayQueue();
        System.out.println("Current Minimum: " + queue.getMinimum());
    }
}
