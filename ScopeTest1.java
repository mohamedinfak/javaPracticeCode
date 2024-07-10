class Test
{
private int a=1;
public static int p;
public void method1()
{
System.out.println("p = " + p);
p=2000;
System.out.println("a = " + a);
int a=10;
System.out.println("a = " + a);
int b=20;
System.out.println("b = " + b);
}
public void method2()
{
p=3000;
System.out.println("p = " + p);
System.out.println("a = " + a);
int b=30;
System.out.println("b = " + b);
}
}
public class ScopeTest1
{
public static void main(String[] args)
{
Test.p=1000;
Test t=new Test();
t.method1();
System.out.println("t.p = " + t.p);
System.out.println("Test.p = " + Test.p);
t.method2();
System.out.println("t.p = " + t.p);
}
}