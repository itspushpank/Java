import java.util.Scanner;

abstract class Student {
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}

interface MidSem_Exam {
    void readInternalMarks();
    double getInternalMarks();
    void displayInternalMarks();
}

interface EndSemExam {
    void readExternalMarks();
    double getExternalMarks();
    void displayExternalMarks();
}

class FinalResult extends Student implements MidSem_Exam, EndSemExam {
    private double internalMarks;
    private double externalMarks;

    public void readInternalMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Internal Marks: ");
        internalMarks = sc.nextDouble();
    }

    public double getInternalMarks() {
        return internalMarks;
    }

    public void displayInternalMarks() {
        System.out.println("Internal Marks: " + internalMarks);
    }

    public void readExternalMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter External Marks: ");
        externalMarks = sc.nextDouble();
    }

    public double getExternalMarks() {
        return externalMarks;
    }

    public void displayExternalMarks() {
        System.out.println("External Marks: " + externalMarks);
    }

    double total() {
        return internalMarks + externalMarks;
    }

    double calculatePercentage() {
        return (total() / 200.0) * 100;
    }

    String getDivision() {
        double perc = calculatePercentage();
        if (perc >= 80) return "Distinction";
        else if (perc >= 60) return "First Class";
        else if (perc >= 50) return "Second Class";
        else if (perc >= 40) return "Pass Class";
        else return "Fail";
    }

    public void displayDetails() {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Name: " + getName());
        displayInternalMarks();
        displayExternalMarks();
        System.out.println("Total: " + total());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Division: " + getDivision());
        System.out.println("---------------------------");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int N = sc.nextInt();

        FinalResult[] students = new FinalResult[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new FinalResult();
            System.out.print("Enter Roll No: ");
            students[i].setRollNo(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter Name: ");
            students[i].setName(sc.nextLine());
            students[i].readInternalMarks();
            students[i].readExternalMarks();
        }

        System.out.println("\n===== ALL STUDENTS DETAILS =====");
        for (FinalResult s : students) {
            s.displayDetails();
        }

        FinalResult topper = students[0];
        for (int i = 1; i < N; i++) {
            if (students[i].calculatePercentage() > topper.calculatePercentage()) {
                topper = students[i];
            }
        }

        System.out.println("\n===== CLASS TOPPER =====");
        topper.displayDetails();
    }
}