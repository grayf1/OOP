public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Abstraction is to work with something we know how to use
        // without knowing how it works internally 

        Student student = new Student(firstName: "Faith", lastName: "Gray", schoolName: "CHC");
        System.out.println(student.greeting());
    Integer one = 1;
    Double two = 2.4;
    String twoString = "2.0";
    Boolean bool = false;

    // strongly typed programming languages will attempt to determine the type for you
    System.out.println(one + two);
    System.out.println(one + twoString);

   // System.out.println(one + bool);
    
    }
}
