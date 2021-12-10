public class BasicVar {
    public static void main(String[] args) {
        //public String firstNAme; this is instance variable
        // variable is container that can hold piece of data

        /*
        String - variable type
        color - name
        "red" - value
         */

        String color = "red";
        System.out.println(color); // red

        // scope of variables
        int num = 99;

        if(7 > 9){
            System.out.println(num);
            int num2 = 89;
        }
        // System.out.println(num2); doesn't compile

        //there are 3 type of variables in java
        // 1. Local variables
        //  - they are declared inside the methods or statements
        //  - they cannot have access modifiers
        //  - they don't have default values
        // 2. Instance variables
        //  - they are class level variables
        //  - they will be the properties of the object that will be created from this class
        //  - Person per = new Person(); {firstName = null, age = 0}
        // they can have access modifiers
        // 3. Static variables
        //  - class level variables
        //  - they belong to the class not to specific object
        // Person per = new Person(); {firstName = null, age = 0}
        //  - We use static variables be class name
        // Person.address = "101 Main St";
    }
}

class Person{
    public String firstName;
    public int age;
    public static String address;
}
