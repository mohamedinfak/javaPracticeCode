import javax.swing.*;

public class Student
{
    private static final int N=10;
    private int stid;
    private String stname;
    private double marks1, marks2, marks3;

    public Student(int stid, String stname, double marks1, double marks2, double marks3)
    {
        this.stid= stid;
        this.stname = stname;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double calculateAverage()
    {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    public void displayDetails()
    {
        stid = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Student id:"));
        stname = JOptionPane.showInputDialog(null, "Enter your Name:");
        marks1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Mark 1:"));
        marks2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Mark 2:"));
        marks3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your Mark 3:"));


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
        System.out.println("Student Number: " + stid + "\n" +"Student Name: " + stname + "\n" +
                "Average Marks: " + average + "\n" +"Grade: " + grade);
             
        JOptionPane.showMessageDialog(null, "Student Number: " + stid + "\n" +"Student Name: " + stname + "\n" +
                "Average Marks: " + average + "\n" +"Grade: " + grade);
    }

    public static void main(String[] args)
    {
        Student1[] st = new Student1[N];

        for (int i = 0; i < N; i++)
        {
            st[i] = new Student1(0, "", 0, 0, 0);
            st[i].displayDetails();
        }
    }
}