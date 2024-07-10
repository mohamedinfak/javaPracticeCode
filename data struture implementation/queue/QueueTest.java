  class Queue
  {
    private int q[];
    private int rear;
    private int front;
    private int size;
	final int N = 8;

    public Queue()
	{
        q = new int[N];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void initialize()
	{
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enQ(int x_in)
	{
        if (size == N) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        q[rear] = x_in;
        rear = (rear + 1) % N; // Circular queue implementation
        size++;
    }

    public int deQ() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Returning a default value when the queue is empty
        }
        int frontElement = q[front];
        front = (front + 1) % N; // Circular queue implementation
        size--;
        return frontElement;
    }

    public int peek() 
	{
        if (size == 0)
		{
          System.out.println("Queue is empty. Cannot peek.");
            return -1; // Returning a default value when the queue is empty
        }
        return q[front];
    }

    public boolean isFull()
	{
        return (size == N);
    }

    public boolean isEmpty() 
	{
        return (size == 0);
    }
}

public class QueueTest {
    public static void main(String[] args) 
	{
        Queue queue = new Queue();
        queue.enQ(8);
        int x = queue.deQ();
        System.out.println(x+"\n");
        queue.enQ(5);
        queue.enQ(4);
        int r = queue.deQ();
        System.out.println(r+"\n");
        queue.enQ(9);
        System.out.println(queue.peek()+"\n");
		boolean a = queue.isFull();
		System.out.println(a+"\n");
		boolean b = queue.isEmpty();
		System.out.println(b+"\n");
    }
}