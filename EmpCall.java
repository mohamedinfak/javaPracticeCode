class Employee {
    int emp_id;
    static int emp_count = 200;

    Employee() {
        emp_count++;
    }

    static void totalStrength() {
        System.out.println("The total number of employees is " + emp_count);
    }
}

class EmpCall {
    public static void main(String args[]) {
        Employee.totalStrength();
        Employee e = new Employee();
        e.totalStrength();
    }
}