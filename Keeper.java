class Arr
{
       public int array1[];
 
 Arr(){
      array1=new int[5];
      for (int ctr=0; ctr<5; ctr++)
         {
            array1[ctr]=ctr*ctr+1;
          }
          }
    public void dispElts()
          {
        for (int ctr=0; ctr<5; ctr++)
           {
          System.out.println("The element number " + ctr + " is " +array1[ctr]);
           }
           }
           }
public class Keeper{ 
     public static void main(String args[])
             {
              Arr obj1=new Arr();
               obj1.dispElts();
              System.out.println("The first element of the array is " + obj1.array1[0]);
}
}