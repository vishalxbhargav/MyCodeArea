public class reversearray {
    public static void reverseInt(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void reverseStr(char nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            char temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 8, 1, 2, 25, 30, 7, 19, 2 };
        String str="vishalbhargav";
        char[] arr = str.toCharArray();

        reverseInt(nums);
        reverseStr(arr);

    }
}
