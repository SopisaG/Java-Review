public class BasicObj {
    public static void main(String[] args) {
        // Object is an instance(impl) of the class

        // new keyword is used to create an object
        Student student = new Student();
        student.printInfo();
        student.name = "John Doe";
        student.age = 25;
        student.course = "Java";

    }
}

// class is a template for its objects
class Student {
    public String name;
    public int age;
    public String course;

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
