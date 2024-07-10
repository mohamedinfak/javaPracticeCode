import java.util.Scanner;

public class ArrayQueue {

    public int size;
    int front, rear;
    public int que[] = new int[size];

    public ArrayQueue(int size, int[] arr) {
        super();
        this.size = size;
        que = arr;
        front = -1;
        rear = -1;
    }

    public int getSize() {
        return size;
    }

    public int[] getQue() {
        return que;
    }

    public void enqueue(int val) {
        if (isFull() == true) {
            System.out.println("Queue is Full");
        } else {
            que[++rear] = val;
        }
    }

    public void dequeue() {
        if (isEmpty() == true) {
            System.out.println("Queue is Empty...");
        } else {
            front++;

            System.out.println("Queue first value Deleted " + que[front]);
            que[front] = 0;
        }
    }

    public void display() {
        if (isEmpty() == true) {
            System.out.println("Queue is Empty...");
        } else {
            for (int j = front + 1; j <= rear; j++) {
                System.out.print(que[j] + ",");
            }
            System.out.println();
        }
    }

    public boolean isFull() {
     
            return (rear >= getSize()-1 );
        
    }

    public boolean isEmpty() {
        
            return (front == rear);
       
    }

    public static void main(String ar[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Queue Size");
        int ArraySize = sc.nextInt();
        int Arr[] = new int[ArraySize];

        ArrayQueue op = new ArrayQueue(ArraySize, Arr);
        boolean x = true;
        while (x) {
            System.out.println("Choose Your Options \n " + "1-->Add Value in Queue \n" + "2-->Delete Value in Queue \n"
                    + "3-->Display Value in Queue \n" + "4-->End Program\n");
            int chose = sc.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Enter Your Queue Value");
                    int selection = sc.nextInt();
                    op.enqueue(selection);
                    break;
                case 2:
                    op.dequeue();
                    break;
                case 3:
                    op.display();
                    break;
                case 4:
                    x = false;
                    break;
            }
        }
        sc.close();
    }
}
