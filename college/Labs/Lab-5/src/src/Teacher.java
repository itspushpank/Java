public class Teacher extends Employee implements  Resume{

    double experience;
    String subject;
    String qualification;

    public Teacher(String name, String address, int age, String employID, double salary, String profession, double experience, String subject, String qualification) {
        super(name, address, age, employID, salary, profession);
        this.experience = experience;
        this.subject = subject;
        this.qualification = qualification;
    }

    public Teacher(){
        super();
        this.experience = 0.0;
        this.subject = "none";
        this.qualification = "none";

    }
    @Override
    public void buildResume(){
        System.out.println("======Resume======");
        System.out.println("Name :"+ name);
        System.out.println("Age :" + age);
        System.out.println("Profession :" + profession);
        System.out.println("Qualification :" + qualification);
        System.out.println("Subject :"+ subject);
        System.out.println("Experience :" + experience);
        System.out.println("Salary :" + salary);
    }
}
