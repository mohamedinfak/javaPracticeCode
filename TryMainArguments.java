public class TryMainArguments
{
public static void main (String arg[])
{
for (int i=0; i<arg.length; i++) //length of the args array
{
System.out.println("Argument" + (i+1) + ": " + arg[i]);
}
}
}