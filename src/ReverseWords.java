public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi"));
       // revWords("I am John Doe");

    }

    public static String revWords(String str){
       // StringBuilder reverseW = new StringBuilder();
        String reverseW = "";

        // split input string by "" space to get each word as String[]
        String[] words = str.split(" ");

        // loop over the array from back
        for(int i = words.length - 1; i >= 0; i--){
            // add words to reverseW with space
            reverseW += words[i] + " ";
           // reverseW.append(words[i]).append(" "); // reverseW.append(words[i] + " ");
        }
        // trim needed to remove last space in the end
        return reverseW.trim();
    }
}
