public class MethodTest4
{
public static void main(String[] args)
{
double sal, percent;
System.out.println("Increasing the salary by using a method of another class.");
sal=10000.00;percent=10.00;
AnotherClass.newSalary(sal,percent);
sal=20000.00;percent=5.5;
AnotherClass.newSalary(sal,percent);
AnotherClass.newSalary(15000.00,7.45);}}

class AnotherClass
{
public static void newSalary(double s, double p)
{
double new_sal;
new_sal=s*(1+p/100);
System.out.println("The salary " + s + " is increased by "
+ p + "%, and therefore the new salary is " + new_sal + ".");
}
}