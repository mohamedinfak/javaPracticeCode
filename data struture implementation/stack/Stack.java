
public class Stack{
    private int[] num;
    private int top;
    int N=10;

    public  Stack()
    {
        
        num=new int[N];
        top= -1;
        
    }
    public void Initialize()
    { 
        top= -1;
        System.out.println(top);


    }
    public void Push(int x)
    {
        if(isFull()){
            System.out.print("stack is full:");
        }

        num[++top]=x;
        System.out.println(num);
    }
    public boolean isFull()
    {   
        return(top == (N-1));

    }
    public boolean isEmbty(){
        return (top == -1);
    }
    public int Pop()
    {
        return num[top--];
    }
    public int Peek()
    { int v=num[top];
        return v ;
    }
   
    
}