public class ConvertStrToNum {
    public static void main(String[] args) {
        String strNum = "123";
        int num = Integer.parseInt(strNum);
        System.out.println(num);

        System.out.println("------");
        //num to String
        int num1 = 99;
        // 1. Concatenate with String
        String str = num1 + "";   // "99"

        // 2. valueOf method of String
        str = String.valueOf(num1);
    }
}
