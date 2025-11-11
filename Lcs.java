import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lcs {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int best = 0;
        for (int n : set) {
            if (!set.contains(n-1)) {
                int cur = n;
                int len = 1;
                while (set.contains(cur+1)) { cur++; len++; }
                best = Math.max(best, len);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println("5. Longest Consecutive Sequence");
        int[][] p5 = {{100,4,200,1,3,2},{1,9,3,10,4,20,2},{5,6,7,8,9},{10,30,20},{1,2,0,1}};
        for (int[] arr : p5) System.out.printf("%s -> %d%n", Arrays.toString(arr), longestConsecutive(arr));
        System.out.println();
    }
}
