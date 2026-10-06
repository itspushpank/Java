//There is an interface named "Exam" that contains an abstract class called "ConductExam". The interface has a default method named "guidelines", which contains some examination guidelines, and a static method named "display".
//
//The interface is implemented by two classes: "OnlineExam" and "OfflineExam".
//
//For the student’s fee calculation, the regular subject fee is ₹100 per subject. The program also asks whether the student has any back papers. If the student has back papers, an additional fee of ₹200 is charged per back-paper subject.

//Finally, the program prints a fee receipt containing the student’s name, registration number, semester (3rd semester), and the total fee, including the back-paper charges.

import java.util.Scanner;

public  class Main {

    static void main() {
        Scanner s = new Scanner(System.in);
        Exam.display();
        System.out.println("Enter Choice for Mode of Examination:");
        int choice = s.nextInt();
        switch (choice){
            case 1:
                System.out.println("OFFLINE EXAM");
                OfflineExam offline = new OfflineExam();
                offline.guidelines();
                offline.stdinfo();
                offline.conductExam();
                offline.displayFees();
                break;
            case 2:
                System.out.println("ONLINE EXAM");
                OnlineExam online = new OnlineExam();
                online.guidelines();
                online.stdinfo();
                online.conductExam();
                online.displayFees();
                break;
            default:
                System.out.println("Invalid choice!!");
        }

    }

//



}