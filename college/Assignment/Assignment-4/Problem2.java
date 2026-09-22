import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void show() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

interface MidSem_Exam {
    void readMarks();
    void showMarks();
    double internalMarks();
}

interface EndSemExam {
    void readMarksEndSem();
    void displayMarks();
    double externalMarks();
}

class FinalResult extends Student implements MidSem_Exam, EndSemExam {
    double internal;
    double external;

    public void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mid-Sem (Internal) Marks: ");
        internal = sc.nextDouble();
    }

    public void showMarks() {
        System.out.println("Internal Marks: " + internal);
    }

    public double internalMarks() {
        return internal;
    }

    public void readMarksEndSem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter End-Sem (External) Marks: ");
        external = sc.nextDouble();
    }

    public void displayMarks() {
        System.out.println("External Marks: " + external);
    }

    public double externalMarks() {
        return external;
    }

    double total() {
        return internal + external;
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

    void showFinalResult() {
        show();
        showMarks();
        displayMarks();
        System.out.println("Total: " + total());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Division: " + getDivision());
        System.out.println("---------------------------");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int N = sc.nextInt();

        FinalResult[] students = new FinalResult[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new FinalResult();
            students[i].accept();
            students[i].readMarks();
            students[i].readMarksEndSem();
        }

        System.out.println("\n===== FINAL EXAM PERFORMANCE REPORT =====");
        for (int i = 0; i < N; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].showFinalResult();
        }

        System.out.print("\nEnter Roll No to search: ");
        int searchRoll = sc.nextInt();
        boolean found = false;
        for (FinalResult s : students) {
            if (s.rollNo == searchRoll) {
                System.out.println("\n--- Student Found ---");
                s.showFinalResult();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Roll No " + searchRoll + " not found.");
        }
    }
}