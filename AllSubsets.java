import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AllSubsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrackSubsets(0, nums, new ArrayList<>(), res);
        return res;
    }
    private static void backtrackSubsets(int idx, int[] nums, List<Integer> cur, List<List<Integer>> res) {
        if (idx == nums.length) { res.add(new ArrayList<>(cur)); return; }
        // exclude
        backtrackSubsets(idx+1, nums, cur, res);
        // include
        cur.add(nums[idx]);
        backtrackSubsets(idx+1, nums, cur, res);
        cur.remove(cur.size()-1);
    }

    // Helper method to print 2D lists
    private static String listListToString(List<? extends Collection<?>> lists) {
        return lists.stream()
            .map(Object::toString)
            .collect(Collectors.joining(", ", "[", "]"));
    }
    public static void main(String[] args) {
        System.out.println("7. All Subsets");
        int[][] p7 = {{1,2},{1},{},{1,2,3},{0,1}};
        for (int[] arr : p7) System.out.printf("%s -> %s%n", Arrays.toString(arr), listListToString(subsets(arr)));
        System.out.println();
    }
}
