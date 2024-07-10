interface CalcPay {
    final static String company_name = "Supersoft Ltd."; // constant

    public int calcHra();

    public float calcTax();

    public float calcBonus();

    public float calcSuperAnnuation();

    public float calcGross();
}

class Employee {
    protected int e_id;
    String e_name;
    protected int basic;

    Employee(int m_e_id, String name, int m_basic) {
        e_id = m_e_id;
        e_name = name;
        basic = m_basic;
    }
}

class Clerk extends Employee implements CalcPay {

    Clerk(int s_e_id, String s_name, int s_basic) {
        super(s_e_id, s_name, s_basic);
    }

    public int calcHra() {
        if (basic < 1000)
            return (500);
        else
            return (900);
    }

    public float calcTax() {
        float an_sal = basic + calcHra() + calcSuperAnnuation();
        if (an_sal > 6000)
            return ((float) 0.1 * an_sal);
        else
            return 0;
    }

    public float calcBonus() {
        return ((float) 0.08 * basic);
    }

    public float calcSuperAnnuation() {
        return (0);
    }

    public float calcGross() {
        return (basic + calcHra() + calcBonus() - calcTax());
    }

    void printSalary() {
        System.out.println("\n" + CalcPay.company_name);
        System.out.println("Employee number: " + e_id);
        System.out.println("Employee name: " + e_name);
        System.out.println("Basic salary: " + basic);
        System.out.println("House Rent Allowence: " + calcHra());
        System.out.println("Bonus: " + calcBonus());
        System.out.println("Taxation: " + calcTax());
        System.out.println("Gross salary: " + calcGross());
        System.out.println("-------------------------------\n");
    }
}

class Manager extends Employee implements CalcPay {
    Manager(int s_e_id, String s_name, int s_basic) {
        super(s_e_id, s_name, s_basic);
    }

    public int calcHra() {
        if (basic < 6000)
            return (3500);
        else
            return (5500);
    }

    public float calcTax() {
        float an_sal = basic + calcHra() + calcSuperAnnuation();
        if (an_sal > 150000)
            return ((float) 0.3 * an_sal);
        else
            return ((float) 0.2 * an_sal);
    }

    public float calcBonus() {
        return (0);
    }

    public float calcSuperAnnuation() {
        return ((float) 0.15 * basic);
    }

    public float calcGross() {
        return (basic + calcHra() + calcSuperAnnuation() - calcTax());
    }

    void printSalary() {
        System.out.println("\n" + CalcPay.company_name);
        System.out.println("Employee number: " + e_id);
        System.out.println("Employee name: " + e_name);
        System.out.println("Basic salary: " + basic);
        System.out.println("House Rent Allowence: " + calcHra());
        System.out.println("Bonus: " + calcBonus());
        System.out.println("Taxation: " + calcTax());
        System.out.println("Super annuation: " + calcSuperAnnuation());
        System.out.println("Gross salary: " + calcGross());
        System.out.println("-------------------------------\n");
    }
}

public class PaySlip {
    public static void main(String args[]) {
        Clerk c1 = new Clerk(3648, "Vino Sarma", 800);
        c1.printSalary();
        Manager m1 = new Manager(2619, "S.K.Lal", 7000);
        m1.printSalary();
    }
}