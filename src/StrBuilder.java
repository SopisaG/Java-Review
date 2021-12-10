public class StrBuilder {
    public static void main(String[] args) {
        //StringBuilder is mutable class to represent
        // sequence of chars between double quotes

        //String vs StringBuilder
        StringBuilder sb = new StringBuilder("apple");
        sb.append(" is green");
        System.out.println(sb);  // apple is green

        // If we change String value m,any times it's better to use StringBuilder

        StringBuilder strB = new StringBuilder();
        for(int i = 1; i <= 100; i++) {
            strB.append(i);
        }
        System.out.println(strB);

    }
}
