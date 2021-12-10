public class BasicMethods {
    public static void main(String[] args) {
        /**
         * Method is a block of code that can be executed by name
         * void
         * return type
         *
         * arguments(parameters) - the way we provide input of our method
         */

        BasicMethods obj = new BasicMethods();
        obj.print3Hello();

        String res = obj.getHello();
        System.out.println(res); // Hello

        System.out.println(obj.sum(7, 8));
        System.out.println(obj.sum(1, 2));
    }

    // (int i, int i2) - our method accepts two int arguments
    public int sum(int i, int i2) {
        return i + i2;
    }

    // String - return type.
    public String getHello() {

        return "Hello";
    }

    /**
     * public - access modifier
     * void - return type. In this case it's void so no return
     * print3Hello - name of the method
     * () - arguments of the method
     */

    public void print3Hello() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
