class Student {
    protected int rollNumber;
    protected String studentName;
    protected String address;

    Student(int rollNumber, String studentName, String address) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.address = address;
    }

    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    void setAddress(String address) {
        this.address = address;
    }

    int getRollNumber() {
        return rollNumber;
    }

    String getStudentName() {
        return studentName;
    }

    String getAddress() {
        return address;
    }

    void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Address: " + address);
    }
}

class Test extends Student {
    protected int osMarks;
    protected int dsMarks;
    protected int javaMarks;
    protected int mathMarks;
    protected int deMarks;

    Test(int rollNumber, String studentName, String address) {
        super(rollNumber, studentName, address);
    }

    void inputMarks(int os, int ds, int java, int math, int de) {
        this.osMarks = os;
        this.dsMarks = ds;
        this.javaMarks = java;
        this.mathMarks = math;
        this.deMarks = de;
    }

    void displayMarks() {
        System.out.println("Subject Marks:");
        System.out.println("OS: " + osMarks);
        System.out.println("DS: " + dsMarks);
        System.out.println("Java: " + javaMarks);
        System.out.println("Math: " + mathMarks);
        System.out.println("DE: " + deMarks);
    }

    int getTotalAcademicMarks() {
        return osMarks + dsMarks + javaMarks + mathMarks + deMarks;
    }
}

interface Sports {
    int SPORTS_WEIGHTAGE = 50;

    void displaySportsScore();
}

class Result extends Test implements Sports {
    private int sportsScore;
    private int grandTotal;

    Result(int rollNumber, String studentName, String address) {
        super(rollNumber, studentName, address);
        this.sportsScore = SPORTS_WEIGHTAGE;
    }

    void setSportsScore(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    @Override
    public void displaySportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }

    public void calculateGrandTotal() {
        this.grandTotal = getTotalAcademicMarks() + sportsScore;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void displayReportCard() {
        displayStudentInfo();
        displayMarks();
        displaySportsScore();
        System.out.println("Grand Total: " + grandTotal);
        System.out.println("----------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Result[] students = new Result[5];

        students[0] = new Result(101, "Alice Johnson", "123 Main St, City A");
        students[0].inputMarks(85, 90, 88, 92, 87);
        students[0].calculateGrandTotal();

        students[1] = new Result(102, "Bob Smith", "456 Oak Ave, City B");
        students[1].inputMarks(78, 82, 79, 85, 80);
        students[1].calculateGrandTotal();

        students[2] = new Result(103, "Carol Davis", "789 Pine Rd, City C");
        students[2].inputMarks(92, 88, 95, 90, 93);
        students[2].calculateGrandTotal();

        students[3] = new Result(104, "David Wilson", "321 Elm Blvd, City D");
        students[3].inputMarks(70, 75, 72, 68, 74);
        students[3].calculateGrandTotal();

        students[4] = new Result(105, "Eva Brown", "654 Maple Dr, City E");
        students[4].inputMarks(88, 91, 89, 87, 90);
        students[4].calculateGrandTotal();

        System.out.println("========================================");
        System.out.println("       STUDENT REPORT CARDS");
        System.out.println("========================================\n");

        for (Result student : students) {
            student.displayReportCard();
        }
    }
}