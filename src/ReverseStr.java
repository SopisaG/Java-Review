public class ReverseStr {
    public static void main(String[] args) {
        reverseStr("apple");
        System.out.println(reverseStr("apple"));
    }

    public static String reverseStr(String str){
        // create variable to store reversed version of str
        StringBuilder reverse = new StringBuilder();
       // String reverse = "";

        // iterate over input string from the back with charAt
        for(int i = str.length() - 1; i >= 0; i--){
            // add chars to reverse variable
            reverse.append(str.charAt(i));
            //reverse += str.charAt(i);
        }
        //convert to string and return reversed version
        return reverse.toString();
    }
}
