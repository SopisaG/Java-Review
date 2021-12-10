public class ShapesFormula {

    public static final double PI = 3.14427593;

    // Circumferrence of circle -> 2 * PI * radius

    public static double getCOfCircle(int radius) {
        return 2 * PI * radius;
    }

    public static double getAreaOfCircle(int radius) {
        return PI * (radius * radius);
    }

    public static double getSAreaOfSphere(int radius) {
        return 4 * PI * (radius * radius);
    }

    public static void main(String[] args) {
        System.out.println("Circumference: " + getCOfCircle(5));
        System.out.println("Area: " + getAreaOfCircle(5));
        System.out.println("Surface area: " + getSAreaOfSphere(5));
    }
}
