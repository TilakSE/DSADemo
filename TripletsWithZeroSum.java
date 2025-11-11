import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsWithZeroSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1, r=nums.length-1;
            while (l<r) {
                int sum = nums[i]+nums[l]+nums[r];
                if (sum==0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l<r && nums[l]==nums[l+1]) l++;
                    while (l<r && nums[r]==nums[r-1]) r--;
                    l++; r--;
                } else if (sum<0) l++;
                else r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("19. Find Triplets with Zero Sum");
        int[][] p19 = {{-1,0,1,2,-1,-4},{0,0,0},{1,2,-2,-1},{-2,0,1,1,2},{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}};
        for (int[] arr : p19) System.out.printf("%s -> %s%n", Arrays.toString(arr), threeSum(arr));
        System.out.println();
    }
}
