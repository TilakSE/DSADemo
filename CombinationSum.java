import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrackCombSum(0, candidates, target, new ArrayList<>(), res);
        return res;
    }
    private static void backtrackCombSum(int idx, int[] cand, int remain, List<Integer> cur, List<List<Integer>> res) {
        if (remain == 0) { res.add(new ArrayList<>(cur)); return; }
        if (idx == cand.length || remain < 0) return;
        for (int i=idx;i<cand.length;i++) {
            if (cand[i] > remain) break;
            cur.add(cand[i]);
            backtrackCombSum(i, cand, remain-cand[i], cur, res);
            cur.remove(cur.size()-1);
        }
    }

    // Helper method to nicely print arrays
    private static String arrToString(int[] arr) {
        return Arrays.toString(arr);
    }

    // Helper method to print 2D lists
    private static String listListToString(List<? extends Collection<?>> lists) {
        return lists.stream()
            .map(Object::toString)
            .collect(Collectors.joining(", ", "[", "]"));
    }

    public static void main(String[] args) {
        System.out.println("25. Combination Sum");
        int[][] cand25 = {{2,3,6,7},{2,3,5},{2},{1},{1,2}};
        int[] targ25 = {7,8,1,2,4};
        for (int i=0;i<cand25.length;i++) System.out.printf("%s target=%d -> %s%n", Arrays.toString(cand25[i]), targ25[i], combinationSum(cand25[i], targ25[i]));
        System.out.println();
    }
}
