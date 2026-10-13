public class Student extends Person implements Resume{

    int standerd;
    String school;
    double grade;

    public Student(String name, String address, int age, int standerd, String school, double grade) {
        super(name, address, age);
        this.standerd = standerd;
        this.school = school;
        this.grade = grade;
    }

    public Student() {
        super();
        this.standerd = 0;
        this.school = "none";
        this.grade = 0.0;
    }

    @Override
    public void buildResume() {
        System.out.println("\n\n======Resume======");
        System.out.println("Name :"+ name);
        System.out.println("Age :" + age);
        System.out.println("Grade :" + grade);
        System.out.println("Class :" + standerd);
        System.out.println("School :" + school);


    }
}
