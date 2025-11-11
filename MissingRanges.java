import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        long prev = (long)lower - 1;
        for (int i=0;i<=nums.length;i++) {
            long cur = (i<nums.length) ? nums[i] : (long)upper + 1;
            if (cur - prev >= 2) {
                res.add(formatRange(prev+1, cur-1));
            }
            prev = cur;
        }
        return res;
    }
    private static String formatRange(long a, long b) {
        return a==b ? String.valueOf(a) : a + "->" + b;
    }

    public static void main(String[] args) {
        System.out.println("12. Find Missing Ranges");
        int[][] p12 = {{1,3,5},{2,4},{},{1,2,3},{1,5}};
        int[] low12 = {1,1,1,1,1}, high12 = {5,5,3,3,5};
        for (int i=0;i<p12.length;i++) System.out.printf("%s lower=%d upper=%d -> %s%n", Arrays.toString(p12[i]), low12[i], high12[i], findMissingRanges(p12[i], low12[i], high12[i]));
        System.out.println();
    }
}
