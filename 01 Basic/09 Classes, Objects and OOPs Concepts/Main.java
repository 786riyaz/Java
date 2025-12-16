public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Hello World");

        System.out.println("\n" + "Creating New Object of Student Class");
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Riyaz";
        s1.display();
    }
}

class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID :: "+id + "\n" +"Name :: "+ name);
    }
}