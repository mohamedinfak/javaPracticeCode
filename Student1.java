import javax.swing.*;

public class Student1
{
    private static final int N=10;
    private int sNo;
    private String sName;
    private double mark1, mark2, mark3;

    public Student1(int sNo, String sName, double mark1, double mark2, double mark3)
    {
        this.sNo = sNo;
        this.sName = sName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double calculateAverage()
    {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public void displayDetails()
    {
        sNo = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Number:"));
        System.out.println();
        sName = JOptionPane.showInputDialog(null, "Enter your Name:");
        System.out.println();
        mark1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Mark 1:"));
        System.out.println();
        mark2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Mark 2:"));
        System.out.println();
        mark3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Mark 3:"));
        System.out.println();

        double average = calculateAverage();
        char grade;
        if (average > 90)
        {
            grade = 'A';
        }
        else if (average > 75)
        {
            grade = 'B';
        }
        else if (average > 50)
        {
            grade = 'C';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Student Number: " + sNo + "\t" +"Student Name: " + sName + "\t" +
                "Average Marks: " + average + "\t" +"Grade: " + grade);
             
        JOptionPane.showMessageDialog(null, "Student Number: " + sNo + "\n" +"Student Name: " + sName + "\n" +
                "Average Marks: " + average + "\n" +"Grade: " + grade);
    }

    public static void main(String[] args)
    {
        Student1[] students = new Student1[N];

        for (int i = 0; i < N; i++)
        {
            students[i] = new Student1(0, "", 0, 0, 0);
            students[i].displayDetails();
        }
    }
}