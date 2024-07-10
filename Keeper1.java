
class Arr {
    protected int array1[];

    Arr() // Constructor
    {
        array1 = new int[5];
        for (int ctr = 0; ctr < 5; ctr++) {
            array1[ctr] = ctr * ctr + 1;
        }
    }

    public void dispElts() {
        for (int ctr = 0; ctr < 5; ctr++) {
            System.out.println("The element number " + ctr + " is " + array1[ctr]);
        }
    }
}

class TotArr extends Arr {
    int tot;

    void calcTot() {
        for (int ctr = 0; ctr < 5; ctr++)
            tot = tot + array1[ctr];
        System.out.println("The sum of the elements is " + tot);
    }
}

public class Keeper1 {
    public static void main(String args[]) {
        Arr obj1 = new Arr();
        obj1.dispElts();
        TotArr t_obj1 = new TotArr();
        t_obj1.calcTot();
        System.out.println("The first element of the array is " + obj1.array1[0]);
    }
}