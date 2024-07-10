class StaticBlock
{
static int a;
static
{
a=a+10;
}
public static void main(String args[])
{
System.out.println("'a' contains the value " + a);
}
}
