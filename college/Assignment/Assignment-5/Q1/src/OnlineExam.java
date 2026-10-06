import  java.util.Scanner;
public class OnlineExam implements Exam{

    String name;
    int reg;
    int rSubjects;
    int bSubjects;

    public void stdinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        name = sc.next();
        System.out.println("Enter the registration no :");
        reg = sc.nextInt();

    }


    @Override
    public void conductExam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Regular  subjects.");
        rSubjects = sc.nextInt();
        System.out.println("Enter the no of Backlog subjects.");
        bSubjects = sc.nextInt();

    }

    public void displayFees(){
        System.out.println("====Online Examination Fees Receipt====");
        System.out.println("Name :"+name);
        System.out.println("Reg :"+reg);
        System.out.println("Back-paper fees :" + (bSubjects * 200));
        System.out.println("Total fees :" + (rSubjects * 100 + bSubjects * 200));
    }
}
