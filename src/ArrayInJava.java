public class ArrayInJava {
    public static void main(String[] args) {
        // Array is fixed size collection of data of the same type
        // Array can work with primitives and objects

        int[] nums = new int[5];
        // we access each element  of array by using index
        // index starts from 0

        nums[0] = 99;
        nums[4] = 7;

        int sizeOfArray = nums.length;
        System.out.println(sizeOfArray);
    }
}
