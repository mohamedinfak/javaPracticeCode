import mypackage.*;
public class 
{
public static void main(String args[])
{
Stack s1=new Stack(5);
for (int i=0; i<5; i++)
{
s1.push(i);
}
System.out.println("The stack contains,");
for (int i=0; i<5; i++)
{
System.out.println(s1.pop());
}
}
}