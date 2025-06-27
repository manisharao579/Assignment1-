package Assignment1;

public class Rectangle
{
    double width;
    double height;
    enum Color// Enum for color
    {
        RED, GREEN, BLUE
    }
    Color boxColor; // Member variable for color
    public static void main(String[] args) {
        System.out.println(Color.BLUE);// Print the enum Color.BLUE
    }
}
