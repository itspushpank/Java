public class Employee extends Person{

    String employID;
    double salary;
    String profession;

    public Employee(String name, String address, int age, String employID, double salary, String profession) {
        super(name, address, age);
        this.employID = employID;
        this.salary = salary;
        this.profession = profession;
    }

    public Employee() {
        super();
        this.employID = "xyz123";
        this.salary = 00000.0;
        this.profession = "none";
    }
}
