public class MainArgument
{
public static void main (String args[])
{
    
for (int i=0; i<args.length; i++) //length of the args array
{     
     int out;
    //int out =+Integer.parseInt(arg[i]);
    if (isNumeric(args[i])) {
        out += Integer.parseInt(args[i]);
    }
}
System.out.print("The Output Should be : "  + out);

}
}