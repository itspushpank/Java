public class Person {

    String name;
    String address;
    int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person() {
        this.name= "Unknown";
        this.age = -1;
        this.address = "Not found";
    }
}
