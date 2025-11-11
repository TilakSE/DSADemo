import java.util.Arrays;

public class BoyerMooreVerify {
    public static Integer majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int n : nums) {
            if (count == 0) candidate = n;
            count += (n == candidate) ? 1 : -1;
        }
        // verify
        int occurrences = 0;
        for (int n : nums) if (n == candidate) occurrences++;
        return occurrences > nums.length/2 ? candidate : null;
    }

    public static void main(String[] args) {
        System.out.println("6. Majority Element");
        int[][] p6 = {{3,3,4,2,3,3,3},{1,2,3,4},{2,2,1,1,2,2},{5,5,5,5,5},{1,2,3,1,1}};
        for (int[] arr : p6) System.out.printf("%s -> %s%n", Arrays.toString(arr), String.valueOf(majorityElement(arr)));
        System.out.println();
    }
}
