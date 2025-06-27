package Assignment1;

class Employee {
    // Protected member variables
    protected int id;
    //protected int age;
    protected int age = (int) 35.5;// age = (int) 35.5; // Try to assign a double type value to an integer variable
    // emp.age = 35.5; // This line will cause a compile-time error
    // Correct the error by casting the double to int
    protected String name;
    protected boolean isPermanent;

    // Main method
    public static void main(String[] args) {
        System.out.println("Successfully started");
    }
}
