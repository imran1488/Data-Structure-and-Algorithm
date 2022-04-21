class Student {
    String name;
    int age;

    Student() {

    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        s2.printInfo();
        System.out.println("This is the age defined by Constructor " + s2.name + " " + s2.age);
    }
}

public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 34;
        s1.printInfo();
        Student s2 = new Student(s1);
    }
}
