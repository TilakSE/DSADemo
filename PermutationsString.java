import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class PermutationsString {
    public static List<String> permutations(String s) {
        List<String> res = new ArrayList<>();
        permute(s.toCharArray(), 0, res);
        // remove duplicates while preserving order
        return new ArrayList<>(new LinkedHashSet<>(res));
    }
    private static void permute(char[] arr, int idx, List<String> res) {
        if (idx == arr.length) { res.add(new String(arr)); return; }
        for (int i=idx;i<arr.length;i++) {
            swap(arr, i, idx);
            permute(arr, idx+1, res);
            swap(arr, i, idx);
        }
    }
    private static void swap(char[] a, int i, int j) {
        char t=a[i]; a[i]=a[j]; a[j]=t;
    }

    // 22. Longest Increasing Subsequence (length) - patience sorting
    public static int lengthOfLIS(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        List<Integer> tails = new ArrayList<>();
        for (int x : nums) {
            int i = Collections.binarySearch(tails, x);
            if (i < 0) i = - (i+1);
            if (i == tails.size()) tails.add(x);
            else tails.set(i, x);
        }
        return tails.size();
    }

    public static void main(String[] args) {
        System.out.println("21. All Permutations of a String");
        String[] p21 = {"abc","a","ab","aaa","abcd"};
        for (String s : p21) System.out.printf("%s -> %s%n", s, permutations(s));
        System.out.println();

    }
}
