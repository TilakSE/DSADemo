import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BoyerMooreExtension {
    public static List<Integer> majorityElementNby3(int[] nums) {
        Integer c1=null, c2=null;
        int cnt1=0, cnt2=0;
        for (int n : nums) {
            if (c1!=null && c1==n) cnt1++;
            else if (c2!=null && c2==n) cnt2++;
            else if (cnt1==0) { c1 = n; cnt1=1; }
            else if (cnt2==0) { c2 = n; cnt2=1; }
            else { cnt1--; cnt2--; }
        }
        List<Integer> res = new ArrayList<>();
        int cntA=0, cntB=0;
        for (int n : nums) {
            if (c1!=null && n==c1) cntA++;
            if (c2!=null && n==c2) cntB++;
        }
        if (c1!=null && cntA > nums.length/3) res.add(c1);
        if (c2!=null && !Objects.equals(c2,c1) && cntB > nums.length/3) res.add(c2);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("24. Elements appearing more than n/3 times");
        int[][] p24 = {{3,2,3},{1,1,1,3,3,2,2,2},{1,2},{1,2,3,4},{2,2,9,3,9,3,9,3,9}};
        for (int[] arr : p24) System.out.printf("%s -> %s%n", Arrays.toString(arr), majorityElementNby3(arr));
        System.out.println();
    }
}
