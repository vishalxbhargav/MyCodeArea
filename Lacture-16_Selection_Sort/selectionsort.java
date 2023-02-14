public class selectionsort {
    public static void main(String[] args) {
        int nums[] = { 1, 5, 8, 2, 9, 3, 1, 45, 10, 6 };
        for (int i = 0; i < nums.length-1; i++) {
            int minindex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minindex] > nums[j])
                    minindex = j;
            }
            int temp = nums[minindex];
            nums[minindex] = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }
    }
}
