public class arrMax {
    public static void main(String[] args) {

        int[] nums = {2, 3, 5, 1, 8};
        int totals = 5;
        System.out.println(getMax(nums , totals));
    }

    public static int getMax(int[] num, int total){
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num[total - 1];
    }
}

