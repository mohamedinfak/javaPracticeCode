class Employee1 {
    int emp_no, hire_date, dop;
    String name, addr;

    Employee1() {
        emp_no = 0;
        hire_date = 0;
        dop = 0;
        name = null;
        addr = null;
    }

    Employee1(int emp_no, int hire_date, int dop, String name, String addr) {
        this.emp_no = emp_no;
        this.hire_date = hire_date;
        this.dop = dop;
        this.name = name;
        this.addr = addr;
    }

    public void display() {
        System.out.println("emp_no: " + emp_no);
        System.out.println("hire_date: " + hire_date);
        System.out.println("dop: " + dop);
        System.out.println("name: " + name);
        System.out.println("addr: " + addr);
    }

    void changeAddr(String address) {
        addr = address;
    }

    public static void main(String args[]) {
        Employee1 e = new Employee1();
        Employee1 e1 = new Employee1(82, 2022, 2002, "infak", "matale132/madipola");
        Wagers w = new Wagers(20, 2024, 2002, "zaha", "trincomale varatheyar nagar",10, 4500.00);
        Salaried s = new Salaried(123, 2023, 2001, "john", "kandy rod colombo1332/b", 5000.00, 200.00, 100.00);
        e.display();
        e1.changeAddr("galewela-matale132/b");
        e1.display();
        s.display();
        w.display();
    }
}

class Wagers extends Employee1 {
    int days_worked;
    double salary_per_day;

    Wagers() {
        super();
        days_worked = 0;
        salary_per_day = 0;
    }

    Wagers(int emp_no, int hire_date, int dop, String name, String addr ,int days_worked, double salary_per_day) {
        super(emp_no, hire_date, dop, name, addr);
        this.days_worked = days_worked;
        this.salary_per_day = salary_per_day;
    }

    public void display() {
        super.display();
        System.out.println("days worked for the Employee: " + days_worked);
        System.out.println("salary_per_day for the Employee: " + salary_per_day);
    }
}

class Salaried extends Employee1 {
    double basic_salary, advance, pf_deduction;

    Salaried() {
        super();
        basic_salary = 0;
        advance = 0;
        pf_deduction = 0;
    }

    Salaried(int emp_no, int hire_date, int dop, String name, String addr, double basic_salary, double advance, double pf_deduction) {
        super(emp_no, hire_date, dop, name, addr);
        this.basic_salary = basic_salary;
        this.advance = advance;
        this.pf_deduction = pf_deduction;
    }

    public void display() {
        super.display();
        System.out.println("basic_salary for the Employee: " + basic_salary);
        System.out.println("advance for the Employee: " + advance);
        System.out.println("pf_deduction for the Employee: " + pf_deduction);
    }
}