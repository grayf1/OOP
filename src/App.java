public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Abstraction is to work with something we know how to use
        // without knowing how it works internally 

        Student student = new Student( "Faith", "Gray", "CHC");

        System.out.println(student.greeting());

        // write lines of code to create an UndergradStudent object
        // using the student object as the basis for creation. 
        // call the greeting, creditsRemaining and isMajorComplete methods
        // on the UndergradStudent object 
        UndergradStudent undergrad = new UndergradStudent(student.getFirstName(), student.getLastName(), 
        student.getSchoolName(),3.75, 40, "Computer Science");

        System.out.println(undergrad.greeting());
        System.out.println(undergrad.creditsRemaining(40));
        System.out.println(undergrad.isMajorComplete(40));
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
