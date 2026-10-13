public class Main {
    static void main() {
        Teacher t1 = new Teacher();
        t1.buildResume();

        Teacher t2 = new Teacher("RamKumar","Maheshkhunt,Khagaria",48,"xp23451",100000.0,"SeniorProfessor",12.5,"webDevelopment","Ph.D");
        t2.buildResume();

        Student s1 = new Student();
        s1.buildResume();

        Student s2 = new Student("Mohan Kumar","hardiyal nagar banni",12,6,"Doon public school",8.9);
        s2.buildResume();
    }
}