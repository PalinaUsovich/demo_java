package Practise;

public class Person1 extends Student {

    public Person1(String name, String education, int age, int studentID, String computerType) {
        super(name, education, age, studentID, computerType);
    }

    @Override
    public void attendance() {

       // super.attendance();
    }

    public void proactive() {
        super.proactive();
    }

    @Override
    public void punctuality() {
        super.punctuality();
    }


    public static void main(String[] args) {
        Person1 person1 = new Person1("Palina", "High education", 24, 1234, "MacBook");
        System.out.println(person1.getName());
        person1.attendance();
        person1.attendance(5);
        person1.proactive();
        person1.punctuality();
        Person1 person2 = new Person1("Steve", "high school", 20, 1222, "windows");
        System.out.println(person2.getName());
        person2.proactive();
        person2.punctuality();
        person2.attendance();
    }
}
