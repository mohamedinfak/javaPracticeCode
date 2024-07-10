public class ScopeTest
{
public static int p;

public static void main(String[] args)
{
p=1000;
System.out.println("p = " + p);
int x; x=1;
System.out.println("x = " + x);
{
p=2000;
System.out.println("p = " + p);
int a; a=10;
System.out.println("a = " + a);
System.out.println("x = " + x);
{
int p; p=1001;
System.out.println("p = " + p);
//int x;
int b; b=20;
System.out.println("b = " + b);
//int a;
x=11;
System.out.println("x = " + x);
}
System.out.println("p = " + p);
System.out.println("a = " + a);
//System.out.println("b = " + b);
System.out.println("x = " + x);
int b; b=200;
System.out.println("b = " + b);
int y; y=22;
System.out.println("y = " + y);
}
int y; y=2;
System.out.println("y = " + y);
{
System.out.println("p = " + p);
//int y;
System.out.println("y = " + y);
int a; a=100;
System.out.println("a = " + a);
}
}
}